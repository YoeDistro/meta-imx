FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG[rdp] = ",,"

INI_UNCOMMENT_ASSIGNMENTS = " \
    ${@bb.utils.contains('PACKAGECONFIG', 'rdp', 'modules=screen-share.so', '', d)}"
INI_UNCOMMENT_ASSIGNMENTS:append:mx9-nxp-bsp  = " \
    repaint-window=16"
INI_UNCOMMENT_ASSIGNMENTS:append:mx93-nxp-bsp = " \
    use-g2d=1"

update_file() {
    if ! grep -q "$1" $3; then
        bbfatal $1 not found in $3
    fi
    sed -i -e "s,$1,$2," $3
}

do_install:append() {
    # Add weston.log back, used by NXP for testing
    update_file "ExecStart=/usr/bin/weston " "ExecStart=/usr/bin/weston --log=\$\{XDG_RUNTIME_DIR\}/weston.log " ${D}${systemd_system_unitdir}/weston.service

    # FIXME: weston should be run as weston, not as root
    update_file "User=weston" "User=root" ${D}${systemd_system_unitdir}/weston.service
    update_file "Group=weston" "Group=root" ${D}${systemd_system_unitdir}/weston.service

    if [ "${@bb.utils.contains('PACKAGECONFIG', 'rdp', 'yes', 'no', d)}" = "yes" ]; then
        sed -i -e "s|^command=${bindir}/weston .*|& --rdp-tls-cert=${sysconfdir}/freerdp/keys/server.crt --rdp-tls-key=${sysconfdir}/freerdp/keys/server.key|" ${D}${sysconfdir}/xdg/weston/weston.ini
    fi
}

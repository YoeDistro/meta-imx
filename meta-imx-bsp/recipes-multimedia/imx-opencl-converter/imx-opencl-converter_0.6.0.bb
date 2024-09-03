# Copyright 2023-2024 NXP
DESCRIPTION = "NXP Multimedia opencl converter lib"
LICENSE = "Proprietary"
SECTION = "multimedia"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837" 
DEPENDS = "virtual/opencl-icd"

SRC_URI = "${FSL_MIRROR}/${BP}-${IMX_SRCREV_ABBREV}.bin;fsl-eula=true"
IMX_SRCREV_ABBREV = "dc929f3"

SRC_URI[sha256sum] = "ddea279a671fe39062fbb31eb6447d072f8936d3ddc9d6b9a55f0fb40e0687b9"

S = "${WORKDIR}/${BP}-${IMX_SRCREV_ABBREV}"
inherit fsl-eula-unpack autotools pkgconfig meson

FILES:${PN} += "${datadir}/"

COMPATIBLE_MACHINE               = "(^$)"
COMPATIBLE_MACHINE:imxgpu        = "(mx8-nxp-bsp|mx95-nxp-bsp)"
COMPATIBLE_MACHINE:mx8mm-nxp-bsp = "(^$)"

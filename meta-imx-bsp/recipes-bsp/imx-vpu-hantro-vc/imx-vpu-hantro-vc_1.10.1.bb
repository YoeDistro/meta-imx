# Copyright 2019-2024 NXP

DESCRIPTION = "i.MX VC8000E encoder library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ca53281cc0caa7e320d4945a896fb837" 

SRC_URI[sha256sum] = "b8a1d59e6dbd23523cb71cd00e74d2a7086a2fda1a8a827966a4a004ef814940"
IMX_SRCREV_ABBREV = "5b0155f"

inherit fsl-eula2-unpack2 fsl-eula-recent

COMPATIBLE_MACHINE = "(mx8mp-nxp-bsp)"

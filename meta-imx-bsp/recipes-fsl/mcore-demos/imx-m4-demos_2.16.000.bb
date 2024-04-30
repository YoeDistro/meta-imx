# Copyright 2017-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-mcore-demos.inc

LIC_FILES_CHKSUM:mx7ulp-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx8mm-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"
LIC_FILES_CHKSUM:mx8mq-nxp-bsp = "file://COPYING;md5=10c0fda810c63b052409b15a5445671a"

SRC_URI[imx7ulp.md5sum] = "f971b57a6787adf24bf1135b69847c65"
SRC_URI[imx7ulp.sha256sum] = "1fbb26f8e0a69a2e3925e07cf0cc4a13b13e3ff6321a2ba3dc39c454c82b398b"

SRC_URI[imx8mm.md5sum] = "4e70a7812104fab3cbdbb4dbca8509d2"
SRC_URI[imx8mm.sha256sum] = "e4173ada932bbf1628b2cb219db2ce93577c47f66bad29714ddb9e008f986409"

SRC_URI[imx8mq.md5sum] = "e6da3b5fda929ac6989c7aa7633a9ab6"
SRC_URI[imx8mq.sha256sum] = "09b7195ce553dae5808afcefaf6f76c79f7122ce4dd31fabd679b768607dea25"

COMPATIBLE_MACHINE = "(mx7ulp-nxp-bsp|mx8mm-nxp-bsp|mx8mq-nxp-bsp)"

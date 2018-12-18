SUMMARY = "A modern formatting library"
DESCRIPTION = "fmt is an open-source formatting library for C++. It can  \
be used as a safe and fast alternative to (s)printf and IOStreams."
HOMEPAGE = "http://fmtlib.net"

SECTION = "libs"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=c2e38bc8629eac247a73b65c1548b2f0"

SRC_URI = " \
    git://github.com/fmtlib/fmt;protocol=https \
"
SRCREV = "398343897f98b88ade80bbebdcbe82a36c65a980"
S = "${WORKDIR}/git"

inherit cmake

FILES_${PN}-dev += "${libdir}/cmake"
RDEPENDS_${PN}-dev = ""

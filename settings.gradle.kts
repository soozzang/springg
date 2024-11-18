plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "springg"
include("module-batch")
include("module-api")
include("module-common")
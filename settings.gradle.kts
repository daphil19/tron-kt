pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
//        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(":tron-kt")

rootProject.name = "tron-kt"

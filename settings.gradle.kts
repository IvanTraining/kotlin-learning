pluginManagement {
    includeBuild("plugins")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

plugins {
    // Use the Foojay Toolchains plugin to automatically download JDKs required by subprojects.
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
rootProject.name = "202608-ok-marketplace"

includeBuild("m1l1-first")
includeBuild("academic-modules")
includeBuild("project-modules")

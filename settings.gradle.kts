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

includeBuild("academic-modules")
includeBuild("project-modules")
include("m1l1-first")
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

includeBuild("m1l1-first")
includeBuild("academic-modules")
includeBuild("project-modules")

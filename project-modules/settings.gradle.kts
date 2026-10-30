pluginManagement {
    includeBuild("../plugins")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "project-modules"

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
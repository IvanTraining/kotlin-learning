pluginManagement {
    // Тут указываю Gradle, где искать кастомные плагины
    includeBuild("../plugins")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "academic-modules"

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
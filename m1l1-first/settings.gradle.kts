rootProject.name = "m1l1-first"

pluginManagement {
    // Указываю путь к сборке плагинов
    includeBuild("../plugins")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            // Указываю путь к каталогу версий в корне
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
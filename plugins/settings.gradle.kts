rootProject.name = "plugins"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            // путь к общему файлу каталога версий
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

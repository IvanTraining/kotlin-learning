plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        register("build-docker") {
            id = "build-docker"
            implementationClass = "ru.recipebook.plugin.DockerPlugin"
        }
    }
}

repositories {
    mavenCentral()
}

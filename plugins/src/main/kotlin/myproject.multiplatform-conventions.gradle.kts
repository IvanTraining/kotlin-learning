import org.gradle.api.artifacts.VersionCatalogsExtension

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    jvm()
}
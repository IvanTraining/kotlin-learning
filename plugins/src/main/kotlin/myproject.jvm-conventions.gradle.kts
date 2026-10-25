import org.gradle.api.artifacts.VersionCatalogsExtension

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")

plugins {
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    // Теперь эти имена совпадают с ключами в libs.versions.toml
    implementation(libs.findLibrary("kotlin-stdlib").get())
    testImplementation(libs.findLibrary("kotlin-test").get())
}
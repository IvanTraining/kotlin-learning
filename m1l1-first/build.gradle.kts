plugins {
    // Подключаем плагин Kotlin JVM через каталог версий
    alias(libs.plugins.kotlin.jvm)
}

dependencies {
    // Используем библиотеки из каталога версий
    implementation(libs.kotlin.stdlib)
    testImplementation(libs.kotlin.test)
}
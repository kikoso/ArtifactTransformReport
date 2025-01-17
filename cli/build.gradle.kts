

plugins {
    kotlin("jvm") version "1.9.21"
    application
    id("io.github.cdsap.fatbinary") version "1.0"
    id("org.jlleitschuh.gradle.ktlint") version "11.5.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("io.github.cdsap.artifacttransform.cli.MainKt")
}

fatBinary {
    mainClass = "io.github.cdsap.artifacttransform.cli.Main"
    name = "artifacttransform"
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation(project(":library"))
    implementation("org.slf4j:slf4j-simple:1.6.1")
    implementation("com.jakewharton.picnic:picnic:0.6.0")
    implementation("com.github.ajalt.clikt:clikt:3.5.0")
    implementation("org.nield:kotlin-statistics:1.2.1")
    implementation("com.google.code.gson:gson:2.8.9")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

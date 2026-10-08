plugins {
    kotlin("jvm") version "1.9.20"
    application
}

group = "com.englishlearning"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin Standard Library
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
}

application {
    mainClass.set("com.englishlearning.MainKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

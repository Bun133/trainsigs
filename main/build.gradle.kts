plugins {
    id("java")
    kotlin("jvm") version "1.8.21"
}

group = "com.github.bun133"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib"))
}

tasks.test {
    useJUnitPlatform()
}
plugins {
    id("java")
    id("java-library")
    id("scala")
}

group = "org.example"
version = "1.0-SNAPSHOT"

val quantumVoxelVersion = "0.1.0-alpha.2026.06.16"

repositories {
    mavenCentral()
    maven("https://maven.ultreon.dev/releases")
    maven("https://maven.ultreon.dev/snapshots")

    mavenLocal()
}

sourceSets {
    create("client") {
        compileClasspath += sourceSets.main.get().output
        runtimeClasspath += sourceSets.main.get().output
    }
}

dependencies {
    "clientImplementation"(libs.quantumvoxel.client)
    api(libs.quantumvoxel.server)
    api(libs.quantumvoxel.gameprovider)

    implementation(libs.fabric.language.scala)
}
tasks.processResources {
    inputs.property("version", project.version)
    inputs.property("quantumvoxel_version", libs.quantumvoxel.client.get().version)

    filesMatching("fabric.mod.json") {
        expand(mutableMapOf(
            "version" to project.version,
            "quantumvoxel_version" to libs.quantumvoxel.client.get().version
        ))
    }
}

tasks.jar {
    from(sourceSets.named("client").get().output)
}

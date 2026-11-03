plugins {
    id("java")
    id("java-library")
    id("scala")
    id("net.quantumvoxel.photon") version "0.1.0-SNAPSHOT"
}

group = "org.example"
version = "1.0-SNAPSHOT"

photon {
    gameVersion = "0.1.0-alpha.2026.11.03"
    splitClientSources = true
    generateSources = true
    generateJavadoc = true
}

dependencies {
    include(api("org.scala-lang:scala-library:2.13.17")!!)
    include(api("org.scala-lang:scala-compiler:2.13.17")!!)
    include(api("org.scala-lang:scala-reflect:2.13.17")!!)
}

scala {
    scalaVersion = "2.13.17"
}



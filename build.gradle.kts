plugins {
  java
  id("fabric-loom") version "0.10-SNAPSHOT" apply false
  id("org.jetbrains.kotlin.jvm") version ("1.6.0")
  id("org.jetbrains.kotlin.plugin.serialization")version ("1.6.0")
  id("com.github.johnrengelman.shadow")version ("7.1.0")
  id("io.itsusinn.pkg") version "1.2.0"
}
allprojects {
  group = property("maven_group")!!
  version = property("mod_version")!!
  repositories {
    mavenCentral()
    maven("https://jitpack.io")
    mavenLocal()
    maven("https://maven.fabricmc.net/")
  }
}

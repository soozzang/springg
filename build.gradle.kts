plugins {
	java
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25" apply false
	id("org.springframework.boot") version "3.3.5" apply false
	id("io.spring.dependency-management") version "1.1.6" apply false
}

allprojects {
	group = "com.exciting"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}
}

subprojects {
	apply(plugin = "org.springframework.boot")
	apply(plugin = "kotlin")
	apply(plugin = "kotlin-kapt")
	apply(plugin = "org.jetbrains.kotlin.jvm")

	dependencies {
//		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//		implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
//		implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
	}

	tasks.test {
		useJUnitPlatform()
	}
}

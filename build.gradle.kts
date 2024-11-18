plugins {
	java
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25" apply false
	id("org.springframework.boot") version "3.3.5" apply false
	id("io.spring.dependency-management") version "1.1.6" apply false
//	kotlin("plugin.jpa") version "1.9.25" apply false
}

allprojects {
	group = "com.exciting"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

//	java {
//		toolchain {
//			languageVersion = JavaLanguageVersion.of(21)
//		}
//	}
//
//	configurations {
//		compileOnly {
//			extendsFrom(configurations.annotationProcessor.get())
//		}
//	}
//
//	kotlin {
//		compilerOptions {
//			freeCompilerArgs.addAll("-Xjsr305=strict")
//		}
//	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}

subprojects {
	apply(plugin = "org.springframework.boot")
	apply(plugin = "kotlin")
	apply(plugin = "kotlin-kapt")

	dependencies {
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
//		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		compileOnly("org.projectlombok:lombok")
		annotationProcessor("org.projectlombok:lombok")

		implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
		implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
	}
}

plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "3.1.7"
  kotlin("plugin.spring") version "1.4.32"
}

configurations {
  testImplementation { exclude(group = "org.junit.vintage") }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-security")
  implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")

  implementation("org.springframework.cloud:spring-cloud-starter-aws-messaging:2.2.6.RELEASE")

  implementation("io.micrometer:micrometer-registry-prometheus")
  implementation("io.micrometer:micrometer-core")

  implementation("org.springdoc:springdoc-openapi-ui:1.5.6")
  implementation("org.springdoc:springdoc-openapi-data-rest:1.5.6")
  implementation("org.springdoc:springdoc-openapi-kotlin:1.5.6")

  testImplementation("com.github.tomakehurst:wiremock-standalone:2.27.2")
  testImplementation("org.awaitility:awaitility-kotlin:4.0.3")
  testImplementation("net.javacrumbs.json-unit:json-unit-assertj:2.25.0")
  testImplementation("com.google.code.gson:gson:2.8.6")
}

tasks {
  compileKotlin {
    kotlinOptions {
      jvmTarget = "15"
    }
  }
}

plugins {
    java
    "com.github.spotbugs"
    id("checkstyle")
    "org.owasp.dependencycheck"
    id("pmd")
    id("jacoco")
}

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        implementation("org.apache.commons:commons-text:1.9")
    }

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.test {
    useJUnitPlatform()
}

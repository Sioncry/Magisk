@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
rootProject.name = "Magisk"
include(":app", ":app:shared", ":native", ":stub")
https://github.com/topjohnwu/Magisk/blob/c8990b0f688b52ee7eb2f42a9dd711b0024fac09/settings.gradle.kts

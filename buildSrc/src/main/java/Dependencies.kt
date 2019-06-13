
import org.gradle.api.artifacts.dsl.RepositoryHandler
import java.net.URI

/**
 * Created by idisfkj on 2019/5/29.
 * Email : idisfkj@gmail.com.
 */
object Versions {
    const val support = "28.0.0"
    const val kotlin = "1.3.31"
    const val constraint_layout = "1.1.0-beta6"
    const val runner = "1.0.1"
    const val espresso_core = "3.0.1"
    const val junit = "4.12"
    const val gradle = "3.4.1"
    const val target_sdk = 28
    const val min_sdk = 16
    const val build_tools = "28.0.3"
}

object Dependencies {
    val app_compat = "com.android.support:appcompat-v7:${Versions.support}"
    val recyclerView = "com.android.support:recyclerview-v7:${Versions.support}"
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val junit = "junit:junit:${Versions.junit}"
    val constraint_layout = "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"
    val runner = "com.android.support.test:runner:${Versions.runner}"
    val espresso_core = "com.android.support.test.espresso:espresso-core:${Versions.espresso_core}"
    val gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle}"
    val addRepos: (handler: RepositoryHandler) -> Unit = {
        it.google()
        it.jcenter()
        it.maven { url = URI("https://oss.sonatype.org/content/repositories/snapshots") }
    }
}

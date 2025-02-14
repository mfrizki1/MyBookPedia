package id.calocallo.mybookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import id.calocallo.mybookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "MyBookPedia",
        ) {
            App()
        }
    }
}
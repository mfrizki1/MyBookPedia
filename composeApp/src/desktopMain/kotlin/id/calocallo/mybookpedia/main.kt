package id.calocallo.mybookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyBookPedia",
    ) {
        App()
    }
}
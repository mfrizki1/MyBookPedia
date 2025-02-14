package id.calocallo.mybookpedia

import androidx.compose.ui.window.ComposeUIViewController
import id.calocallo.mybookpedia.app.App
import id.calocallo.mybookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }
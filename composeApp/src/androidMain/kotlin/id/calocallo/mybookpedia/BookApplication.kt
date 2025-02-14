package id.calocallo.mybookpedia

import android.app.Application
import id.calocallo.mybookpedia.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class BookApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
        androidContext(this@BookApplication)
        }
    }

}
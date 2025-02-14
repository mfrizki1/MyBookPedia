package id.calocallo.mybookpedia.di

import id.calocallo.mybookpedia.book.data.network.KtorRemoteBookDataSource
import id.calocallo.mybookpedia.book.data.network.RemoteBookDataSource
import id.calocallo.mybookpedia.book.data.repository.DefaultBookRepository
import id.calocallo.mybookpedia.book.domain.BookRepository
import id.calocallo.mybookpedia.book.presentation.book_list.BookListViewModel
import id.calocallo.mybookpedia.book.presentation.book_list.SelectedBookViewModel
import id.calocallo.mybookpedia.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule : Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
    viewModelOf(::SelectedBookViewModel)
}
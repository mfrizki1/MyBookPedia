package id.calocallo.mybookpedia

import androidx.compose.runtime.*
import id.calocallo.mybookpedia.book.presentation.book_list.BookListScreenRoot
import id.calocallo.mybookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    val viewModel = koinViewModel<BookListViewModel>()
    BookListScreenRoot(
        viewModel = viewModel,
        onBookClick = {},
    )
}

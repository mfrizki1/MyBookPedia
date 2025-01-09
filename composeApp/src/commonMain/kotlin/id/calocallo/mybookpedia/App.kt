package id.calocallo.mybookpedia

import androidx.compose.runtime.*
import id.calocallo.mybookpedia.book.presentation.book_list.BookListScreenRoot
import id.calocallo.mybookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {},
    )
}

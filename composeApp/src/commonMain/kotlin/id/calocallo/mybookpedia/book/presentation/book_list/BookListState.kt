package id.calocallo.mybookpedia.book.presentation.book_list

import id.calocallo.mybookpedia.book.domain.Book
import id.calocallo.mybookpedia.core.presentation.UIText


data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResult: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UIText? = null
)
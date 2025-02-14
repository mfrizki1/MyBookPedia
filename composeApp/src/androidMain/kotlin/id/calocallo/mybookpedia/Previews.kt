package id.calocallo.mybookpedia

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import id.calocallo.mybookpedia.book.domain.Book
import id.calocallo.mybookpedia.book.presentation.book_list.BookListScreen
import id.calocallo.mybookpedia.book.presentation.book_list.BookListState

/*@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier =
            Modifier
                .fillMaxWidth()
                .background(Color.White),
    ) {
        BookSearchBar(
            searchQuery = "Java",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth(),
        )
    }
}*/

private val books =
    (1..100).map {
        Book(
            id = it.toString(),
            title = "Book $it",
            imageUrl = "https://test.com",
            authors = listOf("TEST"),
            description = null,
            languages = emptyList(),
            firstPublishYear = null,
            averageRating = 4.6789,
            ratingCount = 5,
            numPages = 100,
            numEditions = 3,
        )
    }

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state =
            BookListState(
                searchResult = books,
            ),
        onAction = {},
    )
}

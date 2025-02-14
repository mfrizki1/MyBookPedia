package id.calocallo.mybookpedia.book.domain

import id.calocallo.mybookpedia.core.domain.DataError
import id.calocallo.mybookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}
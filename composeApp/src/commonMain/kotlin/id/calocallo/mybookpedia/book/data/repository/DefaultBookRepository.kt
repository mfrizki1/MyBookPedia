package id.calocallo.mybookpedia.book.data.repository

import id.calocallo.mybookpedia.book.data.mapper.toBook
import id.calocallo.mybookpedia.book.data.network.RemoteBookDataSource
import id.calocallo.mybookpedia.book.domain.Book
import id.calocallo.mybookpedia.book.domain.BookRepository
import id.calocallo.mybookpedia.core.domain.DataError
import id.calocallo.mybookpedia.core.domain.Result
import id.calocallo.mybookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteDataSource: RemoteBookDataSource
) : BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteDataSource.searchBooks(query).map { dto ->
            dto.results.map { it.toBook() }
        }
    }
}
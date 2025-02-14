package id.calocallo.mybookpedia.book.data.network

import id.calocallo.mybookpedia.book.data.dto.SearchBookResponseDto
import id.calocallo.mybookpedia.core.domain.DataError
import id.calocallo.mybookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null,
    ): Result<SearchBookResponseDto, DataError.Remote>
}
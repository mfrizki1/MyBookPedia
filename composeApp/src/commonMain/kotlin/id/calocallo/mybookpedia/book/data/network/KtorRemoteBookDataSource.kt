package id.calocallo.mybookpedia.book.data.network

import id.calocallo.mybookpedia.book.data.dto.SearchBookResponseDto
import id.calocallo.mybookpedia.core.data.safeCall
import id.calocallo.mybookpedia.core.domain.DataError
import id.calocallo.mybookpedia.core.domain.Result
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter


private const val BASE_URL = "https://openlibrary.org"
// Presentation <- Domain -> Data
class KtorRemoteBookDataSource(
    private val httpClient: HttpClient
) : RemoteBookDataSource {

    override suspend fun searchBooks(
        query: String,
        resultLimit: Int?,
    ): Result<SearchBookResponseDto, DataError.Remote> { // Result<List<Book>, DataError.Remote>
        return safeCall {
            httpClient.get(
                urlString = "$BASE_URL/search.json"
            ) {
                parameter("q", query)
                parameter("limit", resultLimit)
                parameter("language", "eng")
                parameter(
                    "fields",
                    "key,title,language,cover_i,author_key,author_name,cover_edition_key,first_publish_year,ratings_average,ratings_count,number_of_pages_median,edition_count"
                )
            }
        }
    }
}
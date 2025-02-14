package id.calocallo.mybookpedia.book.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchBookResponseDto(
    @SerialName("docs") val results: List<SearchedBookDto>
)

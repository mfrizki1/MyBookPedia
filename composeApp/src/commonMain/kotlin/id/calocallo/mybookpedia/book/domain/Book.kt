package id.calocallo.mybookpedia.book.domain

data class Book(
    val id: String,
    val title: String,
    val imageUrl: String,
    val authors: List<String>,
    val description: String,
    val languanges: List<String>,
    val firstPublishYear: String?,
    val averateRarting: Double?,
    val ratingCount: Int?,
    val numPages: Int?,
    val numEditions: Int
)
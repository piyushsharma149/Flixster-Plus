package com.codepath.articlesearch
import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class SearchNewsResponse(
    @SerialName("results")
    val results: List<Article>?
)

//@Keep
//@Serializable
//data class BaseResponse(
//    @SerialName("docs")
//    val docs: List<Article>?
//)

@Keep
@Serializable
data class Article(
    @SerialName("title")
    val title: String?,

    @SerialName("overview")
    val overview: String?,

    @SerialName("poster_path")
    val poster_path: String?,

    @SerialName("backdrop_path")
    val backdrop_path: String?,

//    @SerialName("multimedia")
//    val multimedia: List<MultiMedia>?,
)

    : java.io.Serializable {
    val mediaImageUrl = "https://image.tmdb.org/t/p/w500/".plus(poster_path)
    val backdroppathurl = "https://image.tmdb.org/t/p/w500/".plus(backdrop_path)
//    val mediaImageUrl = "https://www.nytimes.com/${multimedia?.firstOrNull { it.url != null }?.url ?: ""}"
}

//@Keep
//@Serializable
//data class HeadLine(
//    @SerialName("main")
//    val main: String
//) : java.io.Serializable


//@Keep
//@Serializable
//data class Byline(
//    @SerialName("original")
//    val original: String? = null
//) : java.io.Serializable

//@Keep
//@Serializable
//data class MultiMedia(
//    @SerialName("url")
//    val url: String?
//) : java.io.Serializable
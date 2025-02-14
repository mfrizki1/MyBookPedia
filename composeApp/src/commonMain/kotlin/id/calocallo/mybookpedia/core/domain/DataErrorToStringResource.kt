package id.calocallo.mybookpedia.core.domain

import id.calocallo.mybookpedia.core.presentation.UIText
import mybookpedia.composeapp.generated.resources.Res
import mybookpedia.composeapp.generated.resources.disk_full_message
import mybookpedia.composeapp.generated.resources.no_internet_message
import mybookpedia.composeapp.generated.resources.request_timeout_message
import mybookpedia.composeapp.generated.resources.serialization_message
import mybookpedia.composeapp.generated.resources.too_many_request_message
import mybookpedia.composeapp.generated.resources.unknown_message

fun DataError.toUIText(): UIText {
    val stringRes = when (this) {
        DataError.Local.DISK_FULL -> Res.string.disk_full_message
        DataError.Local.UNKNOWN -> Res.string.unknown_message
        DataError.Remote.REQUEST_TIMEOUT -> Res.string.request_timeout_message
        DataError.Remote.TOO_MANY_REQUEST -> Res.string.too_many_request_message
        DataError.Remote.NO_INTERNET -> Res.string.no_internet_message
        DataError.Remote.SERVER -> Res.string.unknown_message
        DataError.Remote.SERIALIZATION -> Res.string.serialization_message
        DataError.Remote.UNKNOWN -> Res.string.unknown_message
    }
    return UIText.StringResourceId(stringRes)
}
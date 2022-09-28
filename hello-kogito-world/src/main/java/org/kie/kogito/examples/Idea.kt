package org.kie.kogito.examples

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * JsonProperty annotation needed because of https://proandroiddev.com/parsing-optional-values-with-jackson-and-kotlin-36f6f63868ef
 */
data class Idea(
    @JsonProperty("idea")
    var idea: String,

    @JsonProperty("approved")
    var approved: Boolean
)
{}
package com.example.uploadlmage

import com.google.gson.annotations.SerializedName

data class ImageeModel(
    @SerializedName("idImage")
    var idImage: String,
@SerializedName("nomImage")
    var nomImage: String,
    @SerializedName("image")
    var image: String
)

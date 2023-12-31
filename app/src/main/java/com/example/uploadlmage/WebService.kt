package com.example.uploadlmage

import android.media.Image
import okhttp3.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface WebService {
    @FormUrlEncoded
    @POST("upload_image.php")
    suspend fun enviarImage(
        @Field("idImage") idImage: String,
        @Field("nomImage") nomImage: String,
        @Field("image") image: String,

        ):Response<String>

    )
}
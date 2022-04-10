package com.rohitjakhar.mvvmtemplate.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.rohitjakhar.mvvmtemplate.data.local.model.DataModel

data class GetDataDto(
    @SerializedName("result")
    val result: String
)

fun GetDataDto.toDataModel(): DataModel {
    return DataModel(result = this.result)
}

package com.rohitjakhar.mvvmtemplate.domain.repository

import com.rohitjakhar.mvvmtemplate.data.local.model.DataModel
import com.rohitjakhar.mvvmtemplate.util.Resource

interface DataRepo {
    suspend fun getData(): Resource<DataModel>
}

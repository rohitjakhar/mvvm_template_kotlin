package com.rohitjakhar.mvvmtemplate.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rohitjakhar.mvvmtemplate.domain.repository.DataRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val dataRepo: DataRepo
) : ViewModel() {
    fun getData() {
        viewModelScope.launch(IO) {
            dataRepo.getData()
        }
    }
}

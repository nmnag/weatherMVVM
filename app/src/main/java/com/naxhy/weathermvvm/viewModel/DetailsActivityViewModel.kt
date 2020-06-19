package com.naxhy.weathermvvm.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.naxhy.weathermvvm.network.model.WeatherResponse
import com.naxhy.weathermvvm.repository.DetailsActivityRepository

class DetailsActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = DetailsActivityRepository(application)
    val showProgress : LiveData<Boolean>
    val response: LiveData<WeatherResponse>

    init {
        showProgress = repository.showProgress
        response= repository.response
    }

    fun getWeather(woeId: Int){
        repository.getWeather(woeId)
    }

}
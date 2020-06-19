package com.naxhy.weathermvvm.viewModel

import `in`.naxhy.weathermvvm.network.model.Location
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.naxhy.weathermvvm.repository.SearchActivityRepository
import com.naxhy.weathermvvm.view.SearchActivity

class SearchActivityViewModel(application: Application) : AndroidViewModel(application)  {

    private val repository = SearchActivityRepository(application)
    val showProgress : LiveData<Boolean>
    val locationList : LiveData<List<Location>>
    init {
        this.showProgress = repository.showProgress
        this.locationList = repository.locationList
    }

    fun changeState(){
        repository.changeState()
    }

    fun searchLocation(searchString: String){

        repository.searchLocation(searchString)
    }
}
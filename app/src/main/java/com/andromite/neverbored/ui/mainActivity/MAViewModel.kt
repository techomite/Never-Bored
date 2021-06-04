package com.andromite.neverbored.ui.mainActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andromite.neverbored.data.model.Activity
import com.andromite.neverbored.data.repo.MainRepo
import kotlinx.coroutines.launch

class MAViewModel : ViewModel() {

    private val _activity = MutableLiveData<Activity>()
    val activity :LiveData<Activity> = _activity

    fun fetchArticle() = viewModelScope.launch {
        MainRepo().getActivity().let {
            _activity.postValue(it)
        }
    }


}
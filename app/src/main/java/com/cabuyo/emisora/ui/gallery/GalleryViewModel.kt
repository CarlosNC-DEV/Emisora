package com.cabuyo.emisora.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Terminos y Codiciones de APP BENDICION STEREO"
    }
    val text: LiveData<String> = _text
}
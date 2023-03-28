package com.cabuyo.emisora.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Este boton no entrara a ninguna Vista solo apagara la reproduccion de la Musica LIVE"
    }
    val text: LiveData<String> = _text
}
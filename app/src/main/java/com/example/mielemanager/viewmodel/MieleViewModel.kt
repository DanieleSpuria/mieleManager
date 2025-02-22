package com.example.mielemanager.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mielemanager.model.Miele

class MieleViewModel : ViewModel() {
    private val _allMiele = MutableLiveData<List<Miele>>(emptyList())
    val allMiele: LiveData<List<Miele>> = _allMiele

    fun insertMiele(miele: Miele) {
        val currentList = _allMiele.value ?: emptyList()
        _allMiele.value = currentList + miele
    }
}
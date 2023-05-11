package com.example.movie_world_kotlin_best_practices.ui.screens.artistdetail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movie_world_kotlin_best_practices.data.model.artist.ArtistDetail
import com.example.movie_world_kotlin_best_practices.data.repository.MovieRepository
import com.example.movie_world_kotlin_best_practices.utils.network.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ArtistDetailViewModel @Inject constructor(private val repo: MovieRepository) : ViewModel() {
    val artistDetail: MutableState<DataState<ArtistDetail>?> = mutableStateOf(null)

    fun artistDetail(personId: Int) {
        viewModelScope.launch {
            repo.artistDetail(personId).onEach {
                artistDetail.value = it
            }.launchIn(viewModelScope)
        }
    }
}
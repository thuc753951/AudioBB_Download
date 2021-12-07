package edu.temple.audiobb

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SelectedBookViewModel : ViewModel() {

    private val selectedBook: MutableLiveData<Book> by lazy {
        MutableLiveData()
    }

    private val playingBook: MutableLiveData<Book> by lazy {
        MutableLiveData()
    }

    private val durationOfAudio: MutableLiveData<Int> by lazy {
        MutableLiveData()
    }

    private val currentPlayingFile: MutableLiveData<String> by lazy {
        MutableLiveData()
    }

    fun getCurrentFile(): LiveData<String> {
        return currentPlayingFile
    }

    fun setCurrentFile(path: String){
        this.currentPlayingFile.value
    }

    fun getSelectedBook(): LiveData<Book> {
        return selectedBook
    }

    fun setSelectedBook(selectedBook: Book?) {
        this.selectedBook.value = selectedBook
    }

    fun getPlayingBook(): LiveData<Book> {
        return playingBook
    }

    fun setPlayingBook(selectedBook: Book?) {
        this.playingBook.value = selectedBook
    }

    fun setDuration(position: Int){
        this.durationOfAudio.value = position
    }

    fun getDuration(): LiveData<Int> {
        return durationOfAudio
    }

}
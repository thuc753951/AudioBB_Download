package edu.temple.audiobb

import androidx.lifecycle.ViewModel
import java.io.Serializable

class filePath : ViewModel(), Serializable{

    private val fileBookPath : ArrayList<BookPath> by lazy {
        ArrayList()
    }

    fun add(path: BookPath){
        fileBookPath.add(path)
    }

    fun remove(path: BookPath){
        fileBookPath.remove(path)
    }

    fun getByTitle(Title: String): BookPath? {
        var i = 0
        if(fileBookPath.size > 0)
        {
            for(i in fileBookPath.indices){
                if(fileBookPath[i].title  == Title) return fileBookPath[i]
            }
        }
        return null

    }

    operator  fun get(index: Int) = fileBookPath.get(index)

    fun size()  = fileBookPath.size
}
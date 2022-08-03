package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException



/**
 * ViewModel for the final screen showing the score
 */
class ScoreViewModel(finalScore: Int) : ViewModel() {

    // The final score
    var score = finalScore

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}
package android.game.myweatherapp.viewmodel

import android.game.myweatherapp.model.Weather


sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
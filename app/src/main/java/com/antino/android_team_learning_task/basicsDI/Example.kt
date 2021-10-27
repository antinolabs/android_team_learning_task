package com.antino.android_team_learning_task.basicsDI

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
    }

}

class Wheel @Inject constructor() {

    fun getWheel() {
        Log.d("main", "getWheel: ")
    }
}

class Engine @Inject constructor() {

    fun getEngine() {
        Log.d("main", "getEngine: ")
    }
}
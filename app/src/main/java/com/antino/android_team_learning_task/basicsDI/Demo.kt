package com.antino.android_team_learning_task.basicsDI

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/*
  -> okay let's create the object of Demo with dagger hilt,
  so what happens basically whenever we put @Inject annotation with any construction , hilt automatically creates
  the object of that class i,e val demo = Demo(). Let's use this class in your MainActivity.

  -> This is called Constructor injection.
 */

/*
  if you want to make any class Singleton , simply use the @Singleton annotation.
 */

@Singleton
class Demo @Inject constructor(){

    fun getDemo(){
        Log.d("main", "getDemo")
    }
}
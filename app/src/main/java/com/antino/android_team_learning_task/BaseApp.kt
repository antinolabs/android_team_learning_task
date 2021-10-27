package com.antino.android_team_learning_task

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
 1).This is your base file , where we will keep our all dependencies(objects)
 2). @HiltAndroidApp annotation means , dagger automatically keep your dependency , you don't need to write much
  boilerplate codes.
 */

@HiltAndroidApp
class BaseApp : Application() {
}
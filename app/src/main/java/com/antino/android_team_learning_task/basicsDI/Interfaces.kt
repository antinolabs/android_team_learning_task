package com.antino.android_team_learning_task.basicsDI

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

/*
 -> Let's provides the dependency of interface , actually interface doesn't contain any constructor , so we can't
  do constructor injection for that we need to create a module where we can provides the dependency of interface

  ->
 */

interface One {

    fun getOne()
}

class OneImplementation @Inject constructor() : One {
    override fun getOne() {
        Log.d("main", "getOne: ")
    }
}

class Main @Inject constructor(private val one: One) {

    fun getMain() {
        one.getOne()
    }

}

@Module
@InstallIn(SingletonComponent::class)
object AppModuleInterface {

    @Provides
    @Singleton
    fun providesOne(): One = OneImplementation()

}

@Module
@Singleton
abstract class AppModuleOne {

    @Binds
    @Singleton
    abstract fun providesOne(implementation: OneImplementation): One

}
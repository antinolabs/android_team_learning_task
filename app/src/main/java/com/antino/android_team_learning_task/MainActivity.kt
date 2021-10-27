package com.antino.android_team_learning_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.antino.android_team_learning_task.basicsDI.Car
import com.antino.android_team_learning_task.basicsDI.Demo
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


/*
@AndroidEntryPoint means , whatever dependencies we have created now we can use here or you can also say that we
are normally creating the object of BaseApp , because your BaseApp class contains all your dependencies.
 */

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /*
    -> we all know that we have already provided the dependency of Demo class , so here we will only create the
    instance of demo

    -> This is called field injection.
     */

    @Inject
    lateinit var demo: Demo

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        demo.getDemo()
        car.getCar()
    }
}
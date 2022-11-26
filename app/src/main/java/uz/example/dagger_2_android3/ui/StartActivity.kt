package uz.example.dagger_2_android3.ui

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import uz.example.dagger_2_android3.R

class StartActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }
}
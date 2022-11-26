package uz.example.dagger_2_android3.ui

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import uz.example.dagger_2_android3.databinding.ActivityMainBinding

class MainActivity : DaggerAppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
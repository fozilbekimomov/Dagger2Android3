package uz.example.dagger_2_android3.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.PermissionChecker
import dagger.android.support.DaggerAppCompatActivity
import uz.example.dagger_2_android3.R

class StartActivity : DaggerAppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        if (checkNotificationPermission()) {
            startMain()
        }else{
            requestPermissionLauncher.launch( Manifest.permission.POST_NOTIFICATIONS)
        }

    }

    private fun startMain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }

    val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                startMain()
            } else {
                startMain()
            }
        }

    private fun checkNotificationPermission(): Boolean {
        return checkSelfPermission(Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED
    }
}
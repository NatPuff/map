package com.example.map

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

object PermissionHelper {
    fun askForLocationPermission(activity: Activity){
        ActivityCompat.requestPermissions(activity, PERMISSION, REQUEST_CODE_FOR_PERMISSION)

    }
    fun arePermissionGranted(context: Context) =
        PERMISSION.all{
            ContextCompat.checkSelfPermission(context, it)== PackageManager.PERMISSION_GRANTED
        }

    const val REQUEST_CODE_FOR_PERMISSION = 0x1001
    private val PERMISSION = arrayOf(android.Manifest.permission.ACCESS_COARSE_LOCATION, android.Manifest.permission.ACCESS_FINE_LOCATION)
}
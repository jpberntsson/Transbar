package com.jpberntsson.windowfitter

import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.Window

fun transparentStatusBar(window:Window) {
    when {
        Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT -> {
            //Do nothing since the statusbar can not be made transparent nor translucent
        }
        Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP -> {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        else -> {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            window.setStatusBarColor(Color.TRANSPARENT)
        }
    }
}
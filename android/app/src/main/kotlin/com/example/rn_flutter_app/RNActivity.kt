package com.example.rn_flutter_app

import com.facebook.react.ReactActivity

class RNActivity : ReactActivity() {
    /**
     * Returns the name of the main component registered from JavaScript. This is used to schedule
     * rendering of the component.
     */
    override fun getMainComponentName(): String? {
        return "RNApp"
    }
}
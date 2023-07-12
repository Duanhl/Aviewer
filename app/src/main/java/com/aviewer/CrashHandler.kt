package com.aviewer

import android.content.Context
import android.os.Looper
import android.util.Log
import java.lang.RuntimeException
import java.lang.Thread.UncaughtExceptionHandler

class CrashHandler(private val context: Context) : UncaughtExceptionHandler {

    init {
        Thread.setDefaultUncaughtExceptionHandler(this)
    }

    override fun uncaughtException(t: Thread, e: Throwable) {
        val causeMessage = getCauseMessage(e)
        Log.e("RLog", "uncaughtException: $causeMessage")
        Looper.myLooper() ?: Looper.prepare()
        Looper.loop()
        e.printStackTrace()
    }

    private fun getCauseMessage(e: Throwable?): String? {
        val cause = getCauseRecursively(e)
        return cause?.message?.toString() ?: e?.javaClass?.name
    }

    private fun getCauseRecursively(e: Throwable?): Throwable? {
        var cause: Throwable?
        cause = e
        while (cause?.cause != null && cause !is RuntimeException) {
            cause = cause.cause
        }
        return cause
    }
}
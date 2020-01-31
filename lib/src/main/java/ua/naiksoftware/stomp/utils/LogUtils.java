package ua.naiksoftware.stomp.utils;

import android.util.Log;

/**
 * @author eraise.
 */
public class LogUtils {

    public static boolean logEnable = false;

    public static void v(String tag, String msg) {
        if (logEnable) {
            Log.v(tag, msg);
        }
    }

    public static void v(String tag, String msg, Throwable tr) {
        if (logEnable) {
            Log.v(tag, msg, tr);
        }
    }

    public static void d(String tag, String msg) {
        if (logEnable) {
            Log.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable tr) {
        if (logEnable) {
            Log.d(tag, msg, tr);
        }
    }

    public static void i(String tag, String msg) {
        if (logEnable) {
            Log.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Throwable tr) {
        if (logEnable) {
            Log.i(tag, msg, tr);
        }
    }

    public static void w(String tag, String msg) {
        if (logEnable) {
            Log.w(tag, msg);
        }
    }

    public static void w(String tag, String msg, Throwable tr) {
        if (logEnable) {
            Log.w(tag, msg, tr);
        }
    }

    public static void w(String tag, Throwable tr) {
        if (logEnable) {
            Log.w(tag, tr);
        }
    }

    public static void e(String tag, String msg) {
        if (logEnable) {
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (logEnable) {
            Log.e(tag, msg, tr);
        }
    }


}

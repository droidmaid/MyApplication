package maidul.care.com.myapplication.utility;

/**
 * Created by maidulislam on 25/01/2017.
 */
public class Log {
    private static boolean ENABLE_DEBUG_LOG = true;

    public Log() {
    }

    public static void i(String tag, String msg) {
        android.util.Log.i(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (ENABLE_DEBUG_LOG) {
            android.util.Log.e(tag, msg);
        }

    }

    public static void e(String tag, String msg, Throwable e) {
        if (ENABLE_DEBUG_LOG) {
            android.util.Log.e(tag, msg, e);
        }

    }

    public static void d(String tag, String msg) {
        if (ENABLE_DEBUG_LOG) {
            android.util.Log.d(tag, msg);
        }

    }

    public static void d(String tag, String msg, Throwable e) {
        if (ENABLE_DEBUG_LOG) {
            android.util.Log.d(tag, msg, e);
        }

    }

    public static void v(String tag, String msg) {
        if (ENABLE_DEBUG_LOG) {
            android.util.Log.v(tag, msg);
        }

    }

    public static void w(String tag, String msg) {
        if (ENABLE_DEBUG_LOG) {
            android.util.Log.w(tag, msg);
        }

    }

    public static void w(String tag, String msg, Throwable e) {
        if (ENABLE_DEBUG_LOG) {
            android.util.Log.w(tag, msg, e);
        }

    }

    public static void setEnableDebugLog(boolean islogenabled) {
        ENABLE_DEBUG_LOG = islogenabled;
    }
}

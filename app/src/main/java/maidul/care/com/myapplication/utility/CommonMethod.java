package maidul.care.com.myapplication.utility;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mdmaidul.islam on 3/13/17.
 */

public class CommonMethod {
    public static String TAG = "CommonMethod";

    @SuppressLint("NewApi")
    public static void onSetUpdateLanguage(String languageCode, String className, Activity activity) {

        Context context = LocaleHelper.setLocale(activity, languageCode);
        Resources resources = context.getResources();
        Configuration configuration = activity.getResources().getConfiguration();
        configuration.setLayoutDirection(new Locale(languageCode));
        resources.updateConfiguration(configuration, activity.getResources().getDisplayMetrics());

        LocaleHelper.setLocale(activity, languageCode);

        Class<?> c = null;
        try {
            c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        activity.finish();
        Intent intent = new Intent(activity, c);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(intent);
    }


    public static void onCreateActivity(Activity activity, String className, String TAG, int round) {
        Log.d("", "className >> " + className);
        Class<?> c = null;
        try {
            c = Class.forName(className);
            Log.d("", "c >> " + c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(activity, c);
        intent.putExtra("className", TAG);
        intent.putExtra("complainNo", round);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivity(intent);
    }

    public static void onCreateActivityBundle(Activity activity, String className, Bundle args, int pickProfileData) {
        Log.d("", "className >> " + className);
        Class<?> c = null;
        try {
            c = Class.forName(className);
            Log.d("", "c >> " + c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(activity, c);
        intent.putExtras(args);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        activity.startActivityForResult(intent, pickProfileData);


    }

    public static void onCreateActivityBundleNoClearTask(Activity activity, String className, Bundle args, int pickProfileData) {
        Log.d("", "className >> " + className);
        Class<?> c = null;
        try {
            c = Class.forName(className);
            Log.d("", "c >> " + c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(activity, c);
        intent.putExtras(args);
        activity.startActivityForResult(intent, pickProfileData);
    }

    public static ArrayList<String> getLanguageList() {
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("Choose your country list");
        newArr.add("Bahrain");
        newArr.add("Bangladesh");
        newArr.add("Canada");
        newArr.add("France");
        newArr.add("Germany");
        newArr.add("India");
        newArr.add("Indonesia");
        newArr.add("Iran");
        newArr.add("Iraq");
        newArr.add("Israel");
        newArr.add("Kuwait");
        newArr.add("Morocco");
        newArr.add("Oman");
        newArr.add("Pakistan");
        newArr.add("Philippines");
        newArr.add("Qatar");
        newArr.add("Saudi Arabia");
        newArr.add("Sudan");
        newArr.add("Syria");
        newArr.add("United Arab Emirates");
        newArr.add("United Kingdom");
        newArr.add("United States");
        newArr.add("Yemen");
        return newArr;
    }

    public static ArrayList<String> getSpinnerLocationTemp() {
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("Choose an option");
        newArr.add("Hotel");
        newArr.add("Restuarant");
        newArr.add("Administration");
        newArr.add("ITC");
        newArr.add("New Towner");
        return newArr;
    }

    public static ArrayList<String> getSpinnerCategoryTemp() {
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("Choose an option");
        newArr.add("General");
        newArr.add("IT DESK");
        newArr.add("Electric");
        newArr.add("Cleaning");
        newArr.add("Water");
        return newArr;
    }

    public static void onChangeLanguage(String languageCode, Activity activity) {

        Context context = LocaleHelper.setLocale(activity, languageCode);
        Resources resources = context.getResources();
        Configuration configuration = activity.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            configuration.setLayoutDirection(new Locale(languageCode));
        }
        resources.updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
        LocaleHelper.setLocale(activity, languageCode);
    }

    public static ArrayList<String> getLanguagecode() {
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("en");
        newArr.add("ar");
        newArr.add("fr");
        return newArr;
    }

/*    public static ArrayList<BeanComplainList> getDataPendingList(String dataOverview) {

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<BeanComplainList>>() {
        }.getType();
        ArrayList<BeanComplainList> dataOverViewBeanTop = (ArrayList<BeanComplainList>) gson.fromJson(dataOverview, listType);
        return dataOverViewBeanTop;
    }*/


//    public static ArrayList<BeanFeedBack> getFeedbackList(String listFeedback) {
//        Gson gson = new Gson();
//        Type listType = new TypeToken<ArrayList<BeanFeedBack>>(){}.getType();
//        ArrayList<BeanFeedBack> dataOverViewBeanTop = (ArrayList<BeanFeedBack>) gson.fromJson(listFeedback, listType);
//        return dataOverViewBeanTop;
//    }

    public static void ShowDilaog(Activity activity, String title, String message, boolean bool) {
        final ProgressDialog progress = ProgressDialog.show(activity, title, message, bool);
        long delayInMillis = 5000;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                progress.dismiss();
            }
        }, delayInMillis);
    }

    @SuppressLint("NewApi")
    public static void requestFocus(Activity activity, View view) {
        if (view.requestFocus()) {
            activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }


//    DateTime start = new DateTime(2013, 10, 20, 5, 0, 0, Locale);
//    DateTime end = new DateTime(2013, 10, 21, 13, 0, 0, Locale);

    public static String getLocalizeDate(String OurDate) {
        try {
//            E, dd, MMM, yyyy HH:mm:ss Z
            SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
//            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date value = formatter.parse(OurDate);
            Log.d("OurDate", OurDate);

            SimpleDateFormat dateFormatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss"); //this format changeable
//            SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy HH:mm");
            dateFormatter.setTimeZone(TimeZone.getDefault());
            OurDate = dateFormatter.format(value);

            Log.d("getDefault ", OurDate);
        } catch (Exception e) {
            e.printStackTrace();
            OurDate = "00-00-0000 00:00";
        }
        return OurDate;
    }


    public static Long printDifference(String startDate) {
        long different = 0;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");

            Date dateStart = formatter.parse(startDate);
            String endTime = formatter.format(new Date());
            Date endDate = formatter.parse(endTime);

            different = endDate.getTime() - dateStart.getTime();
            Log.e(TAG, "different \n" + different);
            //milliseconds
//            System.out.println("startDate : " + startDate);
//            System.out.println("endDate : "+ endDate);
//            System.out.println("different : " + different);
//
//            long secondsInMilli = 1000;
//            long minutesInMilli = secondsInMilli * 60;
//            long hoursInMilli = minutesInMilli * 60;
//            long daysInMilli = hoursInMilli * 24;
//
//            long elapsedDays = different / daysInMilli;
//            different = different % daysInMilli;
//
//            long elapsedHours = different / hoursInMilli;
//            different = different % hoursInMilli;
//
//            long elapsedMinutes = different / minutesInMilli;
//            different = different % minutesInMilli;
//
//            long elapsedSeconds = different / secondsInMilli;
//
//            System.out.printf(
//                    "%d days, %d hours, %d minutes, %d seconds%n",
//                    elapsedDays,
//                    elapsedHours, elapsedMinutes, elapsedSeconds);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return different;
    }

    public static boolean isTablet(Context ctx) {
        return (ctx.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

    @SuppressLint("NewApi")
    public boolean isRTL(Context ctx) {
        Configuration config = ctx.getResources().getConfiguration();
        return config.getLayoutDirection() == View.LAYOUT_DIRECTION_RTL;
    }
}

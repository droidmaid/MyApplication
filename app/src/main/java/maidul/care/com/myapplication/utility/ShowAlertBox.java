package maidul.care.com.myapplication.utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by mdmaidul.islam on 3/21/17.
 */

public class ShowAlertBox {
    public static void getAlertDialogBoxDismiss(final Activity activity, String test, String test1, String ok, final Context applicationContext) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        // set title
        alertDialogBuilder.setTitle(test);
        // set dialog message
        alertDialogBuilder
                .setMessage(test1)
                .setPositiveButton(ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
//                        activity.finish();
                        Constants.savePreferencesToken("token", null, applicationContext);
                        dialog.cancel();
                        activity.finish();
                    }
                });
        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        // show it
        alertDialog.show();
    }

    public static void getAlertDialogBoxOKCancel(final Activity activity, String s, String logOut, String ok, String cancel) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        // set title
        alertDialogBuilder.setTitle(logOut);
        // set dialog message
        alertDialogBuilder
                .setMessage(s)
                .setPositiveButton(ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        dialog.cancel();
                        ShowToast.showToastMessage(activity, "thank you very much for visiting us");
                    }
                })
                .setNegativeButton(cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        dialog.cancel();
                    }
                })
        ;
        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        // show it
        alertDialog.show();
    }

    public static void getAlertDialogLogout(final Activity activity, String s, String logOut, String ok, String cancel, final Context applicationContext) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        // set title
        alertDialogBuilder.setTitle(logOut);
        // set dialog message
        alertDialogBuilder
                .setMessage(s)
                .setPositiveButton(ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity

                        Constants.savePreferencesToken("token", null, applicationContext);
                        activity.setResult(activity.RESULT_OK);
                        dialog.cancel();
                        activity.finish();
                        ShowToast.showToastMessage(activity, "Thank you very much for visiting us");
                    }
                })
                .setNegativeButton(cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        dialog.cancel();
                    }
                })
        ;
        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        // show it
        alertDialog.show();
    }

    public static void getActivityDismiss(final Activity activity, String test, String test1, String ok) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
        // set title
        alertDialogBuilder.setTitle(test);
        // set dialog message
        alertDialogBuilder
                .setMessage(test1)
                .setPositiveButton(ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        activity.finish();

                    }
                });
        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        // show it
        alertDialog.show();
    }
}

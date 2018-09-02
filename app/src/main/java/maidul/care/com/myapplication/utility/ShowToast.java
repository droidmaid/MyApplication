package maidul.care.com.myapplication.utility;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by maidulislam on 25/01/2017.
 */
public class ShowToast {
    public static void showToastMessage(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}

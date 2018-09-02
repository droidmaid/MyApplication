package maidul.care.com.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import maidul.care.com.myapplication.utility.ShowToast;


public class MainActivity extends Activity implements View.OnClickListener {
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit=findViewById(R.id.btn_submit_change_password);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ShowToast.showToastMessage(this,"Thank you very much. Your data is saved");
    }
}

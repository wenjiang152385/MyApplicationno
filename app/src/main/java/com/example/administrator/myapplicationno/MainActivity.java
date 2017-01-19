package com.example.administrator.myapplicationno;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;

import java.text.SimpleDateFormat;

public class MainActivity extends Activity {

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        context=this;
        setContentView(R.layout.activity_main);
        Button bt= (Button) findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
//                v = View.inflate(context, R.layout.activity_settings, null);
//                RadioButton rb= (RadioButton) v.findViewById(R.id.rb1);
//                final AlertDialog.Builder dialog = new
//                        AlertDialog.Builder(MainActivity.this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
//                AlertDialog alertDialog = dialog.create();
//                alertDialog.setView(v);
//                Window window = alertDialog.getWindow();
//                window.setGravity(Gravity.CENTER);
//                WindowManager.LayoutParams lp = window.getAttributes();
//                lp.alpha = 0.7f;
//                window.setAttributes(lp);
//                 alertDialog.show();
                SimpleDialogFragment simpleDialogFragment=new SimpleDialogFragment();
                simpleDialogFragment.show(getFragmentManager(),"s");

            }
        });
    }
}

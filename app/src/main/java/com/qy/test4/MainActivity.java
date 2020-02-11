package com.qy.test4;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Telephony;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"test", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "测试一下能不能提交", Toast.LENGTH_SHORT).show();
    }

    public void c1(View view) {
        TelephonyManager service = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE)!= PackageManager.PERMISSION_GRANTED)
//        {
//            return;
//        }
//        String imei = service.getSubscriberId();
//        if(imei!=null){
//            if (imei.startsWith("46000")||imei.startsWith("46002")) {
//                Toast.makeText(this, "移动", Toast.LENGTH_SHORT).show();
//            }
//            if (imei.startsWith("46001")){
//                Toast.makeText(this,"联通", Toast.LENGTH_SHORT).show();
//            }
//            if (imei.startsWith("46003")){
//                Toast.makeText(this, "电信", Toast.LENGTH_SHORT).show();
//            }
//        }

        String operator = service.getSimOperator();
        if(operator!=null){
            if (operator.startsWith("46000")||operator.startsWith("46002")) {
                Toast.makeText(this, "移动2", Toast.LENGTH_SHORT).show();
            }
            if (operator.startsWith("46001")){
                Toast.makeText(this,"联通", Toast.LENGTH_SHORT).show();
            }
            if (operator.startsWith("46003")){
                Toast.makeText(this, "电信", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void c2(View view) {
        String[] a = {"INPUT_SERVICE"," "};
        requestPermissions(a,1);

    }
}

package com.pareshmayani.smsinbox;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

class PermissionHelper {
    public static final int SMS_REQUEST_CODE = 0;


    public static boolean hasReadReceiveSmsPermission(Activity activity) {
        return ContextCompat.checkSelfPermission(activity,
                Manifest.permission.READ_SMS) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(activity,
                Manifest.permission.RECEIVE_SMS) == PackageManager.PERMISSION_GRANTED;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public static void requestReadReceiveSMSPermissions(Activity activity, int requestCode) {

        ActivityCompat.requestPermissions(activity,
                new String[]{
                        Manifest.permission.READ_SMS,
                        Manifest.permission.RECEIVE_SMS},
                requestCode);


    }


}

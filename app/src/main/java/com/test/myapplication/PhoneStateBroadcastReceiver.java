package com.test.myapplication;

/**
 * Created by ivan on 03.07.2017.
 */

//public class PhoneStateBroadcastReceiver {
//}

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

public class PhoneStateBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d("DEBUG","########");
        // above line is also not printing in Logcat

        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        telephonyManager.listen(new CustomPhoneStateListener(context), PhoneStateListener.LISTEN_CALL_STATE);
    }

    public class CustomPhoneStateListener extends PhoneStateListener {

        //private static final String TAG = "PhoneStateChanged";
        Context context; //Context to make Toast if required
        public CustomPhoneStateListener(Context context) {
            super();
            this.context = context;
        }

        @Override
        public void onCallStateChanged(int state, String incomingNumber) {
            super.onCallStateChanged(state, incomingNumber);
            switch (state) {
                case TelephonyManager.CALL_STATE_IDLE:
                    //when Idle i.e no call
                    Log.d("DEBUG","IDLE");
                    break;
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    //when Off hook i.e in call
                    //Make intent and start your service here
                    Log.d("DEBUG","OFFHOOK");
                case TelephonyManager.CALL_STATE_RINGING:
                    //when Ringing
                    Log.d("DEBUG","RINGING");
                    break;
                default:
                    break;
            }
        }
    }
}
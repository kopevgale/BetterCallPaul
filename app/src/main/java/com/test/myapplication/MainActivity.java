package com.test.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button btnCall = (Button) findViewById(R.id.button);

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialContactPhone("+79671125951");
                }
            });
        }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }}
        
//        start fucking call

//        btnCall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                switch (v.getId()) {
//
//                    case R.id.btn:
//                        makeCall("tel:+79671125951");
//                        ArrayList<String> phones = readPhones();
//                        for (String phone : phones) {
//                            makeCall(phone);
//                        }
//
//                        break;
//                }
//            }
//        });
//        requestPerms();
//
//    }
//
//    private void makeCall(String s) {
//    }
//
//}

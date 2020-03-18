package com.example.android_sdk_example;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidsdk.IntentKeys;
import com.example.androidsdk.Pay;

public class MainActivity extends AppCompatActivity {
    String paymentKey="";
    int IframeID ;
    String Endpoint = "";
    String success = "";
    String Id ="";


//    private void StartPayActivity(){
//
//
//      Intent pay_intent = new Intent(this, Pay.class);
//      pay_intent.putExtra(IntentKeys.PAYMENT_KEY, paymentKey);
//      pay_intent.putExtra(String.valueOf(IntentKeys.IFRAMEID), IframeID);
//      pay_intent.putExtra(IntentKeys.ENDPOINT_URL, Endpoint);
//      startActivityForResult(pay_intent,1);

 // }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//                StartPayActivity();





    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if(requestCode == 1 ){
//            if (resultCode == RESULT_OK){
//                success = data.getStringExtra("success");
//                Id = data.getStringExtra("ID");
//            }
//        }
//    }
}

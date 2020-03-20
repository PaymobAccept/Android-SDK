package com.example.android_sdk_example;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidsdk.IntentKeys;
import com.example.androidsdk.Pay;

public class MainActivity extends AppCompatActivity {
//    String paymentKey="ZXlKaGJHY2lPaUpJVXpVeE1pSXNJblI1Y0NJNklrcFhWQ0o5LmV5SmpkWEp5Wlc1amVTSTZJa1ZIVUNJc0ltVjRjQ0k2TXpZd01EQXdNREF3TURBd01EQXdNREF3TURBd01EQXdNREF3TURBd01EQXdNREUxT0RRM05EUTJORGtzSW5WelpYSmZhV1FpT2pNMU5UVXNJbTl5WkdWeVgybGtJam8wTnpVMk1qZ3dMQ0poYlc5MWJuUmZZMlZ1ZEhNaU9qRXdNQ3dpY0cxclgybHdJam9pTkRFdU1qTTBMakUxTkM0eU1qQWlMQ0pwYm5SbFozSmhkR2x2Ymw5cFpDSTZORGcxT0N3aWJHOWphMTl2Y21SbGNsOTNhR1Z1WDNCaGFXUWlPbVpoYkhObExDSmlhV3hzYVc1blgyUmhkR0VpT25zaVptbHljM1JmYm1GdFpTSTZJa05zYVdabWIzSmtJaXdpYkdGemRGOXVZVzFsSWpvaVRtbGpiMnhoY3lJc0luTjBjbVZsZENJNklrVjBhR0Z1SUV4aGJtUWlMQ0ppZFdsc1pHbHVaeUk2SWpnd01qZ2lMQ0ptYkc5dmNpSTZJalF5SWl3aVlYQmhjblJ0Wlc1MElqb2lPREF6SWl3aVkybDBlU0k2SWtwaGMydHZiSE5yYVdKMWNtZG9JaXdpYzNSaGRHVWlPaUpWZEdGb0lpd2lZMjkxYm5SeWVTSTZJa05TSWl3aVpXMWhhV3dpT2lKamJHRjFaR1YwZEdVd09VQmxlR0V1WTI5dElpd2ljR2h2Ym1WZmJuVnRZbVZ5SWpvaUt6ZzJLRGdwT1RFek5USXhNRFE0TnlJc0luQnZjM1JoYkY5amIyUmxJam9pTURFNE9UZ2lMQ0psZUhSeVlWOWtaWE5qY21sd2RHbHZiaUk2SWs1QkluMTkuNE92NmFyM3JBUGNlM2h3TmxMRmFaV1pEQ0pwZW44ZjBHaGlBc0JRZFJCNFJpZ1JnMHM0TUJPV2xuSTdTeGJaRS1sTFhPRFhtaFU1ZHAzMnNTX2RKdkE=";
//    int IframeID =7898 ;
//    String Endpoint = " https://accept.paymobsolutions.com/api/acceptance/post_pay";
//    String success = "";
//    String Id ="";
//    String amount_cents="";
//    String integration_id="";
//    String has_parent_transaction="";
//    String txn_response_code="";
//    String  acq_response_code="";
//    private static final String TAG = "tag";


//  private void StartPayActivity(){
//
//
//      Intent pay_intent = new Intent(this, Pay.class);
//      pay_intent.putExtra(IntentKeys.PAYMENT_KEY, paymentKey);
//     pay_intent.putExtra(String.valueOf(IntentKeys.IFRAMEID), IframeID);
//     pay_intent.putExtra(IntentKeys.ENDPOINT_URL, Endpoint);
//    startActivityForResult(pay_intent,1);
//
//  }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//               StartPayActivity();





    }

  @Override
   protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//       if(requestCode == 1 ){
//           if (resultCode == RESULT_OK){
//               success = data.getStringExtra("success");
//               Id = data.getStringExtra("ID");
//               amount_cents = data.getStringExtra("amount_cents");
//               Log.d(TAG, "amount cents: "+amount_cents);
//               integration_id = data.getStringExtra("integration_id");
//               Log.d(TAG, "amount cents: "+integration_id);
//               has_parent_transaction = data.getStringExtra("has_parent_transaction");
//               Log.d(TAG, "amount cents: "+has_parent_transaction);
//               txn_response_code = data.getStringExtra("txn_response_code");
//               Log.d(TAG, "amount cents: "+txn_response_code);
//               acq_response_code = data.getStringExtra("acq_response_code");
//               Log.d(TAG, "amount cents: "+acq_response_code);
//          }
//       }
    }
}

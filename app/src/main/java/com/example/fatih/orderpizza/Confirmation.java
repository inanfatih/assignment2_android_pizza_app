package com.example.fatih.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.fatih.orderpizza.R.id.meatsupreme;

public class Confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
/*
Data to be shown:
  info       : name in the intent
- Pizza Type : pizzatype
- Pizza Size : pizzasize
- Toppings:    toppings
Customer Information
- Name          : name
- Address       : postalcode
- Telephone     : telephone
- Payment Method: paymentmethod
- Card Number   : cardnumber
- Card Type     : cardtype
- Expiry Date   : expirydate




        Intent isim = getIntent();

        TextView text01 = (TextView) findViewById(R.id.FullName22);
        String vFullName = isim.getExtras().getString("FullName2");
        text21.setText(vFullName);


*/

    }
}
package com.example.fatih.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

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
*/

  Intent isim = getIntent();

  TextView text01 = (TextView) findViewById(R.id.pizzaTypeData);
  String sPizzaType = isim.getExtras().getString("pizzatype");
  text01.setText(sPizzaType);

  TextView text02 = (TextView) findViewById(R.id.pizzaSizeData);
  String sPizzaSize = isim.getExtras().getString("pizzasize");
  text02.setText(sPizzaSize);

  TextView text03 = (TextView) findViewById(R.id.toppingsData);
  String sToppings = isim.getExtras().getString("toppings");
  text03.setText(sToppings);

  TextView text04 = (TextView) findViewById(R.id.nameData);
  String sName = isim.getExtras().getString("name");
  text04.setText(sName);

  TextView text05 = (TextView) findViewById(R.id.postalCodeData);
  String sPostalCode = isim.getExtras().getString("postalcode");
  text05.setText(sPostalCode);

  TextView text06 = (TextView) findViewById(R.id.telephoneData);
  String sTelephone = isim.getExtras().getString("telephone");
  text06.setText(sTelephone);

  TextView text07 = (TextView) findViewById(R.id.paymentMethodData);
  String sPaymentMethod = isim.getExtras().getString("paymentmethod");
  text07.setText(sPaymentMethod);

  TextView text08 = (TextView) findViewById(R.id.cardNumberData);
  String sCardNumber = isim.getExtras().getString("cardnumber");
  text08.setText(sCardNumber);

  TextView text09 = (TextView) findViewById(R.id.cardTypeData);
  String sCardType = isim.getExtras().getString("cardtype");
  text09.setText(sCardType);

  TextView text10 = (TextView) findViewById(R.id.expiryDateData);
  String sExpiryDate = isim.getExtras().getString("expirydate");
  text10.setText(sExpiryDate);

  TextView text11 = (TextView) findViewById(R.id.addressData);
  String sAddress = isim.getExtras().getString("address");
  text11.setText(sAddress);


 }
}
package com.example.fatih.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CustomerInformation extends AppCompatActivity {


    public EditText pName;
    public EditText pAddress;
    public EditText pPostal;
    public EditText pTelephone;
    public EditText pPayment;
    public EditText pCardNumber;
    public EditText pCardType;
    public EditText pExpiry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_information);
    }

    public void custInfo(View v)
    {
        Intent i4 = new Intent(CustomerInformation.this, Confirmation.class);

        pName = (EditText) findViewById(R.id.nameID);
        i4.putExtra("name",pName.getText().toString());

        pAddress= (EditText) findViewById(R.id.addressID);
        i4.putExtra("address",pAddress.getText().toString());

        pPostal = (EditText) findViewById(R.id.postalcodeID);
        i4.putExtra("postalcode",pPostal.getText().toString());

        pTelephone = (EditText) findViewById(R.id.telephoneID);
        i4.putExtra("telephone",pTelephone.getText().toString());

        pPayment = (EditText) findViewById(R.id.paymentMethodID);
        i4.putExtra("paymentmethod",pPayment.getText().toString());

        pCardNumber = (EditText) findViewById(R.id.cardNumberID);
        i4.putExtra("cardnumber",pCardNumber.getText().toString());

        pCardType= (EditText) findViewById(R.id.cardTypeID);
        i4.putExtra("cardtype",pCardType.getText().toString());

        pExpiry = (EditText) findViewById(R.id.expiryDateID);
        i4.putExtra("expirydate",pExpiry.getText().toString());

        startActivity(i4);
    }

}

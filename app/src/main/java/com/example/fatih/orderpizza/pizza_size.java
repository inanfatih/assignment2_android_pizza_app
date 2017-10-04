package com.example.fatih.orderpizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Intent;




public class pizza_size extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_size);
    }

    public void sizeButton (View view)
    {
        RadioButton rb1 = (RadioButton) findViewById(((RadioGroup) findViewById(R.id.radioGroup)).getCheckedRadioButtonId());
        Intent i2 = new Intent(pizza_size.this, ExtraTopping.class);
        rb1.getText();
        i2.putExtra("pizzasize", rb1.getText().toString());

        startActivity(i2);
    }



}

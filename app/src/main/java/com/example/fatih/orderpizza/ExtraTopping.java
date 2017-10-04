package com.example.fatih.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class ExtraTopping extends AppCompatActivity {
    public String toppings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_topping);
    }

        public void toppingButton (View view) {
            Intent i3 = new Intent(ExtraTopping.this, CustomerInformation.class);

            CheckBox cheeseBox = (CheckBox) findViewById(R.id.cheese);
            CheckBox greenPepperBox = (CheckBox) findViewById(R.id.greenpepper);
            CheckBox smokedHamBox = (CheckBox) findViewById(R.id.smokedham);
            CheckBox spinachBox = (CheckBox) findViewById(R.id.spinach);
            CheckBox blackOlivesBox = (CheckBox) findViewById(R.id.blackolives);
            CheckBox spanishOnionsBox = (CheckBox) findViewById(R.id.spanishonions);

            if (cheeseBox.isChecked())
            {
            toppings = toppings + "Cheese, ";
            }
            if (greenPepperBox.isChecked())
            {
                toppings = toppings + "Green Pepper, ";
            }

            if (smokedHamBox.isChecked())
            {
                toppings = toppings + "Smoked Ham, ";
            }

            if (spinachBox.isChecked())
            {
                toppings = toppings + "Spinach, ";
            }

            if (blackOlivesBox.isChecked())
            {
                toppings = toppings + "Black Olives, ";
            }

            if (spanishOnionsBox.isChecked())
            {
                toppings = toppings + "Spanish Onions";
            }

            i3.putExtra("toppings", toppings);
            startActivity(i3);



        }


}

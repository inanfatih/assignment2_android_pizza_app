package com.example.fatih.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class ExtraTopping extends AppCompatActivity {
    public String extraToppings = "";

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
                extraToppings = extraToppings + "Cheese, ";
            }
            if (greenPepperBox.isChecked())
            {
                extraToppings = extraToppings + "Green Pepper, ";
            }

            if (smokedHamBox.isChecked())
            {
                extraToppings = extraToppings + "Smoked Ham, ";
            }

            if (spinachBox.isChecked())
            {
                extraToppings = extraToppings + "Spinach, ";
            }

            if (blackOlivesBox.isChecked())
            {
                extraToppings = extraToppings + "Black Olives, ";
            }

            if (spanishOnionsBox.isChecked())
            {
                extraToppings = extraToppings + "Spanish Onions";
            }

            i3.putExtra("toppings", extraToppings);
            startActivity(i3);

        }


}

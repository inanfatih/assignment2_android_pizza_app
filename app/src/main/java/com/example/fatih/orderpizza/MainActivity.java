package com.example.fatih.orderpizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.fatih.orderpizza.R.id.meatsupreme;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){

            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.pizzaoptions, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item)
        {

            switch (item.getItemId()) {
                case meatsupreme:
                    Toast.makeText(this, "You selected Meat Supreme!", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, pizza_size.class);
                    i.putExtra("pizzatype", "Meat Supreme");
                    startActivity(i);
            }
            switch (item.getItemId()) {
                case R.id.superhawaiian:
                    Toast.makeText(this, "You selected Super Hawaiian!", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, pizza_size.class);
                    i.putExtra("pizzatype", "Super Hawaiian");
                    startActivity(i);
            }


            switch (item.getItemId()) {
                case R.id.veggie:
                    Toast.makeText(this, "You selected Veggie!", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, pizza_size.class);
                    i.putExtra("pizzatype", "Veggie");
                    startActivity(i);
            }


            switch (item.getItemId()) {
                case R.id.mediterranean:
                    Toast.makeText(this, "You selected Mediterranean!", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, pizza_size.class);
                    i.putExtra("pizzatype", "Mediterranean");
                    startActivity(i);
            }


            switch (item.getItemId()) {
                case R.id.cheddarsupreme:
                    Toast.makeText(this, "You selected Cheddar Supreme!", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, pizza_size.class);
                    i.putExtra("pizzatype", "Cheddar Supreme");
                    startActivity(i);
            }

            return super.onOptionsItemSelected(item);
        }


    }

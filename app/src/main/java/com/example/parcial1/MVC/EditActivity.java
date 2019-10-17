package com.example.parcial1.MVC;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.parcial1.Producto;
import com.example.parcial1.R;

import static com.example.parcial1.MainActivity.prod;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.edit_title);

        actionBar.setDisplayHomeAsUpEnabled(true);

        EdModel p = new EdModel(prod.getNombre(), prod.getCantidad(), prod.getPrecio());//mi modelo
        EdController c = new EdController(p); //mi controller
        EdListener ml = new EdListener(c);//mi listener
        EdView v = new EdView(p, this, ml);//mi view
        c.setView(v);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (android.R.id.home == item.getItemId()) {
            super.finish();
        }
        return super.onOptionsItemSelected(item);

    }

    public void finalizar() {
        super.finish();
    }
}
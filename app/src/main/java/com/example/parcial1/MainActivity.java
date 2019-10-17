package com.example.parcial1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.parcial1.MVC.EditActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static List<Producto> productos;
    public static Producto prod;
    RecyclerView rv;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productos = new ArrayList<Producto>();

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.title);


        for(int i=0; i<12; i++){
            productos.add(new Producto("Producto "+(i +1), 34,13.00));
        }
        rv = (RecyclerView) this.findViewById(R.id.rvListado);
        adapter = new MyAdapter(productos,this);
        rv.setAdapter(adapter);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        //lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        //GridLayoutManager lm = new GridLayoutManager(this, 2);
        rv.setLayoutManager(lm);
    }

    public void editarProducto(int posicion){
        prod = this.productos.get(posicion);
        Intent i = new Intent(this, EditActivity.class);
        startActivity(i);
        this.productos.set(posicion, prod);
        this.adapter.notifyDataSetChanged();
    }


    @Override
    protected void onResume() {
        super.onResume();

        this.adapter.notifyDataSetChanged();

    }


    public void controlStock(int posicion,int num){
        Producto p = this.productos.get(posicion);
            p.setCantidad(p.getCantidad()+num);
           this.adapter.notifyDataSetChanged();

    }
}

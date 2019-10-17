package com.example.parcial1;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


public class MyViewHolder extends  RecyclerView.ViewHolder {
    public View v;
    public TextView tvNombre;
    public TextView tvCantidad;
    public TextView tvPrecio;
    public Button btnMenos;
    public Button btnMas;
    int posicion;

    public MyViewHolder(View itemView, MainActivity activity){
super(itemView);
this.v = itemView;
MyListener myListener = new MyListener(this, activity);
NewListener newListener = new NewListener(this, activity,-1);
NewListener newListener2 = new NewListener(this, activity,1);
//v.setOnClickListener(myListener);

this.tvNombre = v.findViewById(R.id.tvNombre);
this.tvCantidad = v.findViewById(R.id.tvCantidad);
this.tvPrecio = v.findViewById(R.id.tvPrecio);
this.btnMenos = v.findViewById((R.id.btnMenos));
this.btnMas = v.findViewById((R.id.btnMas));

tvNombre.setOnClickListener(myListener);
btnMenos.setOnClickListener(newListener);
btnMas.setOnClickListener(newListener2);

    }

}

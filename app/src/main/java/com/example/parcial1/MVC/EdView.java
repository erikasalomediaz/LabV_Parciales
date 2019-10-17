package com.example.parcial1.MVC;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.parcial1.R;

import static com.example.parcial1.MainActivity.prod;

public class EdView {
    private EditText etNombre;
    private TextView etCantidad;
    private EditText etPrecio;
    private Button btn;
    private EdModel modelo;
    private EditActivity mac;
    public EdView(EdModel modelo, EditActivity mac, EdListener listener){
        this.mac = mac;
        this.etNombre = (EditText) mac.findViewById(R.id.etNombre);
        this.etCantidad = (TextView) mac.findViewById(R.id.etCantidad);
        this.etPrecio = (EditText) mac.findViewById(R.id.etPrecio);
        this.btn = (Button)mac.findViewById(R.id.btnEditar);

        this.btn.setOnClickListener(listener);
        this.modelo = modelo;
        //aca le seteo el dato que ya tiene cargado
        this.etNombre.setText(this.modelo.getNombre());
        this.etPrecio.setText(this.modelo.getPrecio() + "");
        this.etCantidad.setText(this.modelo.getCantidad() + "");
    }

    public void cargarProducto(){

        prod.setNombre((this.etNombre.getText().toString()));
        prod.setCantidad(Integer.valueOf((this.etCantidad.getText()).toString()));
        prod.setPrecio(Double.valueOf((this.etPrecio.getText()).toString()));

        this.mac.finalizar();

    }
}

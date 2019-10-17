package com.example.parcial1.MVC;

import android.util.Log;

import static com.example.parcial1.MainActivity.prod;

public class EdController {



   EdModel modelo;
   EdView view;

    public EdController(EdModel p) {
        this.modelo = p;
    }

    public void editarProducto(){
        //aca cargo los datos de los producto
        view.cargarProducto();

    }

    public void setView(EdView v){
        this.view = v;
    }
}

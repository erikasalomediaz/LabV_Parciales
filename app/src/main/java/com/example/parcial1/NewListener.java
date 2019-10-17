package com.example.parcial1;

import android.view.View;

public class NewListener implements View.OnClickListener  {
    MyViewHolder mvh;
    MainActivity mainAct;
    private int num;

    public NewListener(MyViewHolder mvh, MainActivity mainAct, int num){
        this.mvh = mvh;
        this.mainAct = mainAct;
        this.num = 1;
    }

    @Override
    public void onClick(View v){
        this.mainAct.controlStock(mvh.posicion, num);

    }
}

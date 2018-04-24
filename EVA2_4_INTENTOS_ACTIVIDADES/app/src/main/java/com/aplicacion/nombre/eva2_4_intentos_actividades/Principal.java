package com.aplicacion.nombre.eva2_4_intentos_actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
    Intent inLanzarSecun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //ACTION-->ACTIVIDAD DESDE DONDE SE EJECUTA EL INTENT
        //DATOS -->ACTIVIDAD QUE SE VA A LANZAR
        inLanzarSecun=new Intent(this,Secundaria.class);
    }

    public void lanzarAct(View view) {
    startActivity(inLanzarSecun);
    }


}

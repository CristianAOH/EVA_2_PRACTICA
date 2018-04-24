package com.aplicacion.nombre.eva2_5_trans_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView txtV_mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        //CREAR INTENTO PARA RECUPERAR Y LEER LOS DATOS
        Intent inDatos=getIntent();
        String cad=inDatos.getStringExtra("MENSAJE");
        txtV_mostrar=(TextView)findViewById(R.id.txtV_mostrar);
        txtV_mostrar.setText(cad);
    }

    public void cerrar(View view) {
        finish();
    }
}

package com.aplicacion.nombre.eva2_5_trans_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    Intent inLanzar;
    EditText edTxt_datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inLanzar=new Intent(this,Secundaria.class);
        edTxt_datos=(EditText)findViewById(R.id.edTxt_datos);
    }

    public void mandarDatos(View view) {
        String cad=edTxt_datos.getText().toString();
        inLanzar.putExtra("MENSAJE",cad);
        startActivity(inLanzar);
    }
}

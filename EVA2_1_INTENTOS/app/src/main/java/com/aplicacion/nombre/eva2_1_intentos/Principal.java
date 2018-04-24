package com.aplicacion.nombre.eva2_1_intentos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    EditText eTxt_tel;
    Intent inLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        eTxt_tel=(EditText)findViewById(R.id.eTxt_telefono);
    }

    public void Click(View v){
        String sCade=eTxt_tel.getText().toString();
        //Protocolo:numero--> tel:
        sCade="tel:"+sCade;
        inLlamar =new Intent(Intent.ACTION_DIAL, Uri.parse(sCade));
        startActivity(inLlamar);
    }
}

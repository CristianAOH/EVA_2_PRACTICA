package com.aplicacion.nombre.eva2_2_intento_sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements Button.OnClickListener{
    EditText eTxt_tel,eTxt_mensaje;
    Button btn_ok;
    Intent inSendSMS,inLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        eTxt_tel=(EditText)findViewById(R.id.eTxt_tel);
        eTxt_mensaje=(EditText)findViewById(R.id.eTxt_mensaje);
        btn_ok=(Button)findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sTel="smsto:"+eTxt_tel.getText().toString();
        String sMensa=eTxt_mensaje.getText().toString();
        inSendSMS=new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));
        inSendSMS.putExtra("sms_body",sMensa);
        startActivity(inSendSMS);
    }

    public void otroClick(View v){
        String sTel="tel:"+eTxt_tel.getText().toString();
        inLlamar=new Intent(Intent.ACTION_CALL,Uri.parse(sTel));
        startActivity(inLlamar);
    }
}

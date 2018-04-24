package com.aplicacion.nombre.eva2_3_intentos_ver_contactos;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    Intent inMostrarContac,inBuscarGoogle,inVerImage;
    EditText edTxt_buqueda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inVerImage=new Intent(Intent.ACTION_GET_CONTENT);
        inVerImage.setType("images/pictures/*");
        setContentView(R.layout.activity_principal);
        edTxt_buqueda=(EditText)findViewById(R.id.edTxt_busqueda);
        String sBuscar="content://contacts/people/";
        inMostrarContac=new Intent(Intent.ACTION_VIEW, Uri.parse(sBuscar));
    }

    public void Click(View v){
        startActivity(inMostrarContac);
    }

    public void Buscar(View v){
        String cad=edTxt_buqueda.getText().toString();
        inBuscarGoogle=new Intent(Intent.ACTION_WEB_SEARCH);
        inBuscarGoogle.putExtra(SearchManager.QUERY,cad);
        startActivity(inBuscarGoogle);
    }

    public void verImagen(View v) {
        startActivity(inVerImage);
    }
}

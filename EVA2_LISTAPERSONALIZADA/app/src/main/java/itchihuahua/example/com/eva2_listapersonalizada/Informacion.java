package itchihuahua.example.com.eva2_listapersonalizada;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {
    ImageView imgV_detalle;
    TextView txtV_deTitulo, txtV_deDescrip, txtV_deDireccion, txtV_deTelefono;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        imgV_detalle=(ImageView)findViewById(R.id.imgV_detalle);
        txtV_deTitulo=(TextView)findViewById(R.id.txtV_deTitulo);
        txtV_deDescrip=(TextView)findViewById(R.id.txtV_deDescrip);
        txtV_deDireccion=(TextView)findViewById(R.id.txtV_deDireccion);
        txtV_deTelefono=(TextView)findViewById(R.id.txtV_deTelefono);
        Bundle bundle=getIntent().getExtras();
        String titulo=bundle.getString("TITULO");
        String descripcion=bundle.getString("DESCRIPCION");
        String direccion=bundle.getString("DIRECCION");
        String telefono=bundle.getString("TELEFONO");
        int imagen=bundle.getInt("IMAGEN");
        imgV_detalle.setImageResource(imagen);
        txtV_deTitulo.setText(titulo);
        txtV_deDescrip.setText(descripcion);
        txtV_deDireccion.setText(direccion);
        txtV_deTelefono.setText(telefono);
        txtV_deTelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+txtV_deTelefono.getText().toString()));
                startActivity(i);
            }
        });

    }
}

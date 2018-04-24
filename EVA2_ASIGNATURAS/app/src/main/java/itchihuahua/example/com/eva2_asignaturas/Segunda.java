package itchihuahua.example.com.eva2_asignaturas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {
    ImageView imgV_docente;
    TextView txtV_asignatura, txtV_creditos, txtV_docente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        imgV_docente=(ImageView)findViewById(R.id.imgV_docente);
        txtV_asignatura=(TextView)findViewById(R.id.txtV_asignatura);
        txtV_creditos=(TextView)findViewById(R.id.txtV_creditos);
        txtV_docente=(TextView)findViewById(R.id.txtV_docente);
        Bundle bundle=getIntent().getExtras();
        String asign=bundle.getString("ASIGNATURA");
        String creditos=bundle.getString("CREDITOS");
        String docente=bundle.getString("DOCENTE");
        int imagen=bundle.getInt("IMAGEN");
        txtV_asignatura.setText(asign);
        txtV_creditos.setText(creditos);
        txtV_docente.setText(docente);
        imgV_docente.setImageResource(imagen);
    }
}

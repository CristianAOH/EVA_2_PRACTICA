package itchihuahua.example.com.eva2_asignaturas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    Intent inLanzarProfe;
    ListView lstV_asignaturas;
    String [] nombre={
            "Fundamentos de Programacion                    ",
            "Programacion Orientada a Objetos               ",
            "Estructura de Datos                            ",
            "Topicos Avanzados de Programacion              ",
            "Fundamentos de Base de Datos                   ",
            "Taller de Base de Datos                        ",
            "Fundamentos de Telecomunicaciones              ",
            "Redes de Computadoras                          ",
            "Administracion de Base de Datos                ",
            "Programacion Web                               ",
            "Conmutacion y Enrutamiento                     ",
            "Aplicaciones para Dispositivos Moviles I       ",
            "Administracion de Redes                        ",
            "Aplicaciones para Dispositivos Moviles II      ",
            "Aplicaciones Hibridas para Dispositivos Moviles",
            "Inteligencia Artificial                        ",
            "Aplicaciones para Dispositivos Moviles III     "};

    Integer [] imgAsignaturas={
      R.drawable.programacion,
            R.drawable.programacion,
            R.drawable.basedatos,
            R.drawable.programacion,
            R.drawable.basedatos,
            R.drawable.basedatos,
            R.drawable.redes,
            R.drawable.redes,
            R.drawable.basedatos,
            R.drawable.programacion,
            R.drawable.redes,
            R.drawable.programacion,
            R.drawable.redes,
            R.drawable.programacion,
            R.drawable.programacion,
            R.drawable.programacion,
            R.drawable.programacion
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inLanzarProfe=new Intent(this,Segunda.class);
        lstV_asignaturas=(ListView)findViewById(R.id.lstV_asignaturas);
        MostrarListAdapter adaptador=new MostrarListAdapter(this,nombre,imgAsignaturas);
        lstV_asignaturas.setAdapter(adaptador);
        lstV_asignaturas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle=new Bundle();
                switch (position){
                    case 0:
                        bundle.putString("ASIGNATURA","Fundamentos de Programacion");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","ARZAGA SALAZAR FRANCISCO JAVIER");
                        bundle.putInt("IMAGEN",R.drawable.profeuno);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 1:
                        bundle.putString("ASIGNATURA","Programacion Orientada a Objetos   ");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","AYALA GARCIA ANDRES EDUARDO");
                        bundle.putInt("IMAGEN",R.drawable.profedos);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 2:
                        bundle.putString("ASIGNATURA","Estructura de Datos ");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","CALZADILLAS OGAZ MARIO YAIR");
                        bundle.putInt("IMAGEN",R.drawable.profetres);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 3:
                        bundle.putString("ASIGNATURA","Topicos Avanzados de Programacion ");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","CARDENAS LEYVA KARLA PAMELA");
                        bundle.putInt("IMAGEN",R.drawable.profecuatro);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 4:
                        bundle.putString("ASIGNATURA","Fundamentos de Base de Datos  ");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","CARRILLO ESTRADA VANESSA JANETH");
                        bundle.putInt("IMAGEN",R.drawable.profeseis);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 5:
                        bundle.putString("ASIGNATURA","Taller de Base de Datos");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","CARRILLO SOTO CRISTIAN JAASIEL");
                        bundle.putInt("IMAGEN",R.drawable.profesiete);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 6:
                        bundle.putString("ASIGNATURA","Fundamentos de Telecomunicaciones");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","CASTELLANOS AZUELA EMMANUEL");
                        bundle.putInt("IMAGEN",R.drawable.profeuno);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 7:
                        bundle.putString("ASIGNATURA","Redes de Computadoras");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","CASTILLO JARA GERMAN");
                        bundle.putInt("IMAGEN",R.drawable.profedos);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 8:
                        bundle.putString("ASIGNATURA","Administracion de Base de Datos  ");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","GALINDO PAYAN JASON LEONEÑ");
                        bundle.putInt("IMAGEN",R.drawable.profetres);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 9:
                        bundle.putString("ASIGNATURA","Programacion Web    ");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","GARCIA FLORES ROBERTO");
                        bundle.putInt("IMAGEN",R.drawable.profecuatro);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 10:
                        bundle.putString("ASIGNATURA","Conmutacion y Enrutamiento");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","GARCIA CHAVEZ CRISTIAN IVAN");
                        bundle.putInt("IMAGEN",R.drawable.profeseis);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 11:
                        bundle.putString("ASIGNATURA","Aplicaciones para Dispositivos Moviles I");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","LOPEZ CHAVEZ AARON");
                        bundle.putInt("IMAGEN",R.drawable.profesiete);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 12:
                        bundle.putString("ASIGNATURA","Administracion de Redes");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","LOPEZ CHAVEZ HUMBERTO MARTIN");
                        bundle.putInt("IMAGEN",R.drawable.profeuno);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 13:
                        bundle.putString("ASIGNATURA","Aplicaciones para Dispositivos Moviles II ");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","ORONA SALAZAR ALBERTO");
                        bundle.putInt("IMAGEN",R.drawable.profedos);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 14:
                        bundle.putString("ASIGNATURA","Aplicaciones Hibridas para Dispositivos Moviles");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","RAMIREZ DIAZ JANELY");
                        bundle.putInt("IMAGEN",R.drawable.profetres);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 15:
                        bundle.putString("ASIGNATURA","Inteligencia Artificial");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","RIVERA VILLASEÑOR BRYAN");
                        bundle.putInt("IMAGEN",R.drawable.profecuatro);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                    case 16:
                        bundle.putString("ASIGNATURA","Aplicaciones para Dispositivos Moviles III");
                        bundle.putString("CREDITOS","5");
                        bundle.putString("DOCENTE","TORRES ORTEGA LUIS ALBERTO");
                        bundle.putInt("IMAGEN",R.drawable.profeseis);
                        inLanzarProfe.putExtras(bundle);
                        startActivity(inLanzarProfe);
                        break;
                }
            }
        });
    }
}

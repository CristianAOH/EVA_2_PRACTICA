package itchihuahua.example.com.eva2_listapersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    Intent inLanzarDetalles;

    private String restaurantes[]=new String[]{"Barra Fina","Bourke Street Bakery","Cafe Dead End","Cafe Loisl"
            ,"Cafe Lore","Confessional", "Donostia","Five Leaves","Forkee Restaurant","Graham Avenue Meats","Haighs Chocolate"
    ,"Home I","Palomino Espresso","Petiteoyster","Posatelier","Royaloak","Teakha","Thai Cafe","Traif","Upstate","Waffle Wolf"};

    private String descripcion[]=new String[]{"Restaurant Gourmet","Cafe","Cafeteria","Cafe Gourmet"
            ,"Cafe Gourmet","Pizzas", "Restaurant Gourmet","Restaurant Gourmet","Restaurant Gourmet","Restaurant Gourmet","Restaurant"
            ,"Restaurant Gourmet","Postres","Mariscos","Restaurant Gourmet","Restaurant Gourmet","Restaurant Gourmet","Cafeteria","Restaurant Gourmet","Restaurant Gourmet","Postres"};


    private Integer[] imgRest={
            R.drawable.barrafina,
            R.drawable.bourkestreetbakery,
            R.drawable.cafedeadend,
            R.drawable.cafeloisl,
            R.drawable.cafelore,
            R.drawable.confessional,
            R.drawable.donostia,
            R.drawable.fiveleaves,
            R.drawable.forkeerestaurant,
            R.drawable.grahamavenuemeats,
            R.drawable.haighschocolate,
            R.drawable.homei,
            R.drawable.palominoespresso,
            R.drawable.petiteoyster,
            R.drawable.posatelier,
            R.drawable.royaloak,
            R.drawable.teakha,
            R.drawable.thaicafe,
            R.drawable.traif,
            R.drawable.upstate,
            R.drawable.wafflewolf};
    ListView lstV_restaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inLanzarDetalles=new Intent(this,Informacion.class);
        lstV_restaurantes=(ListView)findViewById(R.id.lstV_restaurantes);
        ResListAdapter adaptador=new ResListAdapter(this,restaurantes,descripcion,imgRest);
        lstV_restaurantes.setAdapter(adaptador);
        lstV_restaurantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle=new Bundle();
                //Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        bundle.putString("TITULO","Barra Fina");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #8552");
                        bundle.putString("TELEFONO","4359138");
                        bundle.putInt("IMAGEN",R.drawable.barrafina);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 1:
                        bundle.putString("TITULO","Boruke Street Bakery");
                        bundle.putString("DESCRIPCION","Cafe");
                        bundle.putString("DIRECCION","Por aqui y por alla #8552");
                        bundle.putString("TELEFONO","8523157");
                        bundle.putInt("IMAGEN",R.drawable.bourkestreetbakery);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 2:
                        bundle.putString("TITULO","Cafe Dead End");
                        bundle.putString("DESCRIPCION","Cafeteria");
                        bundle.putString("DIRECCION","Por aqui y por alla #8552");
                        bundle.putString("TELEFONO","8522257");
                        bundle.putInt("IMAGEN",R.drawable.cafedeadend);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 3:
                        bundle.putString("TITULO","Cafe Lois L");
                        bundle.putString("DESCRIPCION","Cafe Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #5214");
                        bundle.putString("TELEFONO","5689321");
                        bundle.putInt("IMAGEN",R.drawable.cafeloisl);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 4:
                        bundle.putString("TITULO","Cafe Lore");
                        bundle.putString("DESCRIPCION","Cafe Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #41258");
                        bundle.putString("TELEFONO","58532");
                        bundle.putInt("IMAGEN",R.drawable.cafelore);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 5:
                        bundle.putString("TITULO","Confessional");
                        bundle.putString("DESCRIPCION","Pizzas");
                        bundle.putString("DIRECCION","Por aqui y por alla #87452");
                        bundle.putString("TELEFONO","87445287");
                        bundle.putInt("IMAGEN",R.drawable.confessional);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 6:
                        bundle.putString("TITULO","Donostia");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #12548");
                        bundle.putString("TELEFONO","259886");
                        bundle.putInt("IMAGEN",R.drawable.donostia);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 7:
                        bundle.putString("TITULO","Five Leaves");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #1286");
                        bundle.putString("TELEFONO","8652541");
                        bundle.putInt("IMAGEN",R.drawable.fiveleaves);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 8:
                        bundle.putString("TITULO","Forkee Restaurant");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #15247");
                        bundle.putString("TELEFONO","35851");
                        bundle.putInt("IMAGEN",R.drawable.forkeerestaurant);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 9:
                        bundle.putString("TITULO","Graham Avenue Meats");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #12458");
                        bundle.putString("TELEFONO","5433383");
                        bundle.putInt("IMAGEN",R.drawable.grahamavenuemeats);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 10:
                        bundle.putString("TITULO","Haighs Chocolate");
                        bundle.putString("DESCRIPCION","Restaurant");
                        bundle.putString("DIRECCION","Por aqui y por alla #123564");
                        bundle.putString("TELEFONO","8696344");
                        bundle.putInt("IMAGEN",R.drawable.haighschocolate);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 11:
                        bundle.putString("TITULO","Home I");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #5874");
                        bundle.putString("TELEFONO","6988732");
                        bundle.putInt("IMAGEN",R.drawable.homei);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 12:
                        bundle.putString("TITULO","Palomino Espresso");
                        bundle.putString("DESCRIPCION","Postres");
                        bundle.putString("DIRECCION","Por aqui y por alla #522184");
                        bundle.putString("TELEFONO","6953215");
                        bundle.putInt("IMAGEN",R.drawable.palominoespresso);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 13:
                        bundle.putString("TITULO","Petiteoyster");
                        bundle.putString("DESCRIPCION","Mariscos");
                        bundle.putString("DIRECCION","Por aqui y por alla #2531");
                        bundle.putString("TELEFONO","23565448");
                        bundle.putInt("IMAGEN",R.drawable.petiteoyster);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 14:
                        bundle.putString("TITULO","Posatelier");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #1254+");
                        bundle.putString("TELEFONO","3464384");
                        bundle.putInt("IMAGEN",R.drawable.posatelier);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 15:
                        bundle.putString("TITULO","Royaloak");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #12547");
                        bundle.putString("TELEFONO","21323589");
                        bundle.putInt("IMAGEN",R.drawable.royaloak);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 16:
                        bundle.putString("TITULO","Teakha");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #15984");
                        bundle.putString("TELEFONO","36584216");
                        bundle.putInt("IMAGEN",R.drawable.teakha);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 17:
                        bundle.putString("TITULO","Thai Cafe");
                        bundle.putString("DESCRIPCION","Cafeteria");
                        bundle.putString("DIRECCION","Por aqui y por alla #87511");
                        bundle.putString("TELEFONO","165381");
                        bundle.putInt("IMAGEN",R.drawable.thaicafe);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 18:
                        bundle.putString("TITULO","Traif");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #4512");
                        bundle.putString("TELEFONO","335651115");
                        bundle.putInt("IMAGEN",R.drawable.traif);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 19:
                        bundle.putString("TITULO","Upstate");
                        bundle.putString("DESCRIPCION","Restaurant Gourmet");
                        bundle.putString("DIRECCION","Por aqui y por alla #9852");
                        bundle.putString("TELEFONO","322165486");
                        bundle.putInt("IMAGEN",R.drawable.upstate);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                    case 20:
                        bundle.putString("TITULO","Waffle Wolf");
                        bundle.putString("DESCRIPCION","Postres");
                        bundle.putString("DIRECCION","Por aqui y por alla #8556");
                        bundle.putString("TELEFONO","6145286321");
                        bundle.putInt("IMAGEN",R.drawable.wafflewolf);
                        inLanzarDetalles.putExtras(bundle);
                        startActivity(inLanzarDetalles);
                        break;
                }
            }
        });
    }
}

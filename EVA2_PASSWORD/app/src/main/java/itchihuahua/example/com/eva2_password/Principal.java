package itchihuahua.example.com.eva2_password;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void acceso(View v){
        final Dialog dlg_acceso=new Dialog(this);
        dlg_acceso.setContentView(R.layout.acceso);

        final ImageView imgV_random=(ImageView)dlg_acceso.findViewById(R.id.imV_imagenRandom);
        final EditText edtxt_usuario=(EditText) dlg_acceso.findViewById(R.id.edtxt_usuario);
        final EditText edtxt_password=(EditText) dlg_acceso.findViewById(R.id.edtxt_password);
        final Button btn_aceptar=(Button) dlg_acceso.findViewById(R.id.btn_aceptar);
        final Button btn_cancelar=(Button) dlg_acceso.findViewById(R.id.btn_cancelar);
        final Intent inLanzarSegunda= new Intent(getApplicationContext(),Segunda.class);
        Random rand = new Random();
        int n = rand.nextInt(5) + 1;
        if(n==1){
            imgV_random.setImageResource(R.drawable.uno);
        }else if(n==2){
            imgV_random.setImageResource(R.drawable.dos);
        }else if(n==3){
            imgV_random.setImageResource(R.drawable.tres);
        }else if(n==4){
            imgV_random.setImageResource(R.drawable.cuatro);
        }else if(n==5){
            imgV_random.setImageResource(R.drawable.cinco);
        }
        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=edtxt_usuario.getText().toString();
                String contraseña=edtxt_password.getText().toString();
                if(usuario.equals("cristian") && contraseña.equals("123") ){
                    finish();
                    startActivity(inLanzarSegunda);
                }else if(usuario.equals("arturo") && contraseña.equals("123") ){
                    finish();
                    startActivity(inLanzarSegunda);
                }else if(usuario.equals("karla") && contraseña.equals("123") ){
                    finish();
                    startActivity(inLanzarSegunda);
                }else if(usuario.equals("edgar") && contraseña.equals("123") ){
                    finish();
                    startActivity(inLanzarSegunda);
                }else if(usuario.equals("profesor") && contraseña.equals("123") ){
                    finish();
                    startActivity(inLanzarSegunda);
                }else{
                    Toast.makeText(getApplicationContext(),"Usuario y/o Contraseña invalido",Toast.LENGTH_SHORT).show();
                    edtxt_usuario.setText("");
                    edtxt_password.setText("");
                }
            }
        });

        btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlg_acceso.hide();
            }
        });

        dlg_acceso.show();
    }

    public void salir(View v){
        finish();
    }
}

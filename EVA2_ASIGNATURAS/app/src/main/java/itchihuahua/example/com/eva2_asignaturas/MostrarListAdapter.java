package itchihuahua.example.com.eva2_asignaturas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Cristian on 22/04/2018.
 */

public class MostrarListAdapter extends ArrayAdapter<String> {
    Activity context;
    String[] itemname;
    Integer[] itemfoto;

    public MostrarListAdapter(Activity context, String[] itemname, Integer[] itemfoto) {
        super(context, R.layout.modelo, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.itemfoto=itemfoto;
    }

    public View getView(int posicion, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.modelo, null, true);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgV_materia);
        TextView txtV_nombre = (TextView) rowView.findViewById(R.id.txtV_asignatura);
        imageView.setImageResource(itemfoto[posicion]);
        txtV_nombre.setText(itemname[posicion]);
        return rowView;
    }
}

package ar.edu.proyectosort.zapando;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MatchActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;

    String nombre = "Ary";
    String apellido ="Degtiar";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        lvItems = (ListView) findViewById(R.id.lvItems);
        adaptador = new Adaptador(this, GetArrayItems());
        lvItems.setAdapter(adaptador);

    }

    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.boton_verde, "Ary","18"));
        listItems.add(new Entidad(R.drawable.boton_verde, "Marto","18"));
        listItems.add(new Entidad(R.drawable.boton_verde,"pedo","caqita"));

        return listItems;
    }

    public void pmatch(View v){
        Intent intent = new Intent(this, PerfilMatcheadoActivity.class);
        intent.putExtra("nombre",nombre.toString());
        intent.putExtra("apellido",apellido.toString());
        startActivity(intent);
    }

}

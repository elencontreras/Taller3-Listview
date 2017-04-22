package com.example.android.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lopciones;
    private Resources res;
    private String[] opc;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        res=getResources();

        lopciones=(ListView)findViewById(R.id.lvOpciones);
        opc=res.getStringArray(R.array.opciones);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc);
        lopciones.setAdapter(adapter);

        lopciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        i=new Intent(Principal.this,Areas.class);
                        startActivity(i);
                        break;
                    case 1:
                        i=new Intent(Principal.this,ListadoOperaciones.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}

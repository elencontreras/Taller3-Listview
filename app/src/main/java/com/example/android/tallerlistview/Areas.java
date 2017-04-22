package com.example.android.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lAreas;
    private Resources res;
    private String [] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);

        res=this.getResources();

        lAreas=(ListView)findViewById(R.id.lvareas);
        opc=res.getStringArray(R.array.areas);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,opc);
        lAreas.setAdapter(adapter);

        lAreas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        i=new Intent(Areas.this,Cuadrado.class);
                        startActivity(i);
                        break;
                    case 1:
                        i=new Intent(Areas.this,Triangulo.class);
                        startActivity(i);
                        break;
                }
            }
        });

    }
}

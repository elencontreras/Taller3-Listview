package com.example.android.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoTriangulo extends AppCompatActivity {
    private TextView mostrar;
    private Double result;
    private Bundle b;
    private Intent i;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_triangulo);

        res=this.getResources();
        mostrar=(TextView)findViewById(R.id.txtResultado);

        b=getIntent().getExtras();
        result=b.getDouble("result");

        mostrar.setText(result+"");

    }

    public void ok(View v){
        i=new Intent(this,Triangulo.class);
        startActivity(i);

    }
}

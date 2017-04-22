package com.example.android.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {
    private EditText cajalado;
    private Resources res;
    private Intent i;
    private Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        res=this.getResources();

        cajalado=(EditText)findViewById(R.id.txtLado);

        i=new Intent(this,RespuestaCuadrado.class);

        b=new Bundle();

    }

    public void calcularCuadrado(View v){
        double lado, area=0;
        String l="Lado: ";
        String nombOperacion="Area del Cuadrado";
        lado=Double.parseDouble(cajalado.getText().toString().trim());
        if (validar()) {
            area = lado * lado;

            l = l + area;


            b.putDouble("result", area);
            i.putExtras(b);
            startActivity(i);
        
        Operacion o= new Operacion(nombOperacion,l,area);
        o.guardar();
        }

    }

    public void borrar(View v){
        cajalado.setText("");
    }

    public boolean validar(){
        if (cajalado.getText().toString().isEmpty()){
            cajalado.setError(getResources().getString(R.string.mensajeError));
            return false;
        }
        return true;
    }
}

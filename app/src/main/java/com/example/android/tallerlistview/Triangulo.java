package com.example.android.tallerlistview;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Triangulo extends AppCompatActivity {
    private EditText cajaBase;
    private EditText cajaAltura;
    private Intent i;
    private Bundle b;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        cajaBase=(EditText)findViewById(R.id.txtBase);
        cajaAltura=(EditText)findViewById(R.id.txtAltura);

        i=new Intent(this,ResultadoTriangulo.class);

        b=new Bundle();
    }

    public void calcularTriangulo(View v){
        Double base, altura, area;
        String ba="Base: ",alt="Altura: ", nombOperacion="Area del Triangulo", aux;

        base=Double.parseDouble(cajaBase.getText().toString().trim());
        altura=Double.parseDouble(cajaAltura.getText().toString().trim());
        if (validar()) {
            
        
        area=(base*altura)/2;

        ba=ba+base;
        alt=alt+altura;
        aux=ba+"\n"+alt;
        b.putDouble("result",area);
        i.putExtras(b);
        startActivity(i);
        
        
        Operacion o= new Operacion(nombOperacion,aux,area);
        o.guardar();
        }
    }

    public void borrar(View v){
        cajaBase.setText("");
        cajaAltura.setText("");
    }

    public boolean validar(){
        if (cajaBase.getText().toString().isEmpty()){
            cajaBase.setError(getResources().getString(R.string.mensajeError));
            return false;
        }
        if (cajaAltura.getText().toString().isEmpty()) {
           cajaAltura.setError(getResources().getString(R.string.mensajeError)); 
        }
        return true;
    }
}

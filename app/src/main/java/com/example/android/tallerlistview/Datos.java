package com.example.android.tallerlistview;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Android on 21/04/2017.
 */

public class Datos {

    private static ArrayList<Operacion> operaciones= new ArrayList<>();

    public static void guardar(Operacion o) {
        operaciones.add(o);
    }

    public static ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }
}

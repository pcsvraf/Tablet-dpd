package com.example.quickstart;

import java.util.ArrayList;

/*
 Se instancian cada una de las preguntas que tendra la aplicacion
 */

public class GuardarDatos {

    //instanciación global
    public static GuardarDatos instancia = new GuardarDatos();

    //datos

    private ArrayList<String> opcion1 = new ArrayList<String>();
    
    //obtener datos
    public ArrayList<String> getOpciones(){
        return opcion1;
    }

    private ArrayList<String> opcion2 = new ArrayList<String>();

    //obtener datos
    public ArrayList<String> getOpciones2(){
        return opcion2;
    }

    private ArrayList<String> opcion3 = new ArrayList<String>();

    //obtener datos
    public ArrayList<String> getOpciones5(){
        return opcion5;
    }


    private ArrayList<String> opcion5 = new ArrayList<String>();

    //obtener datos
    public ArrayList<String> getOpciones3(){
        return opcion3;
    }


    private ArrayList<String> opcion4 = new ArrayList<String>();

    //obtener datos
    public ArrayList<String> getOpciones4(){
        return opcion4;
    }

    }

package com.example.quickstart;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.util.ExponentialBackOff;

import java.util.ArrayList;
import java.util.Arrays;

public class primero extends AppCompatActivity{
    PrincipalActivity timee;
    GuardarDatos datos;
    Animation uptodown,downtoup;
    GoogleAccountCredential mCredential;
    private TextView mOutputText;
    private Button mCallApiButton;
    RadioGroup radio;
    Button BOTON_RESPUESTAS, boton, boton1, boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
    ProgressDialog mProgress;
    TextView texto,txt;
    String seleccionado;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);
        //instanciación global
        datos = GuardarDatos.instancia;
        final ArrayList<String> opcion5 = datos.getOpciones5();
        txt = (TextView) findViewById(R.id.textView4);
        BOTON_RESPUESTAS = (Button) findViewById(R.id.BTNsiguiente5);
        texto = (TextView) findViewById(R.id.textotime4);
        boton = (Button)findViewById(R.id.volver);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        //radio = (RadioGroup) findViewById(R.id.radioprimero);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#006064")));
        txt.setText(Html.fromHtml(getResources().getString(R.string.primero)));
        timee = PrincipalActivity.intancia;
        CountDownTimer countDownTimer = PrincipalActivity.mCountDownTimer;

        boton1 = (Button)findViewById(R.id.certificado);
        boton2 = (Button)findViewById(R.id.ingreso);
        boton3 = (Button)findViewById(R.id.sansiones);
        boton4 = (Button)findViewById(R.id.reconocimiento);
        boton5 = (Button)findViewById(R.id.matricula);
        boton6 = (Button)findViewById(R.id.solicitud);
        boton7 = (Button)findViewById(R.id.tne);
        boton8 = (Button)findViewById(R.id.retiro);
        boton9 = (Button)findViewById(R.id.otras);
        int nose = 0;

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton1.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton2.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton3.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton4.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton5.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton6.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton7.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton8.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton9.getText().toString();
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
}
}

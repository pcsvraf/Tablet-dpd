package com.example.quickstart;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import com.google.api.client.util.ExponentialBackOff;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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
    TextView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    String seleccionado;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);
        //instanciación global
        txt = (TextView) findViewById(R.id.textView4);
        BOTON_RESPUESTAS = (Button) findViewById(R.id.BTNsiguiente5);
        datos = GuardarDatos.instancia;
        final ArrayList<String> opcion5 = datos.getOpciones5();
        texto = (TextView) findViewById(R.id.textotime4);
        boton = (Button)findViewById(R.id.volver);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        //radio = (RadioGroup) findViewById(R.id.radioprimero);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#006064")));
        txt.setText(Html.fromHtml(getResources().getString(R.string.primero)));
        timee = PrincipalActivity.intancia;
        CountDownTimer countDownTimer = PrincipalActivity.mCountDownTimer;

        img1 = (TextView) findViewById(R.id.certificados);
        img2 = (TextView) findViewById(R.id.ingreso);
        img3 = (TextView) findViewById(R.id.matricula);
        img4 = (TextView) findViewById(R.id.reconocimiento);
        img5 = (TextView) findViewById(R.id.sanciones);
        img6 = (TextView) findViewById(R.id.solicitud);
        img7 = (TextView) findViewById(R.id.tne);
        img8 = (TextView) findViewById(R.id.retiro);
        img9 = (TextView) findViewById(R.id.otras);

        //boton1 = (Button)findViewById(R.id.certificado);
        //boton2 = (Button)findViewById(R.id.ingreso);
        //boton3 = (Button)findViewById(R.id.sansiones);
        //boton4 = (Button)findViewById(R.id.reconocimiento);
        //boton5 = (Button)findViewById(R.id.matricula);
        //boton6 = (Button)findViewById(R.id.solicitud);
        //boton7 = (Button)findViewById(R.id.tne);
        //boton8 = (Button)findViewById(R.id.retiro);
        //boton9 = (Button)findViewById(R.id.otras);
        databaseReference= FirebaseDatabase.getInstance().getReference();
        int nose = 0;


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img1.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img2.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img3.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img4.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img5.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img6.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img7.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img8.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = img9.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });

        /*
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton1.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton2.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton3.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);

            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton4.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton5.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton6.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton7.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton8.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seleccionado = boton9.getText().toString();
                if (! isDeviceOnline()) {
                    Encuesta p1 = new Encuesta(seleccionado);
                    //String id=databaseReference.push().getKey();
                    databaseReference.child(Integer.toString(MainActivity.contador)).child("Primero").setValue(seleccionado);
                }
                datos.getOpciones5().add(seleccionado);
                Intent myintent = new Intent(getApplicationContext(),Pregunta1.class);
                startActivity(myintent);
            }
        });*/
}

    private boolean isDeviceOnline() {
        ConnectivityManager connMgr =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }

}

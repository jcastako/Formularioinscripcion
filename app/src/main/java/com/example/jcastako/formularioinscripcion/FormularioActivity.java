package com.example.jcastako.formularioinscripcion;

import android.content.Intent;
import android.icu.text.UnicodeSetIterator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Patterns;



public class FormularioActivity extends AppCompatActivity implements OnClickListener{

    EditText usuarioEle;
    EditText clave1;
    EditText clave2;
    EditText nombreUsu;
    EditText apellidoUsu;
    EditText edadUsu;
    EditText correo1;
    EditText correo2;
    EditText objetivoUsu;

    String usu, cla, cla2, nom, apell, edad, cor, cor2, obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        View botonGuarda=findViewById(R.id.botonGuardar);
        botonGuarda.setOnClickListener(this);
        usuarioEle=(EditText) findViewById(R.id.usuario);
        clave1=(EditText) findViewById(R.id.contrasena1);
        clave2=(EditText) findViewById(R.id.contrasena2);
        nombreUsu=(EditText) findViewById(R.id.nombre);
        apellidoUsu=(EditText) findViewById(R.id.apellido);
        edadUsu=(EditText) findViewById(R.id.edad);
        correo1=(EditText) findViewById(R.id.email);
        correo2=(EditText) findViewById(R.id.email2);
        objetivoUsu=(EditText) findViewById(R.id.objetivo);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v) {

        usu= usuarioEle.getText().toString();
        cla= clave1.getText().toString();
        cla2= clave2.getText().toString();
        nom=nombreUsu.getText().toString();
        apell= apellidoUsu.getText().toString();
        edad= edadUsu.getText().toString();
        cor= correo1.getText().toString();
        cor2= correo2.getText().toString();
        obj= objetivoUsu.getText().toString();

        if(usu.equals("") && cla.equals("") && nom.equals("") && apell.equals("") && edad.equals("")
                && cor.equals("") && usu.equals("") && obj.equals("")) {
            Toast.makeText(this, "Por favor ingresar todos los datos ", Toast.LENGTH_LONG).show();



            }else {
            if (cla.equals(cla2) && cor.equals(cor2)) {


                Intent intent = new Intent(v.getContext(), InscripcionActivity.class);
                startActivityForResult(intent, 0);

                intent.putExtra("Usuario", usu);
                intent.putExtra("Clave", cla);
                intent.putExtra("Nombre", nom);
                intent.putExtra("Apellido", apell);
                intent.putExtra("Edad", edad);
                intent.putExtra("Correo", cor);
                intent.putExtra("Objetivo", obj);

                startActivity(intent);
            }else {
                Toast.makeText(this, "Ingresar una misma clave de usuario e ingresar un mismo correo ", Toast.LENGTH_LONG).show();

        }
        }
    }


}

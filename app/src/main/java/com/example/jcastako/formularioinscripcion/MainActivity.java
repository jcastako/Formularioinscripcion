package com.example.jcastako.formularioinscripcion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View botonInicio=findViewById(R.id.botonIng);
        botonInicio.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        Intent intent =new Intent (v.getContext(), FormularioActivity.class);
        startActivityForResult(intent, 0);

    }
}

package org.matematicasfacil.actividad9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int idImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView otono = findViewById(R.id.imageViewOto);
        ImageView invierno = findViewById(R.id.imageViewInvi);
        ImageView primavera = findViewById(R.id.imageViewPrim);
        ImageView verano = findViewById(R.id.imageViewVera);

        otono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idImagen = R.drawable.otono;
                irAsegundaActividad();
            }
        });
        invierno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idImagen = R.drawable.invierno;
                irAsegundaActividad();
            }
        });
        primavera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idImagen = R.drawable.primavera;
                irAsegundaActividad();
            }
        });
        verano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idImagen = R.drawable.verano;
                irAsegundaActividad();
            }
        });

    }
    public void irAsegundaActividad(){
        Intent secondActivity = new Intent(MainActivity.this, MainActivity2.class);
        secondActivity.putExtra("clave", idImagen);
        startActivity(secondActivity);
    }
}
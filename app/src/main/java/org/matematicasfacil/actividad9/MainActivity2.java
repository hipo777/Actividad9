package org.matematicasfacil.actividad9;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView recibeImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recibeImagen = findViewById(R.id.imageViewSeleccionada);
        Button btnVolver = findViewById(R.id.buttonVolver);

        Intent intent = getIntent();
        if (intent != null) {
            int selectedImageId = intent.getIntExtra("clave", 0);
            recibeImagen.setImageResource(selectedImageId);
        }
        animarImagen();

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void animarImagen() {
        ObjectAnimator escalaEnX = ObjectAnimator.ofFloat(recibeImagen, View.SCALE_X, 1f, 2f);//1f escala original
        ObjectAnimator escalaEnY = ObjectAnimator.ofFloat(recibeImagen, View.SCALE_Y, 1f, 2f);//2f escala final

        escalaEnX.setDuration(2000); // Duración de la animación en milisegundos
        escalaEnY.setDuration(2000);

        escalaEnX.start();
        escalaEnY.start();
    }
}
package org.matematicasfacil.actividad9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView recibeImagen = findViewById(R.id.imageViewOto);
        Button btnVolver = findViewById(R.id.buttonVolver);

        Intent intent = getIntent();
        if (intent != null) {
            int selectedImageId = intent.getIntExtra("clave", 0);
            recibeImagen.setImageResource(selectedImageId);
        }

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }


}
package com.example.estudiante.ejercicios4_2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnMainToform;
    private TextView tvMainStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMainToform = findViewById(R.id.btn_main_to_from);
        tvMainStatus = findViewById(R.id.tv_main_status);

        btnMainToform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent solicitud =
                        new Intent(getApplicationContext(),
                                UserFormActivity.class);

                startActivityForResult(solicitud, Constance.REQ_NEW_USER);
            }
                                         }
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}

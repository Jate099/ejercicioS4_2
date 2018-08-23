package com.example.estudiante.ejercicios4_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserFormActivity extends AppCompatActivity {

    private EditText edtUserformName;
    private EditText edtUserformEmail;
    private EditText edtUserformUserName;

    private Button btnUserformFinish;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_form);

        //Intent solicitud = getIntent();

        edtUserformName = findViewById(R.id.edt_user_form_name);
        edtUserformEmail = findViewById(R.id.edt_user_from_email);
        edtUserformUserName = findViewById(R.id.edt_user_from_usermane);

        btnUserformFinish = findViewById(R.id.btn_userform_finish);

        btnUserformFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent respuesta = new Intent();

                String name = edtUserformName.getText().toString();
                String email = edtUserformEmail.getText().toString();
                String username = edtUserformUserName.getText().toString();

                respuesta.putExtra("name", name);
                respuesta.putExtra("email", email);
                respuesta.putExtra("username", username);

                setResult(Constance.REP_NEW_USER, respuesta);
                finish();

            }
        });
    }
}

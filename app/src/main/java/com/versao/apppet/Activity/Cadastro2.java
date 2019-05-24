package com.versao.apppet.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.versao.apppet.Model.Usuario;
import com.versao.apppet.R;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Cadastro2 extends AppCompatActivity {

    private EditText email, senha;
    private Usuario usuario;
    private Button casdastrar;
    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        //Summir a Toobar
        getSupportActionBar().hide();

        //Inicializar Componetes
        email = findViewById(R.id.editEmail);
        senha = findViewById(R.id.editSenha);
        casdastrar = findViewById(R.id.Cadastrar);

        casdastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              menuCliente();

            }


        });

    }

    public void menuCliente() {
        startActivity(new Intent(this, MenuCliente.class));
    }




    private static String getCurrentDate() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        return cal.toString();
    }

}

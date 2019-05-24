package com.versao.apppet.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.versao.apppet.R;


public class MainActivity extends AppCompatActivity {

    private EditText campoEmail, campoSenha;
    private Button botaoAcessar, botaoSeCadastrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Summir a Toobar
        getSupportActionBar().hide();

        //Configuraçoes Iniciais
        campoEmail = findViewById(R.id.editEmail);
        campoSenha = findViewById(R.id.editSenha);
        botaoAcessar = findViewById(R.id.btnAcessar);
        botaoSeCadastrar = findViewById(R.id.btnSeCadastrar);

        botaoAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        abrirPets();
            }
        });

        botaoSeCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IrCadastro();

            }
        });

    }

    public void abrirPets() {

        startActivity(new Intent(this, MenuCliente.class));
    }

    public void IrCadastro() {
        startActivity(new Intent(this, Cadastro1.class));
    }
}


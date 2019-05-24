package com.versao.apppet.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.versao.apppet.R;

public class PetCadastradoActivity extends AppCompatActivity {

    private Button botaoAddPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_cadastrado);

        botaoAddPet = findViewById(R.id.btnAddPet);

        //Sumir a ActionBar
        getSupportActionBar().hide();

        //Configurar toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        toolbar.setTitle("");
        mTitle.setText("Meu Pet");
        if (null != toolbar) {
            toolbar.setNavigationIcon(R.drawable.ic_back_24dp);

            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    abrirMenuCliente();
                }
            });

        }

        botaoAddPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionarPet();
            }
        });
    }

    private void abrirMenuCliente(){
        startActivity(new Intent(PetCadastradoActivity.this, MenuCliente.class));
    }

    private void adicionarPet(){
        startActivity(new Intent(PetCadastradoActivity.this, AddPetActivity.class));
    }
}

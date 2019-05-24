package com.versao.apppet.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.versao.apppet.Model.Usuario;
import com.versao.apppet.R;

public class Cadastro1 extends AppCompatActivity {

    private EditText nome, cpf , cep , endereco , numero , complemento , telefone;
    private Usuario usuario;
    private Button proximo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro1);

        //Summir a Toobar
        getSupportActionBar().hide();

        //Inicializar componentes
        nome = findViewById(R.id.editNome2);
        cpf = findViewById(R.id.editCpf);
        cep = findViewById(R.id.editCep);
        endereco = findViewById(R.id.editEndereco);
        numero = findViewById(R.id.editNumero);
        complemento = findViewById(R.id.editComplemento);
        telefone = findViewById(R.id.editTelefone);
        proximo = findViewById(R.id.buttonProximo);


        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Validar se os campos foram preenchidos

                proximaPagina();

            }
        });
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    public void proximaPagina(){
        Intent intent = new Intent(Cadastro1.this, Cadastro2.class);
        intent.putExtra("usuario", usuario);
        startActivity(intent);

    }

}


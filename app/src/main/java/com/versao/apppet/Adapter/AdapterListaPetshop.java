package com.versao.apppet.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.versao.apppet.Model.PetShop;
import com.versao.apppet.R;

import java.util.List;

public class AdapterListaPetshop extends RecyclerView.Adapter<AdapterListaPetshop.MyViewHolder> {

    private List<PetShop> petshop;
    private Context context;

    public AdapterListaPetshop(List<PetShop> petshop, Context context) {
        this.petshop = petshop;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterListaPetshop.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter_lista_petshop, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int i) {

    }


    @Override
    public int getItemCount() {

        return petshop.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nome;
        TextView tipo;
        TextView distancia;
        ImageView imagemProduto;

        public MyViewHolder(View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtNomePetShop);
            tipo = itemView.findViewById(R.id.txtIdade);
            distancia = itemView.findViewById(R.id.txtDistancia);
            imagemProduto = itemView.findViewById(R.id.imagemPetshop);

        }
    }
}

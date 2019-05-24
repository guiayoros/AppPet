package com.versao.apppet.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.versao.apppet.Adapter.AdapterCarrinho;
import com.versao.apppet.Adapter.AdapterListaPetshop;
import com.versao.apppet.Model.PetShop;
import com.versao.apppet.Model.Produto;
import com.versao.apppet.R;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoFragment extends Fragment {

    private RecyclerView recyclerCarrinho;
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_carrinho_fragment, container, false);

        recyclerCarrinho = view.findViewById(R.id.recyclerCarrinho);

        //Configurar o RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerCarrinho.setLayoutManager(layoutManager);
        recyclerCarrinho.setHasFixedSize(true);
        final AdapterCarrinho adapterCarrinho = new AdapterCarrinho(produtos,getActivity());
        recyclerCarrinho.setAdapter(adapterCarrinho);



        return view;
    }
}

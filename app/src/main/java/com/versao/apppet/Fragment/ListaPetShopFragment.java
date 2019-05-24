package com.versao.apppet.Fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.versao.apppet.Adapter.AdapterListaPetshop;
import com.versao.apppet.Model.PetShop;
import com.versao.apppet.R;

import java.util.ArrayList;
import java.util.List;

public class ListaPetShopFragment extends Fragment {

    private RecyclerView recyclerPetshop;
    private List<PetShop> petShops = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_lista_pet_shop_fragment, container, false);

        recyclerPetshop = view.findViewById(R.id.recyclerPetshop);

        //Configurar o RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerPetshop.setLayoutManager(layoutManager);
        recyclerPetshop.setHasFixedSize(true);
        final AdapterListaPetshop adapterPetshop = new AdapterListaPetshop(petShops,getActivity());
        recyclerPetshop.setAdapter(adapterPetshop);



        return view;
    }

}

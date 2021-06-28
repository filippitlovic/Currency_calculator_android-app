package hr.ferit.orwma_aplikacija;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class fragment_s_recyclerom_drzava extends Fragment   {

    View v;
    private RecyclerView recyclerView;
    private ArrayList<elementi_recyclera> elementi_recycleras_holder;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        v = inflater.inflate(R.layout.fragment_s_recyclerom_drzava, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerFRAGMENT_DRZAVA);
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(elementi_recycleras_holder, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerAdapter);

        RecyclerView.ItemDecoration divider = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL); /// da postavim crte izmedu svakog elementa u recycleru
        recyclerView.addItemDecoration(divider);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        elementi_recycleras_holder = new ArrayList<>();

        elementi_recyclera afg = new elementi_recyclera(R.drawable.afganistan,"Afganistan");
        elementi_recycleras_holder.add(afg);
        elementi_recyclera albania = new elementi_recyclera(R.drawable.albania,"Albania");
        elementi_recycleras_holder.add(albania);
        elementi_recyclera algeria = new elementi_recyclera(R.drawable.algeria,"Algeria");
        elementi_recycleras_holder.add(algeria);

        elementi_recyclera andorra = new elementi_recyclera(R.drawable.andorra,"Andorra");
        elementi_recycleras_holder.add(andorra);
        elementi_recyclera angola = new elementi_recyclera(R.drawable.angola,"Angola");
        elementi_recycleras_holder.add(angola);
        elementi_recyclera antiqua = new elementi_recyclera(R.drawable.antiqua,"Antiqua & Barbuda");
        elementi_recycleras_holder.add(antiqua);
        elementi_recyclera argentina = new elementi_recyclera(R.drawable.argentina,"Argentina");
        elementi_recycleras_holder.add(argentina);
        elementi_recyclera armenia = new elementi_recyclera(R.drawable.armenia,"Armenia");
        elementi_recycleras_holder.add(armenia);
        elementi_recyclera australia = new elementi_recyclera(R.drawable.australia,"Australia");
        elementi_recycleras_holder.add(australia);
        elementi_recyclera azerb = new elementi_recyclera(R.drawable.azerbaijan,"Azerbaijan");
        elementi_recycleras_holder.add(azerb);
        elementi_recyclera bagnladesh = new elementi_recyclera(R.drawable.bagladesh,"Bagladesh");
        elementi_recycleras_holder.add(bagnladesh);
        elementi_recyclera bahr = new elementi_recyclera(R.drawable.bahrain,"Bahrain");
        elementi_recycleras_holder.add(bahr);
        elementi_recyclera barbados = new elementi_recyclera(R.drawable.barbados,"Barbados");
        elementi_recycleras_holder.add(barbados);
        elementi_recyclera belarus = new elementi_recyclera(R.drawable.belarus,"Belarus");
        elementi_recycleras_holder.add(belarus);
        elementi_recyclera belgium = new elementi_recyclera(R.drawable.belgium,"Belgium");
        elementi_recycleras_holder.add(belgium);
        elementi_recyclera belize = new elementi_recyclera(R.drawable.belize,"Belize");
        elementi_recycleras_holder.add(belize);


    }


}
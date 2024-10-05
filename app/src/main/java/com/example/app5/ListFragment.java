package com.example.app5;

import android.content.ClipData;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el layout del fragmento
        View view = inflater.inflate(R.layout.list_fragment, container, false); // Asegúrate de usar el layout correcto

        // Enlazar el ListView desde el layout
        ListView listView = view.findViewById(R.id.listView); // Cambia el ID según tu layout

        // Crear el contenido del ListView (lista de productos o destinos turísticos con imágenes)

        String[] nombres = {"Punta Cana", "Casa de campo", "Puerto plata", "Samana", "Jarabacoa"};
        int[] imagenes = {R.drawable.punta_cana, R.drawable.casa_de_campo, R.drawable.puerto_plata,  R.drawable.samana , R.drawable.jarabacoa };

// Configurar el adaptador
        CustomAdapter adapter = new CustomAdapter(getContext(), nombres, imagenes);
        listView.setAdapter(adapter);


        return view; // Retorna la vista del fragmento
    }
}

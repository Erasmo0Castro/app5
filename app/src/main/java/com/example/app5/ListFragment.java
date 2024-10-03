package com.example.app5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Infla el diseño del fragmento
        View view = inflater.inflate(R.layout.list_fragment, container, false);

        // Encontrar el ListView dentro del layout
        ListView listView = view.findViewById(R.id.listView);

        // Datos a mostrar en el ListView
        String[] items = {"Producto 1", "Producto 2", "Producto 3"};
        int[] images = {R.drawable.punta_cana, R.drawable.casa_de_campo, R.drawable.puerto_plata};

        // Crear un adaptador personalizado
        CustomAdapter adapter = new CustomAdapter(requireActivity(), items, images);

        // Asignar el adaptador al ListView
        listView.setAdapter(adapter);

        return view;
    }
}


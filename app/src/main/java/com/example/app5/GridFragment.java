package com.example.app5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class GridFragment extends Fragment {

    private GridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grid_item, container, false);

         gridView = view.findViewById(R.id.gridView);

        // Crear el contenido del GridView (lista de imágenes y textos)
        String[] items = {"León", "Tigre", "Elefante"};
        int[] images = {R.drawable.leon, R.drawable.tigre, R.drawable.elefante};

// Crear y configurar el adaptador
        CustomAdapter adapter = new CustomAdapter(getContext(), items, images);
        gridView.setAdapter(adapter);




        return view;
    }
}

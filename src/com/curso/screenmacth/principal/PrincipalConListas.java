package com.curso.screenmacth.principal;

import com.curso.screenmacth.modelos.Pelicula;
import com.curso.screenmacth.modelos.Serie;
import com.curso.screenmacth.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Deadpool 3", 2024);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Shrek", 2001);
        otraPelicula.evalua(7);
        var peliculaDeFel = new Pelicula("La cita perfecta", 2019);
        peliculaDeFel.evalua(8);
        Serie dark = new Serie("Dark", 2016);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeFel);
        lista.add(dark);


        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if(item instanceof Pelicula pelicula && pelicula.getClasificable() > 2){
                System.out.println("Calificación: " + pelicula.getClasificable());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio benedeto");
        listaDeArtistas.add("Ricardo Darín");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));


    }
}

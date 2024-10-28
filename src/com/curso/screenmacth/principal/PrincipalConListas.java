package com.curso.screenmacth.principal;

import com.curso.screenmacth.modelos.Pelicula;
import com.curso.screenmacth.modelos.Serie;
import com.curso.screenmacth.modelos.Titulo;

import java.util.ArrayList;

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
            System.out.println(item);
            Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificable());

        }

    }
}

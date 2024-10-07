package com.curso.sreenmacth.calculos;
import com.curso.screenmacth.modelos.Pelicula;
import com.curso.screenmacth.modelos.Serie;
import com.curso.screenmacth.modelos.Titulo;

public class CalculadorTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}

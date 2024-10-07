package com.curso.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int espisodiosPorTemporada;
    int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * espisodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEspisodiosPorTemporada() {
        return espisodiosPorTemporada;
    }

    public void setEspisodiosPorTemporada(int espisodiosPorTemporada) {
        this.espisodiosPorTemporada = espisodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}



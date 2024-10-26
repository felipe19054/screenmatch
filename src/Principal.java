import com.curso.screenmacth.modelos.Episodio;
import com.curso.screenmacth.modelos.Pelicula;
import com.curso.screenmacth.modelos.Serie;
import com.curso.sreenmacth.calculos.CalculadorTiempo;
import com.curso.sreenmacth.calculos.FiltroRecomendacion;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Deadpool 3");
        miPelicula.setFechaDeLanzamiento(2024);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.5);
        miPelicula.evalua(9);
        miPelicula.evalua(8.5);

        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie dark = new Serie();
        dark.setNombre("Dark");
        dark.setFechaDeLanzamiento(2016);
        dark.setTemporadas(3);
        dark.setMinutosPorEpisodio(45);
        dark.setEspisodiosPorTemporada(8);
        dark.muestraFichaTecnica();
        System.out.println(dark.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Shrek");
        otraPelicula.setFechaDeLanzamiento(2001);
        otraPelicula.setDuracionEnMinutos(90);

        CalculadorTiempo calculadora = new CalculadorTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(dark);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Estraño");
        episodio.setSerie(dark);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendacion.filtra(episodio);




    }
}

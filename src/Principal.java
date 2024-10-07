import com.curso.screenmatch.modelos.Pelicula;
import com.curso.screenmatch.modelos.Serie;

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





//        Pelicula otraPelicula = new Pelicula();
//        otraPelicula.nombre = "Shrek";
//        otraPelicula.fechaDeLanzamiento = 2001;
//        otraPelicula.duracionEnMinutos = 90;
//
//        otraPelicula.muestraFichaTecnica();
    }
}

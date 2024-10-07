import com.curso.screenmatch.modelos.Pelicula;

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


        


//        Pelicula otraPelicula = new Pelicula();
//        otraPelicula.nombre = "Shrek";
//        otraPelicula.fechaDeLanzamiento = 2001;
//        otraPelicula.duracionEnMinutos = 90;
//
//        otraPelicula.muestraFichaTecnica();
    }
}

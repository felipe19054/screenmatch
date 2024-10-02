public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Deadpool 3";
        miPelicula.fechaDeLanzamiento = 2024;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Shrek";
        otraPelicula.fechaDeLanzamiento = 2001;
        miPelicula.duracionEnMinutos = 90;

        System.out.println("Mi pelicula es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}

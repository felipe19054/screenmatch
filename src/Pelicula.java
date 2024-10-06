public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones;
    int totalDeEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos es " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeEvaluaciones / totalDeEvaluaciones;
    }
}

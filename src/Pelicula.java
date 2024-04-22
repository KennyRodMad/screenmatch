//Definimos nuestra clase modelo, la cual contiene todos los atributos que consideramos importantes
//La clase solo sirve para estandarizar los objetos, pero no representa un objeto en sí
public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeEvaluaciones;//contador de todas las evaluaciones realizadas

    //Creamos uno método o función que nos ayudará a reautilizar nuestros atributos en cada caso de la clase principal
    void muestraFichaTecnica(){
        System.out.println("El nombre de la película es "+ nombre);
        System.out.println("Fue lanzada a inicios del año " + fechaDeLanzamiento);
        System.out.println("Tiene una duración de " + duracionEnMinutos + " minutos");
    }

    //creamos un método que permita evaluar las películas, sumando todas las calificaciones de los usuarios
    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++; //aumenta la contabilización a medida que se hace una nueva evaluación
    }

    //creamos un método que calcule la media de calificaciones y nos la retorne como double
    double calculaMedia(){
        return sumaDeLasEvaluaciones/totalDeEvaluaciones;
    }
 

}
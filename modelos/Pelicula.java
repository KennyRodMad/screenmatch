//Definimos nuestra clase modelo, la cual contiene todos los atributos que consideramos importantes
//La clase solo sirve para estandarizar los objetos, pero no representa un objeto en sí
public class Pelicula {

    //declaramos las variables privadas, para que no sean accesadas desde otra clase.
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;//contador de todas las evaluaciones realizadas

    //Métodos set(para colocar datos) y get(para obtener datos)

    /*llamamos u obtenemos los valores de nuesras variables privadas, 
    mediante métodos que nos retornen tales valores, utilizando la convencion 
    getNombreDeLaVariable*/

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean getIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    /*métodos para xetar los valores privados, 
    los setters, nos ayudan a crear métodos parecidos a los getters,
    pero que nos permita colocar un valor específico para cada atributo,
    utilizando la convencion setNombreDeLaVariable*/

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }


    //Método que retorna el total de las evaluaciones registradas por el contador
    int getTotalDeLasEvaluaciones(){
        return totalDeEvaluaciones;
    }

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
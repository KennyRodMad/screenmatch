package modelos;
import calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion{ //hacemos la implemntación de la interface Clasificacion
    //definimos los atributos específicos de la clase película
    private String director;

    //definimos los métodos settters y getters para cada uno de los atributos
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //método requerido para la implementación
    @Override
    public int getClasificacion() {
        return (int) (calculaMedia()/2);
    }

}
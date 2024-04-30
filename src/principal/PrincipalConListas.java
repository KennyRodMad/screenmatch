package principal;
import modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import modelos.Pelicula;
import modelos.Serie;

public class PrincipalConListas {

    public static void main(String[] args) {
        
        Pelicula favorita = new Pelicula("El señor de los anillos", 2001);
        favorita.evalua(10);
        
        Pelicula otra = new Pelicula("John Wick", 2014);
        otra.evalua(9);
        
        Serie serie = new Serie("La Casa de Papel", 2017);
        
        //creamos una lista de películas y series
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorita);
        lista.add(otra);
        lista.add(serie);
        
        for(Titulo item : lista) {
            System.out.println("Nombre: " +item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println("Clasificacion: " +pelicula.getClasificacion());
            }
        }


        /*creamos una lista de artistas
         * podemos en lugar de usar la clase ArrayList, usar la intefaz List(si contiene los métdos que necesitamos), 
         * que es permitida por la anterior clase mencionada. 
         * Esto permite que en un futuro podamos cambiar la clase ArrayList por otra,
         * como por ejemplo, por LinkedList.
        */
        List<String> listaDeArtistas = new LinkedList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");

        System.out.println("Lista de artistas no ordenada: " + listaDeArtistas);

        //método de ordanación alfabética para la lista de artistas
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        //ordanamos la lista inicial por nombres
        Collections.sort(lista);
        System.out.println("Lista de nombre ordenados: " + lista);


        //ordenamos la lista inicial por fechas, para ello usamos la interfaz Comparator y el método comparing
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fechas: " + lista);
    }
    
}

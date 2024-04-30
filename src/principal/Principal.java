package principal;
import java.util.ArrayList;

import calculos.CalculadoraDeTiempo;
import calculos.FiltroRecomendaciones;
import modelos.Episodio;
import modelos.Pelicula;
import modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        //creamos una instancia de la clase Pelicula(objeto), y los asignamos a la variable miPelicula
        Pelicula miPelicula = new Pelicula("Residen Evil Apocalipsis", 2000);  
        miPelicula.setDuracionEnMinutos(180);
        miPelicula.setIncluidoEnElPlan(true);
        
        //llamamos al método que nos restorna los valores anteriores
        miPelicula.muestraFichaTecnica();
      
        //Asignamos dos evaluaciones de la película
        miPelicula.evalua(7.8); 
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        //imprimimos el método que nos retorna el número de evaluaciones registradas por el contador 
        System.out.println("El total de evaluaciones registradas son: " + miPelicula.getTotalDeLasEvaluaciones());
        //imprimimos el resultado del método que nos calcula la media de calificaciones
        System.out.println("La calificación promedio de la película es: " + miPelicula.calculaMedia());

        //creamos una instancia de la clase Serie(objeto), y los asignamos a la variable miSerie
        Serie casaDragon = new Serie("La casa del Dragón", 2022);  
        /*asignamos valores a los atributos declarados en la clase modelo,
        invocando el método correspondiente y enviando el valor como parámetro*/
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);  
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos: " + calculadora.getTiempoTotal() + " minutos");


        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La acasa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtroRecomendaciones.filtra(episodio);

        //definiendo una nueva instancia//
        Pelicula peliculaDeBruno = new Pelicula("El señor de los anillos", 2001); 
        peliculaDeBruno.setDuracionEnMinutos(180);

        //creamos una lista en donde agregamos todas las peliculas
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>(); 
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        //imprimimos el tamaño de la lista 
        System.out.println("El tamaño de la película es: "+ listaDePeliculas.size());
        //imprimimos la primera película de la lista 
        System.out.println("La primera película de la lista: " + listaDePeliculas.get(0).getNombre());
        //imprimimos la lista completa
        System.out.println(listaDePeliculas);
        //imprimimos la primera película de la lista
        System.out.println("toString de la película: " + listaDePeliculas.get(0).toString());



    }
}

import calculos.CalculadoraDeTiempo;
import calculos.FiltroRecomendaciones;
import modelos.Episodio;
import modelos.Pelicula;
import modelos.Serie;

public class Principal {
    public static void main(String[] args) {


        //creamos una instancia de la clase Pelicula(objeto), y los asignamos a la variable miPelicula
        Pelicula miPelicula = new Pelicula();  
        /*asignamos valores a los atributos declarados en la clase modelo,
        invocando el método correspondiente y enviando el valor como parámetro*/
        miPelicula.setNombre("Residen Evil Apocalipsis");
        miPelicula.setFechaDeLanzamiento(2000);
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

        
        //Hacemos lo mismo para la clase Serie


        //creamos una instancia de la clase Serie(objeto), y los asignamos a la variable miSerie
        Serie casaDragon = new Serie();  
        /*asignamos valores a los atributos declarados en la clase modelo,
        invocando el método correspondiente y enviando el valor como parámetro*/
        casaDragon.setNombre("La casa del Dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        
        Pelicula otraPelicula = new Pelicula();  
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
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
    }
}

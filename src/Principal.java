public class Principal {
    public static void main(String[] args) {


        //creamos una instancia de la clase película(objeto), y los asignamos a la variable miPelicula
        Pelicula miPelicula = new Pelicula();  
        //asignamos valores a los atributos declarados en la clase modelo
        miPelicula.nombre = "Residen Evil Apocalipsis";
        miPelicula.fechaDeLanzamiento = 2000;
        miPelicula.duracionEnMinutos = 180;
        
        //llamamos al método que nos muestra las instancias anteriores
        miPelicula.muestraFichaTecnica();
      
        //Asignamos dos evaluaciones de la película
        miPelicula.evalua(7.8); 
        miPelicula.evalua(10);
        //imprimimos el resultado del método sumaDeLasEvaluaciones  
        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        //imprimimos el número de evaluaciones registradas por el contador 
        System.out.println(miPelicula.totalDeEvaluaciones);
        //imprimimos el resultado del método que nos calcula la media de calificaciones
        System.out.println(miPelicula.calculaMedia());
        
        //creamos otra instancia del la clase película(otro objeto) y lo asignamos a la variable otraPelicula
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "El Titanic";
        otraPelicula.fechaDeLanzamiento = 1997;
        otraPelicula.duracionEnMinutos = 160;

        //llamamos al método que nos muestra las instancias anteriores
        otraPelicula.muestraFichaTecnica();
    }
}

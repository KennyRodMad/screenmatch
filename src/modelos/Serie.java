package modelos;

public class Serie extends Titulo {


    //definimos los atributos específicos de la clase película
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    //definimos los métodos settters y getters para cada uno de los atributos

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    /*sobreescribimos el método getDuracionEnMinutos. ya que los cálculos para las serie
    son distintos a los de la clase pelúcula.
    En la primera son evaluados sobre la película completa. Mientras que, 
    en la clase serie son sumadas las duraciones por cada capítulo de cada temporada)
    */
    @Override
    public int getDuracionEnMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }
    
}

package calculos;
import modelos.Titulo;

/*creamos una nueva clase para calcular el tiempo en minutos, 
que se taradaría un usaurio en ver una lista compelta entre peliculas y series*/

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }  

}

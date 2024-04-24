package calculos;

/*Esta clase se crea para fltrar recomendaciones a los usuarios,
 * de acuerdo a las calificaciones de las películas o series
 */
public class FiltroRecomendaciones {
    
    /*creamos un metodo que filtre cualquier producto dentro de screenmtach,
    que tenga una clasificación */
    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if(clasificacion.getClasificacion() >= 2){
            System.out.println("Popular en el momento");
        } else{
            System.out.println("Colócalo en tu lista para verlo después");
        }

    }
}

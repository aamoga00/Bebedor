
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    // Almacena el nombre de la copa.
    private String nombreCopa;
    //Almacena la cantidad de alcohol de la copa.
    private int cantidadAlcohol;

    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(String nombreCopa, int cantidadAlcohol)
    {
       //Inicializamos todos los atributos:
       this.nombreCopa = nombreCopa;
       this.cantidadAlcohol = cantidadAlcohol;
    }
    /**
     * Cantidad de alcohol de la copa
     */
    public int getAlcohol()
    {
        return cantidadAlcohol;
    }
}

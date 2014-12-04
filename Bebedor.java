
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // Almacena el nombre
    private String nombreBebedor;
    //Almacena el nivel de alcohol que tiene el bebedor en sangre.
    private int nivelAlcoholSangre;
    //Limimte de alcohol en sangre
    private int limiteAlcohol;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombreBebedor)
    {
        this.nombreBebedor = nombreBebedor;
        nivelAlcoholSangre = 0;
        limiteAlcohol = 100;
    }
    /**
    * Bebeder se toma una copa
    */
   public void beberCopa (Cubata copa)
   {
       int cantidadAlcohol = nivelAlcoholSangre + copa.getAlcohol();
       if(cantidadAlcohol > limiteAlcohol)
       {
           System.out.println("Noo, creo que noo, puedo beber mas, vete llamando al 112");
       }
       else
       {
           nivelAlcoholSangre = cantidadAlcohol;
       } 

   }
   /**
    * Muestra por pantalla el nivel de Alcohol en Sangre
    */
   public void nivelAlcoholSangre()
   {
       System.out.println("El nivel de alcohol en sangre se encuentra actualmente en: " + nivelAlcoholSangre);
   }
   /**
    * Metodo para preguntar al bebedor. 
    */ 
   public void preguntasBebedor(String pregunta)
   {
   int caracteresPregunta = pregunta.length();
   if(caracteresPregunta % 2 == 0)
   {
       System.out.println("Si");
   }
   else
   {
       System.out.println("No");
   }
   
   
   }
}

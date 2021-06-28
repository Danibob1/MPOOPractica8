
package mpoop8;

/**
 * Clase Flauta que hereda de InstrumentoViento
 * Contiene una nueva funcion y sobrescribe el metodo tipoInstrumento()
 * @author daniel
 */
public class Flauta extends InstrumentoViento{
    
    //Puede sobreescribir algun metodo y agregar funcionalidades
    public void tocandoHimnoAlegria(){
        System.out.println("Tocando himno a la alegria");
    }
    
    @Override
    public  String tipoInstrumento(){
        return "Tacos Dorados";
    }
}

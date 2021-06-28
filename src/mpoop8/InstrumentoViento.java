package mpoop8;

/**
 * Clase InstrumntoViento implementa a InstrumentoMusical
 * Tiene sobrescritura los tres metodos 
 * @author daniel
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando la flauta");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando el intrumento");
    }

    @Override
    public String tipoInstrumento() {
        return "Instrumeto de viento ";
    }
}

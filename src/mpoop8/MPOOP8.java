package mpoop8;

/**
 * Clase principal donde adentro del main intanciamos nuestros objetos
 * @author daniel y carlos
 * @version 1.0
 */
public class MPOOP8 {

    public static void main(String[] args) {
        
        Poligono poligono;//poligono -apunta-> null
        poligono= new Poligono(); //poligono-apunta->obj creado por Poligono()
        System.out.println(poligono);
        Object objeto= poligono; //objeto -apunta-> poligono 
                                 //objeto -apunta-> obj creado por Poligono
        System.out.println(objeto);
        System.out.println("\n");
        
        // Una refencia puede ser reasignada a otros objetos
        poligono= new Triangulo();//poligono-apunta->Triangulo creado por Poligono
        System.out.println(poligono);//imprime la referencia de Triangulo 
        System.out.println(objeto);//imprime la referencia de Poligono
        System.out.println("\n");
        objeto=new Cuadrilatero(); //objeto-apunta->Cuadrilatero creado por Poligono 
        System.out.println(objeto);
        
        //poligono.setBase();Marca error por no estar declarado en Poligono
        poligono.area();
        System.out.println("\n");
        
        queTipoEs(poligono);
        poligono = new Cuadrilatero();
        queTipoEs(poligono);
        
        System.out.println("\n");
        
        InstrumentoMusical inst; //Se crea referencia a la interfaz, pero no es posible instanciarla Variable inst
        //inst= new InstrumentoMusical(); MAL
        //Una referencia a la interfaz puede ser asignada en cualquier objeto que la implemente
        inst= new Flauta();
        inst.tocar();
        inst.afinar();
        System.out.println(inst.tipoInstrumento());
    }
    /**
     * 
     * @param p Este parametro es la variable poligono 
     */
    public static void queTipoEs(Poligono p){
        if(p instanceof Triangulo){ 
            Triangulo t=(Triangulo) p;
            System.out.println("Triangulo con base: "+ t.getBase() );
        }else if(p instanceof Cuadrilatero){
            Cuadrilatero c = (Cuadrilatero) p;
            System.out.println("Cudrilatero");
        }
    
    }
    
}

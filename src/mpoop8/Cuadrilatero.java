package mpoop8;

/**
 * Clase Cuadrilatero que hereda de Poligono con atributos, constructores, Getters, Setters y metodo toString
 * @author daniel y carlos 
 */
public class Cuadrilatero extends Poligono{
    
    //Atributos
    private int Alfa, Beta;
    private float a,b;
    private float base, altura;
    //Constructores
    public Cuadrilatero() {
    }
    public Cuadrilatero(int Alfa, int Beta, float a, float b, float base, float altura) {
        this.Alfa = Alfa;
        this.Beta = Beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    //Getters y Setters
    public int getAlfa() {
        return Alfa;
    }

    public void setAlfa(int Alfa) {
        this.Alfa = Alfa;
    }

    public int getBeta() {
        return Beta;
    }

    public void setBeta(int Beta) {
        this.Beta = Beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    //Metodo toString con sobreescritura para concatenar cadena
    @Override
    public String toString() {
        return super.toString()+" Cuadrilatero{" + "Alfa=" + Alfa + ", Beta=" + Beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}

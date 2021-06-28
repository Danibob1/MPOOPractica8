package mpoop8;

/**
 * Clase Triangulo que hereda de Poligono con atributos, constructores, Getters, Setters y metodo toString
 * @author daniel y carlos 
 */
public class Triangulo extends Poligono{
    
    //Atributos
    private int Alfa, Beta, Gamma;
    private float a,b,c;
    private float base, altura;
    //Constructores
    public Triangulo() {
    }
    
    public Triangulo(int Alfa, int Beta, int Gamma, float a, float b, float c, float base, float altura) {
        this.Alfa = Alfa;
        this.Beta = Beta;
        this.Gamma = Gamma;
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getGamma() {
        return Gamma;
    }

    public void setGamma(int Gamma) {
        this.Gamma = Gamma;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
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
        return super.toString()+ " Triangulo{" + "Alfa=" + Alfa + ", Beta=" + Beta + ", Gamma=" + Gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
            
}

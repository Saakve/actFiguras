/**
 *
 * @author Saakve
 */
public class Triangulo extends Figura{
    private double base = 0;
    private double altura = 0;
    private double lados[] = {0.0,0.0,0.0};
    
    public Triangulo(){
        super();
    }
    
    public Triangulo(double[] lados, double altura) {
        super();
        this.lados = lados;
        this.base = lados[getIndiceBase()];
        this.altura = altura;
    }
    
    public Triangulo(String nombre, double[] lados, double altura) {
        super(nombre);
        this.lados = lados;
        this.base = lados[getIndiceBase()];
        this.altura = altura;
    }
    
    public void setLados(double[] lados){
        this.lados = lados;
        this.base = lados[getIndiceBase()];
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public void setBase(double base){
        this.base = base;
        lados[getIndiceBase()] = base;
    }
    
    private int getIndiceBase (){
        double max = 0;
        int indice = 0;
        
        for (int i = 0; i < 3; i++) {
            if(lados[i] > max) {
                indice = i;
                max = lados[i];
            }
        }
        
        return indice;
    }
   
    @Override
    public double getArea(){
        if(super.getArea() == 0){
            super.setArea((base*altura)/2);
        }
        return super.getArea();
    }
    
    @Override
    public double getPerimetro(){
        if(super.getPerimetro() == 0){
            int suma = 0;
            for (double lado : lados) {
                suma+=lado;
            }
            super.setPerimetro(suma);
        }
        
        return super.getPerimetro();
    }
    
    @Override
    public String toString(){
        return "Triangulo: " + super.getNomFigura();
    }
    
}

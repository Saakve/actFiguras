/**
 *
 * @author Saakve
 */
public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(){
        lado = 0;
    }
    
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.lado = lado;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double getArea(){
        if(super.getArea() == 0){
            super.setArea(lado*lado);
        }
        return super.getArea();
    }
    
    @Override
    public double getPerimetro(){
        if(super.getPerimetro() == 0){
            super.setPerimetro(4*lado);
        }
        
        return super.getPerimetro();
    }
    
    @Override
    public String toString(){
        return "Cuadrado: " + super.getNomFigura();
    }
    
}

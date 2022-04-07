/**
 *
 * @author Saakve
 */
public class Circulo extends Figura{
    private double radio = 0;
    
    public Circulo(){
        super();
    }
    
    public Circulo(double radio){
        super();
        this.radio = radio;
    }
    
    public Circulo(String nombre,double radio){
        super(nombre);
        this.radio = radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    @Override
    public double getArea(){
        if(super.getArea() == 0){
            super.setArea(Math.PI*radio*radio);
        }
        return super.getArea();
    }
    
    @Override
    public double getPerimetro(){
        if(super.getPerimetro() == 0) {
            super.setPerimetro(Math.PI*2*radio);
        }
        return super.getPerimetro();
    }
    
    @Override
    public String toString(){
        return "Circulo: " + super.getNomFigura();
    }
}

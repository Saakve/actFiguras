/**
 *
 * @author Saakve
 */
public class Figura {
    private String nomFigura;
    private double area = 0.0;
    private double perimetro = 0.0;
    
    public Figura(){
        nomFigura = "";
    }
    
    public Figura(String nomFigura){
        this.nomFigura = nomFigura;
    }
    
    public void setNomFigura(String nombre){
        nomFigura = nombre;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    public String getNomFigura(){
        return nomFigura;
    }
    
    public double getArea(){
        return area;
    }
    
    public double getPerimetro(){
        return perimetro;
    }
    
    @Override
    public String toString(){
        return nomFigura;
    }
}

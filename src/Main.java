public class Main {

    public static void main(String[] args) {
        
        Figura figura = new Figura();
        System.out.println(figura.getNomFigura());
        figura.setNomFigura("Figura #1");
        System.out.println(figura.getNomFigura());
        
        double lados[] = {3,3,3};
        
        Triangulo triangulo = new Triangulo("#1",lados, 5);
        System.out.println(triangulo.toString() + "\tÁrea: " + triangulo.getArea() + "\tPerímetro: " + triangulo.getPerimetro());
        
        Circulo circulo = new Circulo("#1", 3);
        System.out.println(circulo.toString() + "\tÁrea: " + circulo.getArea() + "\tPerímetro: " + circulo.getPerimetro());
        
        Cuadrado cuadrado = new Cuadrado("#1", 6);
        System.out.println(cuadrado.toString() + "\tÁrea: " + cuadrado.getArea() + "\tPerímetro: " + cuadrado.getPerimetro());
    }
}

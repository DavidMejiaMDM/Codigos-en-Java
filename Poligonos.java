interface Poligono {
double calcularArea();
}
class Triangulo implements Poligono {
private double base;
private double altura;
public Triangulo(double base, double altura) {
this.base = base;
this.altura = altura;
}
public double calcularArea() {
return (this.base * this.altura) / 2;
}
}

class Cuadrado implements Poligono {
private double lado;
public Cuadrado(double lado) {
this.lado = lado;
    }
public double calcularArea() {
return this.lado * this.lado;
}
}
class Rectangulo implements Poligono {
private double ancho;
private double altura;

public Rectangulo(double ancho, double altura) {
this.ancho = ancho;
    this.altura = altura;
}
public double calcularArea() {
return this.ancho * this.altura;
    }
}
public class Principal {
    public static void main(String[] args) {
        Poligono triangulo = new Triangulo(2.2, 4);
        Poligono cuadrado = new Cuadrado(3);
        Poligono rectangulo = new Rectangulo(5, 6);
        System.out.println("El area del triangulo es " + imprimirArea(triangulo));
        System.out.println("El area del cuadrado es " + imprimirArea(cuadrado));
        System.out.println("El area del rectangulo es " + imprimirArea(rectangulo));
    }
    public static double imprimirArea(Poligono poligono) {
        return poligono.calcularArea();
    }
}

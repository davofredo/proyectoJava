package figures;

import abstracts.Triangulo;
import interfaces.IMedidas;

public class TrianguloIsosceles extends Triangulo implements IMedidas {

    private double lado;
    private double base;

    public TrianguloIsosceles(double lado, double base) {
        this.lado = lado;
        this.base = base;
        super.altura = this.calculateHeight();
    }

    @Override
    public double calculateHeight() {
        super.altura = Math.sqrt(Math.pow(this.lado, 2) - (Math.pow(this.base, 2) / 4));
        return this.altura;
    }

    @Override
    public double calculatePerimeter() {
        super.perimetro = (this.lado * 2) + this.base;
        return super.perimetro;
    }

    @Override
    public double calculateArea() {
        super.area = super.calculateArea(this.base);
        return super.area;
    }
}

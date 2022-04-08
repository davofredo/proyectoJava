package figures;

import abstracts.FiguraGeometrica;
import interfaces.IMedidas;

public class Circulo extends FiguraGeometrica implements IMedidas {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculatePerimeter() {
        super.perimetro = Math.PI * (this.radio * 2);
        return super.perimetro;
    }

    @Override
    public double calculateArea() {
        super.area = Math.PI * Math.pow(this.radio, 2);
        return super.area;
    }
}

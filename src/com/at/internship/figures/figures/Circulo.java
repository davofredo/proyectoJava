package com.at.internship.figures.figures;

import com.at.internship.figures.abstracts.FiguraGeometrica;
import com.at.internship.figures.interfaces.IMedidas;

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

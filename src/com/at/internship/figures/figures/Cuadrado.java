package com.at.internship.figures.figures;

import com.at.internship.figures.abstracts.FiguraGeometrica;
import com.at.internship.figures.interfaces.IMedidas;

public class Cuadrado extends FiguraGeometrica implements IMedidas {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculatePerimeter() {
        super.perimetro = this.lado * 4;
        return super.perimetro;
    }

    @Override
    public double calculateArea() {
        super.area = Math.pow(this.lado, 2);
        return super.area;
    }
}

package com.at.internship.figures.figures;

import com.at.internship.figures.abstracts.Triangulo;
import com.at.internship.figures.interfaces.IMedidas;

public class TrianguloEquilatero extends Triangulo implements IMedidas {

    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
        super.altura = this.calculateHeight();
    }

    @Override
    public double calculateHeight() {
        super.altura = (Math.sqrt(3) * this.lado) / 2;
        return super.altura;
    }

    @Override
    public double calculatePerimeter() {
        super.perimetro = this.lado * 3;
        return super.perimetro;
    }

    @Override
    public double calculateArea() {
        super.area = super.calculateArea(this.lado);
        return super.area;
    }
}

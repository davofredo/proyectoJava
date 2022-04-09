package com.at.internship.figures.figures;

import com.at.internship.figures.abstracts.GeometricFigure;
import com.at.internship.figures.interfaces.IMasures;

public class Rectangle extends GeometricFigure implements IMasures {

    private double base;
    private double altura;

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculatePerimeter() {
        super.perimetro = (this.base * 2) + (this.altura * 2);
        return super.perimetro;
    }

    @Override
    public double calculateArea() {
        super.area = this.base * this.altura;
        return super.area;
    }
}

package com.at.internship.figures.figures;

import com.at.internship.figures.abstracts.GeometricFigure;
import com.at.internship.figures.interfaces.IMeasures;

public class Square extends GeometricFigure implements IMeasures {

    private double lado;

    public Square(double lado) {
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

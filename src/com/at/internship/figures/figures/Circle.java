package com.at.internship.figures.figures;

import com.at.internship.figures.abstracts.GeometricFigure;
import com.at.internship.figures.interfaces.IMeasures;

public class Circle extends GeometricFigure implements IMeasures {

    private double radio;

    public Circle(double radio) {
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

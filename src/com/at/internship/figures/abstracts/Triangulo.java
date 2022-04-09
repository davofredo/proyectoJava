package com.at.internship.figures.abstracts;

public abstract class Triangulo extends FiguraGeometrica {

    protected double altura;

    public abstract double calculateHeight();

    protected double calculateArea(double lado) {
        return (lado * this.altura) / 2;
    };
}
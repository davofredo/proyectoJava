package com.at.internship.figures.abstracts;

public abstract class Triangle extends GeometricFigure {

    protected double altura;

    public abstract double calculateHeight();

    protected double calculateArea(double lado) {
        return (lado * this.altura) / 2;
    };
}
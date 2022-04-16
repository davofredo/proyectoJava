package com.at.internship.figures.abstracts;

public abstract class Triangle extends GeometricFigure {

    protected double altura;

    public abstract double calculateHeight();

    protected double calculateArea(double lado) {
        // TODO: altura could be 0 if height was not calulated yet. A better approach would be return (lado * calculateHeight()) / 2
        // TODO: If there is a height, there should be a base already established. You could define an abstract double getBase instead of asking a side as input.
        return (lado * this.altura) / 2;
    };
}
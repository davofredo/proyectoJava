package main;
import com.at.internship.figures.gui.*;
import com.at.internship.figures.interfaces.IMedidas;
import javax.swing.JOptionPane;

import com.at.internship.figures.*;
public class Main {

   public static void main(String[] args) {
   	//Main menu
   
	LooknFeel looknFeel= new LooknFeel(true);    

//	IMedidas medidas = null;

//        switch (figura) {
//            case CIRCLE:
//                double radio = Double.parseDouble(JOptionPane.showInputDialog(String.format(Messages.INPUT_RADIUS, Messages.UNIT_CM)));
//                medidas = new Circulo(radio);
//                break;
//
//            case SQUARE:
//                double lado = Double.parseDouble(JOptionPane.showInputDialog(String.format(Messages.INPUT_SIDE, Messages.UNIT_CM)));
//                medidas = new Cuadrado(lado);
//                break;
//
//            case RECTANGLE:
//                double base = Double.parseDouble(JOptionPane.showInputDialog(String.format(Messages.INPUT_BASE, Messages.UNIT_CM)));
//                double altura = Double.parseDouble(JOptionPane.showInputDialog(String.format(Messages.INPUT_HEIGHT, Messages.UNIT_CM)));
//                medidas = new Rectangulo(base, altura);
//                break;
//
//            case EQUILATERAL_TRIANGLE:
//                lado = Double.parseDouble(JOptionPane.showInputDialog(String.format(Messages.INPUT_SIDE, Messages.UNIT_CM)));
//                medidas = new TrianguloEquilatero(lado);
//                break;
//
//            case ISOSCELES_TRIANGLE:
//                lado = Double.parseDouble(JOptionPane.showInputDialog(String.format(Messages.INPUT_SIDE, Messages.UNIT_CM)));
//                base = Double.parseDouble(JOptionPane.showInputDialog(String.format(Messages.INPUT_BASE, Messages.UNIT_CM)));
//                medidas = new TrianguloIsosceles(lado, base);
//                break;
//        }
//
//        String message = "The figure was " + figura.getName() + ", its Perimter is: " + medidas.calculatePerimeter() + "cm and its Area: " + medidas.calculateArea()+ "cm2";
//
//        System.out.println(message);
    }
    
}
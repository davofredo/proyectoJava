package main;
import constants.Mensajes;
import constants.TipoFigurasEnum;
import figuras.*;
import interfaces.IMedidas;

import javax.swing.*;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

   public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Mensajes.INGRESO_OPCION_FIGURA);
        TipoFigurasEnum[] figuras = TipoFigurasEnum.values();

        for(TipoFigurasEnum f : figuras) {
            sb.append(String.format(Mensajes.FORMATO_OPCIONES_FIGURAS, f.getOpcion(), f.getNombre()));
        }
        int nombreFigura = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
        TipoFigurasEnum figura  = getNombreFigura(nombreFigura);
        IMedidas medidas = null;

        switch (figura) {
            case CIRCULO:
                double radio = Double.parseDouble(JOptionPane.showInputDialog(String.format(Mensajes.INGRESO_RADIO, Mensajes.UNIDAD_MEDIDA_CM)));
                medidas = new Circulo(radio);
                break;

            case CUADRADO:
                double lado = Double.parseDouble(JOptionPane.showInputDialog(String.format(Mensajes.INGRESO_LADO, Mensajes.UNIDAD_MEDIDA_CM)));
                medidas = new Cuadrado(lado);
                break;

            case RECTANGULO:
                double base = Double.parseDouble(JOptionPane.showInputDialog(String.format(Mensajes.INGRESO_BASE, Mensajes.UNIDAD_MEDIDA_CM)));
                double altura = Double.parseDouble(JOptionPane.showInputDialog(String.format(Mensajes.INGRESO_ALTURA, Mensajes.UNIDAD_MEDIDA_CM)));
                medidas = new Rectangulo(base, altura);
                break;

            case TRIANGULO_EQUILATERO:
                lado = Double.parseDouble(JOptionPane.showInputDialog(String.format(Mensajes.INGRESO_LADO, Mensajes.UNIDAD_MEDIDA_CM)));
                medidas = new TrianguloEquilatero(lado);
                break;

            case TRIANGULO_ISOSCELES:
                lado = Double.parseDouble(JOptionPane.showInputDialog(String.format(Mensajes.INGRESO_LADO, Mensajes.UNIDAD_MEDIDA_CM)));
                base = Double.parseDouble(JOptionPane.showInputDialog(String.format(Mensajes.INGRESO_BASE, Mensajes.UNIDAD_MEDIDA_CM)));
                medidas = new TrianguloIsosceles(lado, base);
                break;
        }

        String mensaje = "La figura ingresada fue " + figura.getNombre() + ", que tiene como perímetro: " + medidas.calcularPerimetro() + "cm y área: " + medidas.calcularArea() + "cm2";

        System.out.println(mensaje);
    }

    public static TipoFigurasEnum getNombreFigura(int opcion) {
        return Arrays.stream(TipoFigurasEnum.values()).filter(f -> f.getOpcion() == opcion).findFirst().orElseThrow(NoSuchElementException::new);
    }
}
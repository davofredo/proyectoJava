package main;
import com.at.internship.figures.gui.*;
public class Main {

   public static void main(String[] args) {
   	//Main menu
   
	LooknFeel looknFeel= new LooknFeel(true);    
	   
	   
//   Window mainWindow = new Window();
//   mainWindow.generateMainWindow();
//   
//   Window FiguresWindow = new Window();
//   FiguresWindow.generateFiguresWindow();
	   	   
//	   MenuOptionsEnum[] menu = MenuOptionsEnum.values();
//	   StringBuilder sb_menu = new StringBuilder(Messages.MENU);
//	   for(MenuOptionsEnum m : menu) {
//	   		sb_menu.append(String.format(Messages.FORMAT_OPTIONS, m.getOption(), m.getName()));
//	   }
//	   	
//	    int numberOption= Integer.parseInt(JOptionPane.showInputDialog(sb_menu.toString()));
//	    MenuOptionsEnum menu_option= getMenuOpcion(numberOption);
//	    System.out.println(menu_option);


//	   	//Figures Menu
//	   	StringBuilder sb = new StringBuilder(Messages.INPUT_FIGURE_OPTION);
//	   	TypeFiguresEnum[] figuras = TypeFiguresEnum.values();
//
//        for(TypeFiguresEnum f : figuras) {
//            sb.append(String.format(Messages.FORMAT_FIGURE_OPTIONS,f.getOption(), f.getName()));
//        }
//        int nombreFigura = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
//        TypeFiguresEnum figura  = getNameFigura(nombreFigura);
//        IMedidas medidas = null;
//
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
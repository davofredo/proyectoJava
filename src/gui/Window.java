package gui; 
import constants.*;
import figures.*;
import interfaces.*;
import javax.swing.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
import gui.*;
import javax.swing.JOptionPane;

public class Window {
	

	
	public void generateMainWindow() {
		
		   MenuOptionsEnum[] menu = MenuOptionsEnum.values();
		   StringBuilder sb_menu = new StringBuilder(Messages.MENU);
		   for(MenuOptionsEnum m : menu) {
		   		sb_menu.append(String.format(Messages.FORMAT_OPTIONS, m.getOption(), m.getName()));
		   }
		   	
		    int numberOption= Integer.parseInt(JOptionPane.showInputDialog(sb_menu.toString()));
		    MenuOptionsEnum menu_option= getMenuOpcion(numberOption);
		    System.out.println(menu_option);
	}
	
	public void generateFiguresWindow() {
	   	//Figures Menu
	   	StringBuilder sb = new StringBuilder(Messages.INPUT_FIGURE_OPTION);
	   	TypeFiguresEnum[] figuras = TypeFiguresEnum.values();
	
	    for(TypeFiguresEnum f : figuras) {
	        sb.append(String.format(Messages.FORMAT_FIGURE_OPTIONS,f.getOption(), f.getName()));
	    }
	    int nombreFigura = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
	    TypeFiguresEnum figura  = getNameFigura(nombreFigura);	
		
	}
		
		
	public static MenuOptionsEnum getMenuOpcion(int option) {
        return Arrays.stream(MenuOptionsEnum.values()).filter(f -> f.getOption() == option).findFirst().orElseThrow(NoSuchElementException::new);
    }
	
	
	public static TypeFiguresEnum getNameFigura(int option) {
        return Arrays.stream(TypeFiguresEnum.values()).filter(f -> f.getOption() == option).findFirst().orElseThrow(NoSuchElementException::new);
    }
}



	
	
	
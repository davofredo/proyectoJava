package com.at.internship.figures.gui; 
//import figures.*;
//import interfaces.*;
//import javax.swing.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
//import gui.*;
import javax.swing.JOptionPane;

import com.at.internship.figures.constants.*;

public class Window {
	private int option;
	
	//Main menu
	public com.at.internship.figures.constants.MenuOptionsEnum generateMainWindow() {
		
		MenuOptionsEnum[] menu = MenuOptionsEnum.values();
		
		StringBuilder sb_menu = new StringBuilder(Messages.MENU);
		for(MenuOptionsEnum m : menu) {
			sb_menu.append(String.format(Messages.FORMAT_OPTIONS, m.getOption(), m.getName()));
		}
   	
	    this.option= Integer.parseInt(JOptionPane.showInputDialog(sb_menu.toString()));
	    com.at.internship.figures.constants.MenuOptionsEnum menu_option= getMenuOpcion(this.option);
	    System.out.println(menu_option);
	    
	    return menu_option;
	    		
	}
	
	//Figures Menu
	public com.at.internship.figures.constants.TypeFiguresEnum generateFiguresWindow() {
	   	
	   	StringBuilder sb = new StringBuilder(Messages.INPUT_FIGURE_OPTION);
	   	TypeFiguresEnum[] figures = TypeFiguresEnum.values();
	
	    for(TypeFiguresEnum f : figures) {
	        sb.append(String.format(Messages.FORMAT_FIGURE_OPTIONS,f.getOption(), f.getName()));
	    }
	    
	    this.option = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
	    com.at.internship.figures.constants.TypeFiguresEnum figure  = getNameFigura(this.option);	
	    System.out.println(figure);
	    
	    return figure;
	}
		
		
	public static MenuOptionsEnum getMenuOpcion(int option) {
        return Arrays.stream(MenuOptionsEnum.values()).filter(f -> f.getOption() == option).findFirst().orElseThrow(NoSuchElementException::new);
    }
	
	
	public static TypeFiguresEnum getNameFigura(int option) {
        return Arrays.stream(TypeFiguresEnum.values()).filter(f -> f.getOption() == option).findFirst().orElseThrow(NoSuchElementException::new);
    }
}



	
	
	
package com.at.internship.figures.gui; 
//import figures.*;
//import interfaces.*;
//import javax.swing.*;
import java.util.Arrays;
import java.util.NoSuchElementException;
//import gui.*;
import javax.swing.JOptionPane;

import com.at.internship.figures.constants.*;
/*
 * AUTHOR: ALBERTO CRUZ GALVAN INTERN 32
 * DATE: 20220409
 * DEC: This class supports to LooknFeel in order to
 * 		provide all technical tools for showing the GUI interface.
 ** */
public class Window {
	private int option;
	
	//Main menu
	public MenuOptionsEnum generateMainWindow() {
		
		MenuOptionsEnum[] menu = MenuOptionsEnum.values();
		
		StringBuilder sb_menu = new StringBuilder(Messages.MENU);
		for(MenuOptionsEnum m : menu) {
			if (m != MenuOptionsEnum.WRONG) {
				sb_menu.append(String.format(Messages.FORMAT_OPTIONS, m.getOption(), m.getName()));
			}
		}

	    this.option= Integer.parseInt(JOptionPane.showInputDialog(sb_menu.toString()));
	    MenuOptionsEnum menu_option= getMenuOption(this.option);

	    return menu_option;
	    		
	}
	
	//Figures Menu
	public TypeFiguresEnum generateFiguresWindow() {
	   	
	   	StringBuilder sb = new StringBuilder(Messages.INPUT_FIGURE_OPTION);
	   	TypeFiguresEnum[] figures = TypeFiguresEnum.values();
	
	    for(TypeFiguresEnum f : figures) {
	        if (f!=TypeFiguresEnum.WRONG) {
	        	sb.append(String.format(Messages.FORMAT_FIGURE_OPTIONS,f.getOption(), f.getName()));
	        }
	    }
	    
	    this.option = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
	    TypeFiguresEnum figure  = getFigureName(this.option);	
	    System.out.println(figure);
	    
	    return figure;
	}
	
	
	public int generateFileExplirerWindow(String contents[]) {
		StringBuilder sb = new StringBuilder(Messages.FILE_EXPLORER_OPTION);
		for (int i = 0; i < contents.length; i++) {
			sb.append("\n"+(i+1)+"- "+contents[i]+"\n");
		}
		 
		int dir_option=Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
		
		return dir_option;
	}
	
	public int generateDirContentsWindow(String dirContents[]) {
		StringBuilder sb = new StringBuilder(Messages.FILE_OPTION);
		for (int i = 0; i < dirContents.length; i++) {
			sb.append("\n"+(i+1)+"- "+dirContents[i]+"\n");
		}
		int dir_option=Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
		
		return dir_option;
	}
	
	public void invalidOptionWindow() {
		JOptionPane.showMessageDialog(null, Messages.EXCEPTION_1_DESCRIPTION,
			      Messages.EXCEPTION_1_ORIGIN, JOptionPane.ERROR_MESSAGE);
	}
	
	
	//The Menu option DESC is returned	
	public static MenuOptionsEnum getMenuOption(int option) {
        return Arrays.stream(MenuOptionsEnum.values()).filter(f -> f.getOption() == option).findFirst().orElseThrow(NoSuchElementException::new);
    }
	
	//The figure NAME is returned	
	public static TypeFiguresEnum getFigureName(int option) {
        return Arrays.stream(TypeFiguresEnum.values()).filter(f -> f.getOption() == option).findFirst().orElseThrow(NoSuchElementException::new);
    }
}



	
	
	
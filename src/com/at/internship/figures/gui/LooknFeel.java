package com.at.internship.figures.gui;
/*
 * AUTHOR: ALBERTO CRUZ
 * DATE: 20220409
 * DEC: This class manages all related with GUI interface
 * 		and uses Window class (located in this package too). 
 * 		Without this class it is not possible getting the GUI interface.
 * */
public class LooknFeel {
	private boolean setVisible;
	
	public LooknFeel(boolean setVisible) {
		 	
		 this.setVisible=setVisible;
		 
		 if (this.setVisible==true){
			 Window mainWindow = new Window();
			 mainWindow.generateMainWindow();
			 
			 Window FiguresWindow = new Window();
			 FiguresWindow.generateFiguresWindow();
		}
		 
	}
	
}

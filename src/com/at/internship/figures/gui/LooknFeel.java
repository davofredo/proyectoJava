package com.at.internship.figures.gui;
import com.at.internship.figures.figures.*;
import com.at.internship.figures.interfaces.IMasures;
import javax.swing.JOptionPane;
import com.at.internship.figures.constants.*;
/*
 * AUTHOR: ALBERTO CRUZ GALVAN INTERN 32
 * DATE: 20220409
 * DEC: This class manages all related with GUI interface
 * 		and uses Window class (located in this package too). 
 * 		Without this class it is not possible getting the GUI 
 * 		interface and anything else.
 * */
public class LooknFeel {
	
	//Attributes
	//------------------------------------------------------------
	private boolean guiInterface;
	private Window mainWindow = new Window();
	private Window figureWindow= new Window();
	
	//Constructor. It activates all the program or not
	//------------------------------------------------------------
	public LooknFeel(boolean activate) {
		this.guiInterface=activate;
		
		guiInterface(this.guiInterface);
	}
	
	//Methods
	//------------------------------------------------------------
	
	//Contains all logical rules for managing the app's GUI interface
	private void guiInterface(boolean guiInterface) {
			
				
		if (guiInterface==true) {
			MenuOptionsEnum main_option=mainWindow();
			
			switch (main_option) {
				case REGISTER:
					
					TypeFiguresEnum figure_choosen=figureWindow();
					guiFigureInterface(figure_choosen);
					break;
					
				case OPEN: 
					System.out.println(main_option);	
					break;
				case EXIT: 
					System.out.println(main_option);	
					guiInterface(false);
					break;
				default:
					mainWindow.invalidOptionWindow();
					guiInterface(true);

			}	
				
		}else{System.out.println(Messages.SUPPORT_MESSAGE_1);}
	}
	
	private void guiFigureInterface(TypeFiguresEnum figure_choosen) {
		IMasures measures = null;

		switch(figure_choosen) {
			case CIRCLE:
				double radius = Double.parseDouble(JOptionPane.showInputDialog
						(String.format(Messages.INPUT_RADIUS, Messages.UNIT_CM)));
				measures = new Circle(radius);
				break;
		
			case SQUARE:
				double side = Double.parseDouble(JOptionPane.showInputDialog
						(String.format(Messages.INPUT_SIDE, Messages.UNIT_CM)));
				measures = new Square(side);
				break;
		
			case RECTANGLE:
				double base = Double.parseDouble(JOptionPane.showInputDialog
						(String.format(Messages.INPUT_BASE, Messages.UNIT_CM)));
				double altura = Double.parseDouble(JOptionPane.showInputDialog
						(String.format(Messages.INPUT_HEIGHT, Messages.UNIT_CM)));
				measures = new Rectangle(base, altura);
				break;
		
			case EQUILATERAL_TRIANGLE:
				side = Double.parseDouble(JOptionPane.showInputDialog
						(String.format(Messages.INPUT_SIDE, Messages.UNIT_CM)));
				measures = new TriangleEquilateral(side);
				break;
		
			case ISOSCELES_TRIANGLE:
				side = Double.parseDouble(JOptionPane.showInputDialog
						(String.format(Messages.INPUT_SIDE, Messages.UNIT_CM)));
				base = Double.parseDouble(JOptionPane.showInputDialog
						(String.format(Messages.INPUT_BASE, Messages.UNIT_CM)));
				measures = new TriangleIsosceles(side, base);
				break;
		}//Switch end
		
		String message = "The figure was a " + figure_choosen+ ", its Perimter is: " 
						+ measures.calculatePerimeter() + "cm and its Area is: " 
						+ measures.calculateArea()+ "cm2";
		//		String message = "The figure was a" + Window.getNameFigura(1)+ ", its Perimter is: " + measures.calculatePerimeter() + "cm and its Area: " + measures.calculateArea()+ "cm2";
		
		JOptionPane.showMessageDialog(null, message,
			      Messages.RESULT, JOptionPane.DEFAULT_OPTION);
		System.out.println(message);
		guiInterface(true);
		
	}
	
	
	
	//1st window method - all steps for generating it
	//is in this method and Window class
	private MenuOptionsEnum mainWindow() {
		
		//Default value if is not typed correctly by the user
		MenuOptionsEnum main_option=MenuOptionsEnum.WRONG;
		try {
			main_option=mainWindow.generateMainWindow();
		} catch (Exception e) {e.getMessage();} 
		
		return main_option;		 
	}
	
	
	private TypeFiguresEnum figureWindow() {
		TypeFiguresEnum figure_choosen=TypeFiguresEnum.WRONG;
		try {
			figure_choosen=mainWindow.generateFiguresWindow();
		} catch ( Exception e) {e.getMessage();}
		
		return figure_choosen;
	}
	
}

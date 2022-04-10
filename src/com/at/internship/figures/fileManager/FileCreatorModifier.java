package com.at.internship.figures.fileManager;
/*
 * AUTHOR: ALBERTO CRUZ GALVAN INTERN 32
 * DATE: 20220410
 * DEC: This class supports FileManager class
 * 		It helps with the file's creations and it contains.
 		a method for modifying.
 **/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.at.internship.figures.constants.FoldersnFilesEnum;
import com.at.internship.figures.constants.Messages;

public class FileCreatorModifier extends FileManager {
	
	public String file_name;
	
	//Constructor
	public FileCreatorModifier(String folderName){
		boolean process=true;
		
		while (process) {
			
			String usersInput=JOptionPane.showInputDialog(Messages.FILE_NAME);
			FoldersnFilesEnum fileExtension=FoldersnFilesEnum.FILE_EXTENSION;
			this.file_name=folderName+"/"+usersInput+fileExtension.getName();
			
			
			if(verifyExistance(this.file_name)) { //File's name is not available
				int overwritteFile=JOptionPane.showConfirmDialog(null,Messages.FILE_EXISTS_QUESTION,
				            Messages.FILE_EXISTS,JOptionPane.YES_NO_OPTION);
				System.out.println("Overwritte file: "+overwritteFile);
				
				switch (overwritteFile) {
				case 0: //It overwrites the file
					process=false;
					generatingFile(this.file_name);
					break;

				case 1: //It ask user for another name
					process=true;
					break;
				}
			}
			else {//File's name is available
				process=false;
				generatingFile(this.file_name);
			}
			
		}
		
		

		
		
	}
	
	/*Methods
	*------------------------------------------------------------*/
	public String generatingFile(String file_name){
		//default values
		boolean fileCreated=false;
		boolean fileExistance=false;
		
		//validation			
		if (verifyExistance(this.file_name)) {
			fileExistance=true;
		}else {
			fileExistance=false;
			//creation
			try {
				File file= new File(file_name);
				if (file.createNewFile()) {
					System.out.println("File created: " + file.getName());
					fileCreated=true;
				} else {
					System.out.println("File already exists.");
					fileCreated=false;
				}
			} catch (IOException e) {
				  fileCreated=false;
				  System.out.println("An error occurred.");
			      e.printStackTrace();
			  }
		   }
				
			
		return this.file_name;
	}
	
	
	
	
	
}

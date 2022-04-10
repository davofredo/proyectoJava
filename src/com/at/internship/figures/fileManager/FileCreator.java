package com.at.internship.figures.fileManager;
/*
 * AUTHOR: ALBERTO CRUZ GALVAN INTERN 32
 * DATE: 20220410
 * DEC: This class supports FileManager class
 * 		It helps with the file's creations.
 **/
import java.io.File;  
import java.io.IOException;  
import com.at.internship.figures.constants.FoldersnFilesEnum;

public class FileCreator extends FileManager {
	
	public String file_name;
	
	//Constructor
	public FileCreator(String folderName){
		FoldersnFilesEnum fileExtension=FoldersnFilesEnum.FILE_EXTENSION;
		this.file_name=folderName+"/"+getCurrentDate()+fileExtension.getName();
		System.out.println(file_name);
		generatingFile(this.file_name);
	}
	
	/*Methods
	*------------------------------------------------------------*/
	public boolean generatingFile(String file_name){
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
				
			
		return fileCreated;
	}
	
	
}

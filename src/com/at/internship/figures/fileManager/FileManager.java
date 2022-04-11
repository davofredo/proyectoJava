package com.at.internship.figures.fileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import com.at.internship.figures.constants.FoldersnFilesEnum;
import com.at.internship.figures.gui.LooknFeel;
/*
 * AUTHOR: ALBERTO CRUZ GALVAN INTERN 32
 * DATE: 20220409
 * DEC: This class manages all related with files and folders
 * */
public class FileManager  {
	
	private String folderName;
	
		
	/*Methods
	*------------------------------------------------------------*/
	public String generatingFilenDirectory() {
		
		FileCreatorModifier fileModifier=new FileCreatorModifier(getDirectory());
		
		String file_name=fileModifier.generatingFile(folderName);
		
		return file_name;
	}
	
	
	/*For creating directory with below's layout 
	 * <root of the app>/mathematical_operations/<yyyy-MM-dd>
	 *The folder's name is the current date
	 * */
	public String getDirectory() {
		//Default value
		boolean exists=false;
		
		FoldersnFilesEnum folderEnum=FoldersnFilesEnum.MATHEMATICAL;
		this.folderName=folderEnum.getName()+getCurrentDate();
		
		/*Validation: if the folder exists before, returns true, 
		* if does not exist, it creates it and returns true too
		* if there was a problem with the folder's creation, returns false
		*/
		if (verifyExistance(this.folderName)) {
			exists=true;
		}else {
			File file = new File(this.folderName);
			//Creation
			try{
				if(file.mkdir())
					exists=true;
				else 
					exists=false;
			}catch(Exception e){e.getMessage();}
		}		
		return this.folderName;
	}
	
	//This method helps to verify if a folder or file exists
	public boolean verifyExistance(String path)
	{
		//default value
		boolean exists=false;
		try {
				File file = new File(path);
				exists=file.exists();
			}catch(Exception e){e.getMessage();}
		return exists;
	}
	
	/*This method helps to get the current's date with the
	 *format requested: yyyy-MM-dd
	 **/
	public String getCurrentDate() {
		
		LocalDate date=LocalDate.now();
		String currentDate = date.toString();
		
		return currentDate;
	}
	
	
	public boolean modifyingFile(String mathematical_result, String file_name) {
		//default value
		boolean success=false;
		String file_content= getCurrentDate()+"\n"+mathematical_result+"\n\n";
		
		try {
		      FileWriter fileWritter = new FileWriter(file_name);
		      fileWritter.write(file_content);
		      fileWritter.close();
		      success=true;
		    } catch (IOException e) {
		      success=false;
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		return success;
	}
	
	
}

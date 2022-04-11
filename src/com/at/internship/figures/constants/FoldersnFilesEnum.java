package com.at.internship.figures.constants;

public enum FoldersnFilesEnum {
	
	MATHEMATICAL("mathematical_calculations/",1)
	,FILE_EXTENSION(".txt",2)
	,MATHEMATICAL_2("mathematical_calculations",2);
	
	private final String name;
    private final int option;

    FoldersnFilesEnum(String name, int option) {
        this.name = name;
        this.option = option;
    }

    public String getName() {
        return name;
    }

    public int getOption() {
        return option;
    }
}

package com.qa.results;

public class Results {

    private static int biology = 50;
    private static int physics = 50;
    private static int chemistry = 50;
    private static int total = 0;
    private static int percentage = 0;
    

    public static int getPercentage(){
    	total = biology + physics + chemistry;
    	percentage = (total*100) / 450;
        return percentage;
    }

    public static void main(String[] args) {
    	System.out.println(getPercentage());
    }
	// Program should return 33	
}

package com.ca.calculator;

public class Calculator {
	
    private static int biology = 50;
    private static int physics = 50;
    private static int chemistry = 50;
    private static int total = 0;
    private static int percentage = 0;
    private static int passmark = 60;
    

    public static int getPercentage(){
    	total = biology + physics + chemistry;
    	percentage = (total*100) / 450;
        
        
        if(percentage >= passmark) {
            System.out.println("You Passed");
        } else {
            System.out.println("You have failed, what will you do with your life now?");
        }
        return percentage;
    }

    public static void main(String[] args) {
    	System.out.println(getPercentage());
    }

}

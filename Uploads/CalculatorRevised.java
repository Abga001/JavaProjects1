package com.qa.calculatorrevised;

public class CalculatorRevised {

    private static int biology = 50;
    private static int physics = 150;
    private static int chemistry = 150;
    private static int total = 0;
    private static int percentage = 0;
    private static int passmark = 60;
    

    public static int getPercentage(){
    	total = biology + physics + chemistry;
    	percentage = (total*100) / 450;
        
        
        if(percentage >= passmark & biology >= 90 
           & physics >= 90 & chemistry >= 90) 
        
        {
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

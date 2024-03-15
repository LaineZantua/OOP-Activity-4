package oopactivity_4;

import java.util.Scanner;



public class Zantua_OOPActivity_4 {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        
    int score;
        System.out.println("Your Entrance Exam Score:");
        score = scn.nextInt();
        
    if (score >= 90){
    double GPA = 3.5;
         System.out.println("GPA is above: " + GPA); 
         System.out.println("Congratulations! You are now officially enrolled in UMDC.");
    }else if (score <= 90){
    double GPA = 3.5;
         System.out.println("Your GPA is below: " + GPA);
         System.out.println("Sorry, you are not eligible for admission.");
        }
    scn.close();
    }
}

    
    


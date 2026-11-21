package com.mycompany.studentavgmark;

import java.util.Scanner;
/**
 * This program aims to calculate a student's average mark
 * @author Amahle Lisah Khumalo
 */
public class StudentAvgMark {

    public static void main(String[] args) { 
        
        Scanner scanner = new Scanner(System.in);
        
        // Declaration of varibales         
        double mark1;
        double mark2;
        double mark3;
        double mark4;
        double average;
        
        // Input the data (marks)       
        System.out.print("Enter mark 1: ");
        mark1 = scanner.nextDouble();
        
        System.out.print("Enter mark 2: ");
        mark2 = scanner.nextDouble();

        System.out.print("Enter mark 3: ");
        mark3 = scanner.nextDouble();
        
        System.out.print("Enter mark 4: ");
        mark4 = scanner.nextDouble();
        
        // 3. PROCESS (Claculating the averge mark)
        average = (mark1 + mark2 + mark3 ) / 4;
        
        // 4. OUTPUT (the average is calculated) 
        System.out.println("Your average mark is: " + average);
        
        scanner.close();  // scanner closed
    }   
} // closed class
    
      


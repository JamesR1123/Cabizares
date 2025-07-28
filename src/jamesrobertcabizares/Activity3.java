
package jamesrobertcabizares;

import java.util.Scanner;


public class Activity3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        if (num == 0) {
            System.out.println("Inputted number is Zero ");
        } else if (num > 0) {
            System.out.println(" is a positive number ");
        } else { 
            System.out.println(" is a negative number ");
        }
        
        sc.close();
        }
    }

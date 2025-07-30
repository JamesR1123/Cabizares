package jamesrobertcabizares;

import java.util.Scanner;


public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter hourly rate: ");
        float hourrate = sc.nextFloat();
        
        System.out.println("Enter total hours worked: ");
        float totalhours = sc.nextFloat();
        
        System.out.println("-----Wage Summary-----");
        System.out.println("Employee: "+name);
        System.out.println("Hourly Rate: "+hourrate);
        System.out.println("Hours Worked: "+totalhours);
        System.out.println("Gross Weekly Wage: "+(hourrate*totalhours));
        System.out.printf("SSS Contribution(10%%): ₱%.2f\n ",+(totalhours*hourrate)*01);
        System.out.println("-----------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n\n",((totalhours*hourrate)-(totalhours*hourrate)*0.1));        
    }
}
package jamesrobertcabizares;

import java.util.Scanner;


public class Activity1 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();
        System.out.print("Enter marks in History: ");
        int history = sc.nextInt();
        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
        int soc = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
        int arts = sc.nextInt();

        int totalMarks = science + history + math + soc + arts;
        double percentage = totalMarks / 5.0;

        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage >= 71 && percentage <= 75) {
            remarks = "Poor";
        } else if (percentage >= 76 && percentage <= 80) {
            remarks = "Fair";
        } else if (percentage >= 81 && percentage <= 85) {
            remarks = "Good";
        } else if (percentage >= 86 && percentage <= 90) {
            remarks = "Very Good";
        } else if (percentage >= 91 && percentage <= 100) {
            remarks = "Excellent";
        } else {
            remarks = "Invalid Percentage";
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Total Percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);
 
        if (percentage >= 70) {
            System.out.println("Congratulations " + name + ", you PASSED.");
        } else {
            System.out.println("Sorry " + name + ", you FAILED.");
        }

        sc.close();
    }
}

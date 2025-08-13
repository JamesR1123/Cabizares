package jamesrobertcabizares;

import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);

        System.out.print("Distance(km): ");
        double distance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Class: ");
        int claSS = scanner.nextInt();

        double rate = 0;
      
        if (claSS == 1) {
            rate = 250;
        } else if (claSS == 2) {
            rate = 500;
        } else {
            System.out.println("Invalid class.");
            return;
        }

        double totalFare = distance * rate;
        System.out.println("-----------------------");
        System.out.println("Total Fare: ₱" + totalFare);
    }
}


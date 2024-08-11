package com.priceside_drf.deltaj.paymentgateway;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		PaymentGateway gateway = new PaymentGateway();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nPayment Gateway Demo");
            System.out.println("1. Process Payment");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
            	
            	gateway.initiate(scanner);
            	
	        } else if (choice == 2) {
	            System.out.println("Exiting. Thank you!");
	            break;
	        } else {
	            System.out.println("Invalid option. Please try again.");
	        }
        }
	}
}

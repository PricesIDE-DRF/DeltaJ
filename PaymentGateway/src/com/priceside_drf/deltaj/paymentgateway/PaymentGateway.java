package com.priceside_drf.deltaj.paymentgateway;
import java.util.Scanner;

public class PaymentGateway {
	String[] supportedCurrencies = {"USD", "EUR", "GBP", "JPY", "IDR"};
	
	private boolean isCurrencySupported(String currency) {
        for (String supported : supportedCurrencies) {
            if (supported.equals(currency)) return true;
        }
        return false;
    }
	
    private boolean processPayment(double amount, String currency) {
        // Basic payment processing logic
        System.out.println("Processing payment of " + amount + " " + currency);
        return true;
    }
    
    void initiate(Scanner scanner) {
        System.out.print("Enter currency (USD, EUR, GBP, JPY, IDR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();
        
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        
        boolean result = false;
        
        if (isCurrencySupported(targetCurrency)) {
        	result = this.processPayment(amount, targetCurrency);
        } else {
        	System.out.println("Currency not supported: " + targetCurrency);
        }
        
        if (result) {
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment processing failed.");
        }
    }
}

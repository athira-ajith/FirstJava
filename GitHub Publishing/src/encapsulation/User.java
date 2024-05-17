package encapsulation;

import java.util.Scanner;

public class User {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter your PIN: ");
	        int pin = scanner.nextInt();

	        Atm atm = new Atm();
	        atm.setPin(pin);

	        System.out.println("Enter the amount to withdraw: ");
	        double amount = scanner.nextDouble();

	        atm.withdrawMoney(amount);
	    }
	}
	




package encapsulation;

import java.util.Scanner;

public class Atm {
    private int pin;

    // Method to set pin
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Method to validate pin
    public boolean validatePin() {
        int[] validPins = {1001, 1234, 1212};
        for (int validPin : validPins) {
            if (pin == validPin) {
                return true;
            }
        }
        return false;
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (validatePin()) {
            // Withdrawal logic goes here
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Invalid PIN. Withdrawal failed.");
        }
    }
}


   





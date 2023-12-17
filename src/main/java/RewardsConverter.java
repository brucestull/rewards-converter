import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var inputValue = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(inputValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + inputValue + " to miles");
        var rewardsValueFromCash = new RewardValue(cashValue);
        System.out.println("$" + inputValue + " is worth " + rewardsValueFromCash.getMilesValue() + " miles");
        // Convert miles to cash:
        System.out.println("Please enter an airline miles value to convert to cash: ");
        inputValue = scanner.nextLine();
        int milesValue;
        try {
            milesValue = Integer.parseInt(inputValue);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting " + inputValue + " to cash");
        RewardValue rewardsValueFromMiles = new RewardValue(milesValue);
        System.out.println(inputValue + " miles is worth $" + rewardsValueFromMiles.getCashValue());
    }
}
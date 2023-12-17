/**
 * This class represents a RewardValue object.
 * <p>
 * RewardValue can be created using either a cash value or a miles value.
 * It provides methods to retrieve these values and perform conversions between them.
 * Only the `cashValue` will be stored in the object. Conversions will be used to calculate any `milesValue`s.
 */
public class RewardValue {
    // Use `final` since `RewardValue` will not change. This is one specific instance of a `RewardValue`:
    private final double cashValue;
    // Add a constant to hold the conversion rate:
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    /**
     * This is a constructor which saves the submitted cash value in the object.
     *
     */
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    /**
     * This is a constructor which converts submitted miles value to a cash value and saves it in the object.
     *
     */
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    /**
     * This method returns the miles value of cash value.
     *
     * @return An integer representing the miles value.
     */
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    /**
     * This method returns the cash value of miles value.
     *
     * @return A double representing the cash value.
     */
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    /**
     * This method returns the cash value of the RewardValue.
     *
     * @return A double representing the cash value.
     */
    public double getCashValue() {
        return this.cashValue;
    }

    /**
     * This method returns the miles value of the RewardValue.
     *
     * @return A double representing the miles value.
     */
    public double getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

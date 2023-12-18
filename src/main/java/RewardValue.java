/**
 * This class represents a RewardValue object.
 * <p>
 * RewardValue can be created using either a cash value or a miles value.
 * It provides methods to retrieve these values and perform conversions between them.
 */
public class RewardValue {
    private double miles;
    private double cash;
    public RewardValue(int miles) {
        // Set miles to input value:
        this.miles = miles;
        // Convert miles to dollars:
        this.cash = miles * .0035;
    }
    public RewardValue(double cash) {
        // Convert dollars to cents, convert cents to miles, restore decimal to proper place:
        this.miles = Math.round(cash * 100.0f / .0035) / 100.0f;
        // Convert dollars to cents, round to nearest cent, convert to dollars:
        this.cash = Math.round(cash * 100.0f) / 100.0f;
    }

    /**
     * This method returns the cash value of the RewardValue.
     *
     * @return A double representing the cash value.
     */
    public double getCashValue() {
        return this.cash;
    }

    /**
     * This method returns the miles value of the RewardValue.
     *
     * @return A double representing the miles value.
     */
    public double getMilesValue() {
        return this.miles;
    }
}

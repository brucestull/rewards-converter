import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RewardValueTests {

    @Test
    void createWithCashValue() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), 0.01);
    }

    @Test
    void createWithMilesValue() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convertFromCashToMiles() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = Math.round(cashValue * 100.0f / .0035) / 100.0f;
        // epsilon of 0.01 is set for floating point comparison
        assertTrue(Math.abs(expectedMilesValue - rewardValue.getMilesValue()) < 0.01);
    }

    @Test
    void convertFromMilesToCash() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * .0035;
        // epsilon of 0.01 is set for floating point comparison
        assertTrue(Math.abs(expectedCashValue - rewardValue.getCashValue()) < 0.01);

    }
}
package ex26;

import ex25.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        assertAll( () -> assertEquals( 70,
                PaymentCalculator.calculateMonthsUntilPaidOff(5000.0, 12, 100.0) ),
                () -> assertEquals(51, PaymentCalculator.calculateMonthsUntilPaidOff(5000, .9, 100) ),
                () -> assertEquals(19, PaymentCalculator.calculateMonthsUntilPaidOff(3000, 60, 250) ) );
    }
}
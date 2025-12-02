package testproject;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertThat(Calculator.sum(2, 2)).isEqualTo(4);
    }

    @Test
    public void testSubtract() {
        assertThat(Calculator.subtract(3,2)).isEqualTo(1);
    }
    @Test
    public void testDivide() {
         assertEquals(5, new Calculator().divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
         assertThrows(IllegalArgumentException.class, () -> new Calculator().divide(10, 0));
    }
}

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
         assertThat(Calculator.divide(10, 2)).isEqualTo(5);
    }

    @Test
    public void testDivideByZero() {
         assertThatThrownBy(() -> Calculator.divide(10, 0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Division by zero");
    }
}

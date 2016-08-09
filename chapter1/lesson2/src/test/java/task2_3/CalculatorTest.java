package task2_3;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class CalculatorTest {

    @Test
    public void whenPlus() throws Exception {
        final Calculator calculator = new Calculator();
        double checked = 5d;

        calculator.plus(3, 2);

        final double result = calculator.result;
        assertThat(result, is(checked));
    }

    @Test
    public void whenMinus() throws Exception {
        final Calculator calculator = new Calculator();
        double checked = 1d;

        calculator.minus(3, 2);
        final double result = calculator.result;

        assertThat(result, is(checked));
    }

    @Test
    public void whenDivide() throws Exception {
        final Calculator calculator = new Calculator();
        double checked = 3d;

        calculator.devide(6, 2);
        final double result = calculator.result;

        assertThat(result, is(3d));
    }

    @Test
    public void whenMultiply() throws Exception {
        final Calculator calculator = new Calculator();
        double checked = 6d;

        calculator.multiply(3, 2);
        final double result = calculator.result;

        assertThat(result, is(checked));
    }
}
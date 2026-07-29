import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Executed");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Executed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 15;
        int b = 10;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(25, result);
    }
}
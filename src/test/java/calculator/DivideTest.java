package calculator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class DivideTest {
    private Calculator calculator;

    @BeforeMethod
    public void setUp(){
        calculator=new Calculator();
    }

    @Test(testName = "Division by whole number")
    public void testDivideBy(){
        assertEquals(5, calculator.divideBy(55,10),"Divide by Number greater than 0");
    }

    @Test(testName = "Division by zero method 1")  //because this will throw a 'divide by zero' exception
    public void testDivideByZero1(){
        assertThrows(ArithmeticException.class,() -> calculator.divideBy(50,0));
    }

    @Test(testName = "Division by zero method 2", expectedExceptions = ArithmeticException.class)  //because this will throw a 'divide by zero' exception
    public void testDivideByZero2(){
        assertEquals( 0,calculator.divideBy(50,0),"Divide by zero");
    }
}

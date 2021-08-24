package calculator;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class MultiplyTest {
    private Calculator calculator;

    @BeforeClass
    //runs once at start of class
    public static void testsStarting() {
       // System.out.println("Starting Tests");
    }

    @BeforeMethod
    //runs before each @Test
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @AfterMethod
    //runs after each @Test
    public void testComplete() {
        //System.out.println("Test Completed");
    }

    @AfterClass
    //runs at end of class
    public static void allTestsComplete() {
      //  System.out.println("All Tests Completed");
    }

    @Test//(expectedExceptions = Exception.class)
    public void testMultiply(){
        assertEquals(20,calculator.multiplyBy(4,5),
                "Require regular multiplication should work");
    }

    @Test
    @Ignore("Out of scope")
    public void testMultiplyWithZero() {
        assertEquals(0,calculator.multiplyBy(0,5),
                "Multiple with zero should be zero");
        assertEquals(0, calculator.multiplyBy(5,0),
                "Multiple with zero should be zero");
    }
}

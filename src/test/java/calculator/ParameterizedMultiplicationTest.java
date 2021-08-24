package calculator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParameterizedMultiplicationTest {
    private Calculator calculator;

    //create test data:

    @DataProvider(name="Your numbers")
    public static Object[][] yourNumbers(){
        return new Object[][]{
        {0,1,0},
        {1,2,2},
        {4,5,20},
        {1,100,100}};
    }

     //put each set through the test:

    @Test(dataProvider = "Your numbers")
    public void testMultiply(int first, int second, int result) {
        Calculator calculator = new Calculator();
        System.out.println("checking that: " + first + " * " + second + " equals " + result);
        assertEquals(result, calculator.multiplyBy(first,second),"Result");
    }


}

import org.junit.*;
import org.mudit.Calc;

import static org.junit.Assert.*;

public class CalcTest {
    private Calc calculator;

    @Before
    public void setUp(){
        calculator = new Calc();
    }

    @Test
    public void truePositiveSqrt(){
        double number = 16;
        double actual = 4;
        assertEquals(calculator.sqrt(number), actual, 0.2f);
    }

    @Test
    public void truePositiveFactorial(){
        int number = 5;
        int actual = 120;
//        System.out.println("Checking square root of 9");
        assertEquals(calculator.factorial(number), actual, 0.2f);
    }

    @Test
    public void truePositiveLogBase_e(){
        double number = 3.14;
        double actual = 1.1442;
//        System.out.println("Checking square root of 9");
        assertEquals(calculator.logbase_e(number), actual, 0.2f);
    }

    @Test
    public void truePositivePowerX_y(){
        double numberX = 2.3;
        double numberY = 6;
        double actual = 148.0358;
//        System.out.println("Checking square root of 9");
        assertEquals(calculator.powerX_y(numberX, numberY), actual, 0.2f);
    }

    @Test
    public void trueNegativeSqrt(){
        double number = 25;
        double actual = 4;
//        System.out.println("Checking square root of 9");
        assertNotEquals(calculator.sqrt(number), actual, 0.2f);
    }

    @Test
    public void trueNegativeFactorial(){
        int number = 6;
        int actual = 725;
//        System.out.println("Checking square root of 9");
        assertNotEquals(calculator.factorial(number), actual, 0.2f);
    }

    @Test
    public void trueNegativeLogBase_e(){
        double number = 26;
        double actual = 2.99;
//        System.out.println("Checking square root of 9");
        assertNotEquals(calculator.logbase_e(number), actual, 0.2f);
    }

    @Test
    public void trueNegativePowerX_y(){
        double numberX = 6;
        double numberY = 3;
        double actual = 217;
//        System.out.println("Checking square root of 9");
        assertNotEquals(calculator.powerX_y(numberX, numberY), actual, 0.2f);
    }

}

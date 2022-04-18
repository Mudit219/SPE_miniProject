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
    public void correctSqrt(){
        double test1 = 16;
        double res1 = 4;
        double test2 = 256;
        double res2 = 16;
        assertEquals(calculator.sqrt(test1), res1, 0.2f);
        assertEquals(calculator.sqrt(test2), res2, 0.2f);
    }

    @Test
    public void incorrectSqrt(){
        double test1 = 25;
        double res1 = 4;
        assertNotEquals(calculator.sqrt(test1), res1, 0.2f);
    }

    @Test
    public void correctFactorial(){
        int test1 = 5;
        int res1 = 120;
        int test2 = 10;
        int res2 = 3628800;
        assertEquals(calculator.factorial(test1), res1, 0.2f);
        assertEquals(calculator.factorial(test2), res2, 0.2f);
    }

    @Test
    public void incorrectFactorial(){
        int test1 = 6;
        int res1 = 725;
        assertNotEquals(calculator.factorial(test1), res1, 0.2f);
        assertNotEquals(calculator.factorial(test1), res1, 0.2f);
    }

    @Test
    public void correctLogBase_e(){
        double test1 = 3.14;
        double res1 = 1.1442;
        double test2 = 29;
        double res2 = 3.3672;
        assertEquals(calculator.logbase_e(test1), res1, 0.2f);
        assertEquals(calculator.logbase_e(test2), res2, 0.2f);
    }

    @Test
    public void incorrectLogBase_e(){
        double test1 = 26;
        double res1 = 2.99;
        assertNotEquals(calculator.logbase_e(test1), res1, 0.2f);
    }

    @Test
    public void correctPowerX_y(){
        double test1numberX = 2.3;
        double test1numberY = 6;
        double res1 = 148.0358;
        double test2numberX = 13;
        double test2numberY = 4;
        double res2 = 28561;
        assertEquals(calculator.powerX_y(test1numberX, test1numberY), res1, 0.2f);
        assertEquals(calculator.powerX_y(test2numberX, test2numberY), res2, 0.2f);
    }

    @Test
    public void incorrectPowerX_y(){
        double numberX = 6;
        double numberY = 3;
        double res = 217;
        assertNotEquals(calculator.powerX_y(numberX, numberY), res, 0.2f);
    }

}

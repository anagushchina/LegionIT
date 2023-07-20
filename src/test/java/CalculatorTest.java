import EnumsExeptions.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @BeforeAll
    public static void testSetup(){
        System.out.println("Before All method");
    }

    @AfterAll
    public static void testTearDown(){
        System.out.println("After All method");
    }

    @BeforeEach
    public void eachTestSetup(){
        System.out.println("Before each method");
    }

    @AfterEach
    public void eachTestTearDown(){
        System.out.println("After each method");
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 0, 23, 34211223, -2323145})
    public void summaryParamsTest(int a) {
       double b = 6;
       double expectedResult = a + b;
       double actualResult = Calculator.calculate(a,b, Calculator.Type.SUMMARY);
       assertEquals(expectedResult, actualResult, "Summary result is incorrect");
    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void calculationTypes(Calculator.Type type){
        double a = 25;
        double b = 6;
        double actualResult = Calculator.calculate(a,b, type);
        assertNotNull(actualResult);
        assertTrue(actualResult>0);
    }

    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(2,3,5,Calculator.Type.SUMMARY),
                Arguments.of(8,2,4,Calculator.Type.DIVISION),
                Arguments.of(2,3,6,Calculator.Type.MULTIPLICATION),
                Arguments.of(7,3,4,Calculator.Type.SUBTRACTION)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void methodSourceTest(double a, double b, double expectedResult, Calculator.Type type){
        double actualResult = Calculator.calculate(a,b, type);
        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({"2,2,4,MULTIPLICATION", "10,3,7,SUBTRACTION"})
    public void csvSourceTest(double a, double b, double expectedResult, Calculator.Type type){
        double actualResult = Calculator.calculate(a,b, type);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void summaryTest(){
        double a = 5;
        double b = 6;
        double expectedResult = 11;

        double actualResult = Calculator.calculate(a,b, Calculator.Type.SUMMARY);
        assertEquals(expectedResult, actualResult, "Summary result is incorrect");
    }

    @Test
    public void divisionTest(){
        double a = 10;
        double b = 2;
        double expectedResult = 5;

        double actualResult = Calculator.calculate(a,b, Calculator.Type.DIVISION);
        assertEquals(expectedResult, actualResult, "Division result is incorrect");
        assertTrue(expectedResult==actualResult);
        assertTrue(actualResult>0);
        assertFalse(actualResult==0);
        assertNotNull(actualResult);
    }

    @Test
    public void errorTest() {
        double a = 10;
        double b = 2;

        assertThrows(NullPointerException.class, () -> {
            Calculator.calculate(a, b, null);
        });
    }

}

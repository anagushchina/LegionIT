import EnumsExeptions.Calculator;
import Week.Week;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;



public class WeekTest {

    static Stream<Arguments> dataProvider(){
        return Stream.of(
                Arguments.of(-1298493752,"The number should be equal or larger than 1"),
                Arguments.of(0,"The number should be equal or larger than 1"),
                Arguments.of(1,"Sunday"),
                Arguments.of(4,"Wednesday"),
                Arguments.of(7,"Saturday"),
                Arguments.of(8,"The number should be equal or smaller than 7"),
                Arguments.of(885928375,"The number should be equal or smaller than 7")
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void dayValuesTest(int a, String expectedResult){
        String actualResult = Week.getDay(a);
        assertEquals(expectedResult, actualResult, "The result is incorrect");
    }

    @Test
    public void errorTest() {
        assertThrows(NullPointerException.class, () -> {
            Week.getDay(null);
        });
    }

}

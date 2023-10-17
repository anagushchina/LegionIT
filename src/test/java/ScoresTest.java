import Arrays.ScoresMain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ScoresTest {

    @ParameterizedTest
    @MethodSource ("validInitials")
    public void validInitialsTest(String initials, int[] expectedResult){
        ScoresMain scoresMain = new ScoresMain();
        int[] actualResult = scoresMain.calculateScores(initials);
        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    static Stream<Arguments> validInitials(){
        return Stream.of(
                Arguments.of("ABC",new int[] {1,1,1}),
                Arguments.of("AaBbCc",new int[] {2,2,2}),
                Arguments.of("abc",new int[] {1,1,1}),
                Arguments.of("A",new int[] {1,0,0}),
                Arguments.of("CCCCC",new int[] {0,0,5}),
                Arguments.of("BBCACCBB",new int[] {1,4,3})
        );
    }

    @ParameterizedTest
    @MethodSource ("invalidInitials")
    public void invalidInitialsTest(String initials){
        ScoresMain scoresMain = new ScoresMain();
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            scoresMain.calculateScores(initials);
        });
    }

    static Stream<String> invalidInitials(){
        return Stream.of("", "  ", null, "ABCD", "ei8hdf", "AB C");
    }

    @Test
    public void resultNotNullTest(){
        ScoresMain scoresMain = new ScoresMain();
        Assertions.assertNotNull(scoresMain.calculateScores("ABC"));
    }

}

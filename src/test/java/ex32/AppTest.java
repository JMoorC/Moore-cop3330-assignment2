package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void judgeGuess() {
        assertEquals(0, App.judgeGuess(-1,  5 ) );
        assertEquals(0, App.judgeGuess(6, 5) );
        assertEquals(0, App.judgeGuess(2, 5) );
        assertEquals(1, App.judgeGuess(5,5) );
    }
}
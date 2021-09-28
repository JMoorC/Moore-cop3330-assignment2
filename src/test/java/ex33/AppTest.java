package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void retrieveFortune() {
        assertEquals("Yes.", App.retrieveFortune(5) );
        assertEquals("No.", App.retrieveFortune(6) );
        assertEquals("Maybe.", App.retrieveFortune(7) );
        assertEquals("Try Again Later.", App.retrieveFortune(8) );
    }
}
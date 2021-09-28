package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getYears() {
        assertEquals(18, App.getYears(4) );
    }
}
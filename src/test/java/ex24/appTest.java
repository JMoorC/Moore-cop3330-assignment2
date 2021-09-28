package ex24;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @org.junit.jupiter.api.Test
    void isAnagram() {
        assertAll(() -> assertTrue( App.isAnagram("rope", "pore") ),
                () -> assertTrue( App.isAnagram("RoPe", "pORE") ),
                () -> assertFalse( App.isAnagram("gone", "pond") ),
                () -> assertTrue( App.isAnagram("", "") ),
                () -> assertFalse( App.isAnagram("no", "not") ) );
    }
}
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void checkStrength() {
        assertAll( () -> assertEquals(0, App.checkStrength("192") ),
                () -> assertEquals(1, App.checkStrength("llama") ),
                () -> assertEquals(2, App.checkStrength("llama2") ),
                () -> assertEquals(2, App.checkStrength("bibi@") ),
                () -> assertEquals(2, App.checkStrength("kingkongdingdong") ),
                () -> assertEquals(2, App.checkStrength("123456789") ),
                () -> assertEquals(2, App.checkStrength("@#$$@@##$$") ),
                () -> assertEquals(3, App.checkStrength("BigBadBat223") ),
                () -> assertEquals(4, App.checkStrength("B!g8&dB@") ) );
    }

    @Test
    void strengthRating() {
        assertAll(() -> assertEquals("very weak", App.strengthRating(0) ),
                () -> assertEquals("weak", App.strengthRating(1) ),
                () -> assertEquals("moderate", App.strengthRating(2) ),
                () -> assertEquals("strong", App.strengthRating(3) ),
                () -> assertEquals("very strong", App.strengthRating(4) ) );
    }
}
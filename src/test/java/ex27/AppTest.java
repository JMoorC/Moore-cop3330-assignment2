package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateFName() {
        assertEquals("", App.validateFName("James") );
    }

    @Test
    void validateLName() {
        assertEquals("", App.validateLName("Moore") );
    }

    @Test
    void validateID() {
        assertEquals("", App.validateID("jj-1312") );
    }

    @Test
    void validateZIP() {
        assertEquals("", App.validateZIP("32888") );
    }

    @Test
    void validateInput() {
        assertEquals("There were no errors found.\n", App.validateInput("james", "moore",
                "jj-1234", "32888") );
    }
}
package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generatePass() {
        String pass = App.generatePass(7, 2, 3);
        System.out.println(pass.length() );
        assertTrue (pass.length() >= 7);
    }

    @Test
    void getSpecial() {
        char cha = App.getSpecial();
        System.out.println(cha);
        assertTrue((!Character.isDigit(cha) ) && (!Character.isAlphabetic(cha) ) );
    }

    @Test
    void getNum() {
        assertTrue(Character.isDigit(App.getNum() ) );
    }

    @Test
    void getAlpha() {
        assertTrue(Character.isAlphabetic(App.getAlpha() ) );
    }
}
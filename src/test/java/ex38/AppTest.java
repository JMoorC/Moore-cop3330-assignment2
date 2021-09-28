package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(10);
        testList.add(7);
        testList.add(9);
        testList.add(14);
        testList = App.filterEvenNumbers(testList);
        assertEquals(2,testList.get(0) );
        assertEquals(4, testList.get(1) );
        assertEquals(10, testList.get(2) );
        assertEquals(14,testList.get(3) );
    }
}
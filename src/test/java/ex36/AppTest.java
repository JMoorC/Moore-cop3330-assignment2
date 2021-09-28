package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        assertEquals(400.0, App.average(list) );
    }

    @Test
    void minimum() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        assertEquals(100, App.minimum(list) );
    }

    @Test
    void maximum() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        assertEquals(1000, App.maximum(list) );
    }

    @Test
    void stdDev() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        assertEquals(353.55, Math.round(App.stdDev(list) * 100) / 100.0);
    }
}
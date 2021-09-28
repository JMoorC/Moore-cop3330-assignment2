package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calcTarget() {
        assertAll( () -> assertEquals(138, App.calcTarget(22, 65, 55) ),
            () -> assertEquals(171, App.calcTarget(22, 65, 80) ),
            () -> assertEquals(191, App.calcTarget(22, 65, 95) ) );
    }

    @Test
    void createChart() {
        assertEquals( "Resting heart rate: 65. Age: 22.\n" +
                "\n" +
                "Intensity    | Rate\n" +
                "_____________|________\n" +
                "55%          | 138 bpm\n" +
                "60%          | 145 bpm\n" +
                "65%          | 151 bpm\n" +
                "70%          | 158 bpm\n" +
                "75%          | 165 bpm\n" +
                "80%          | 171 bpm\n" +
                "85%          | 178 bpm\n" +
                "90%          | 185 bpm\n" +
                "95%          | 191 bpm\n", App.createChart(65, 22) );
    }
}
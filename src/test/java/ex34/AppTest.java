package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {



    @Test
    void printRoster() {
        String[] roster = new String[5];
        roster[0] = "Taylor Voreson";
        roster[1] = "Mike Harding";
        roster[2] = "La-a Edwards";
        roster[3] = "Carmen Rosa";
        roster[4] = "Bufford McKinley";
        assertEquals(
                "There are 5 employees:\n" +
                        "Taylor Voreson\n" +
                        "Mike Harding\n" +
                        "La-a Edwards\n" +
                        "Carmen Rosa\n" +
                        "Bufford McKinley\n\n", App.printRoster(roster) );
        roster = App.unPerson(roster, "Mike Harding");
        roster = App.unPerson(roster, "Carmen Rosa");
        assertEquals(
                "There are 3 employees:\n" +
                        "Taylor Voreson\n" +
                        "La-a Edwards\n" +
                        "Bufford McKinley\n\n", App.printRoster(roster) );
    }

    @Test
    void unPerson() {
        String[] roster = new String[5];
        roster[0] = "Taylor Voreson";
        roster[1] = "Mike Harding";
        roster[2] = "La-a Edwards";
        roster[3] = "Carmen Rosa";
        roster[4] = "Bufford McKinley";
        roster = App.unPerson(roster, "Mike Harding");
        roster = App.unPerson(roster, "Carmen Rosa");
        assertEquals("", roster[1] );
        assertEquals("", roster[3] );
    }
}
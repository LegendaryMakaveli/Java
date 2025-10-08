import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeoPoliticalZoneDriverTest {
    @Test
    public void testThatStateCanBeFound(){
        String stateToCheck = "Lagos";
        String expectedState = GeoPoliticalZoneDriver.checkForStateInZone(stateToCheck);
        String actual = "SOUTHWEST";

        assertEquals(actual, expectedState);
    }

    @Test
    public void testForAnUnknownState() {
        String stateToCheck = "Ibadan";
        String expectedState = GeoPoliticalZoneDriver.checkForStateInZone(stateToCheck);
        String actual = "unknow state";

        assertEquals(actual, expectedState);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCloseBracket {
    @Test
    public void testThatTheMethodAcceptStringOfBracket(){
        CloseBracket closeBracket = new CloseBracket();
        String brackets = "{}()[]";
        boolean result = closeBracket.checkForUncloseBracket(brackets);
        assertTrue(result);
    }

    @Test
    public void testThatTheMethodRejectStringOfUnclosedBracket() {
        CloseBracket closeBracket = new CloseBracket();
        String brackets = "[]({)";
        boolean result = closeBracket.checkForUncloseBracket(brackets);
        assertFalse(result);
    }

}
package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestStackStructure {
    @Test
    public void testStackStructure_isEmpty() {
        StackStructure makaStack = new StackStructure(3);
        assertTrue(makaStack.isEmpty());
    }

    @Test
    public void  addOneElementToStackAndItsNotEmpty() {
        StackStructure makaStack = new StackStructure(3);
        makaStack.pushElement(5);
        assertFalse(makaStack.isEmpty());
    }

    @Test
    public void addOneElementToStackAndRemoveIt(){
        StackStructure makaStack = new StackStructure(3);
        makaStack.pushElement(5);
        makaStack.popElement();
        assertTrue(makaStack.isEmpty());
    }

    @Test
    public void addTwoElementsToStackAnd(){
        StackStructure makaStack = new StackStructure(3);
        makaStack.pushElement(5);
        makaStack.pushElement(10);
        assertFalse(makaStack.isEmpty());
    }

    @Test
    public void removeTwoElementsFromStackAndis_Empty(){
        StackStructure makaStack = new StackStructure(3);
        makaStack.pushElement(5);
        makaStack.pushElement(10);
        assertFalse(makaStack.isEmpty());
        makaStack.popElement();
        makaStack.popElement();
        assertTrue(makaStack.isEmpty());
    }

    @Test
    public void addTwoElementsRemoveOneAndIsEmptyIsFalse(){
        StackStructure makaStack = new StackStructure(3);
        makaStack.pushElement(5);
        makaStack.pushElement(10);
        assertFalse(makaStack.isEmpty());
        makaStack.popElement();
        assertFalse(makaStack.isEmpty());
    }

}

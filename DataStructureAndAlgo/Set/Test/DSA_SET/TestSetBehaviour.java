package DSA_SET;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSetBehaviour {
    @Test
    public void TestThatSetIsEmptyOnCreation() {
        SetBehavior mySet = new SetBehavior();
        assertTrue(mySet.isEmpty());
    }

    @Test
     public void TestThatOneElementIsAddedAndItCantGetDuplicated() {
        SetBehavior mySet = new SetBehavior();
        mySet.addElement(5);
        mySet.addElement(5);
        assertEquals(1, mySet.size);

    }

    @Test
    public void TestThatAddManyElementsAtOnceInSetAndNoDuplicate() {
        SetBehavior mySet = new SetBehavior();
        mySet.addManyElements(new int[]{1,2,3,4});
        assertEquals(4, mySet.size);
    }

    @Test
    public void TestThatRemoveAllTheElementInASet(){
        SetBehavior mySet = new SetBehavior();
        mySet.addManyElements(new int[]{1,2,3,4});
        mySet.clearElement();
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void TestTheMethodThatSearchForAnElementInASet(){
        SetBehavior mySet = new SetBehavior();
        mySet.addManyElements(new int[]{1,2,3,4});
        assertTrue(mySet.searchElement(3));
        assertFalse(mySet.searchElement(5));
    }

    @Test
    public void TestThatSetContainsAllElements() {
        SetBehavior mySet = new SetBehavior();
        mySet.addManyElements(new int[]{1,2,3,4});

        assertTrue(mySet.searchAll(new int[]{1,2,3,4}));
        assertFalse(mySet.searchAll(new int[]{1,2,5}));
    }

    @Test
    public void TestThatRemoveElementByValue(){
        SetBehavior mySet = new SetBehavior();
        mySet.addManyElements(new int[]{1,2,3,4});
        mySet.removeElementByValue(3);
        assertFalse(mySet.searchElement(3));
        assertEquals(3, mySet.size);
    }

    @Test
    public void TestThatReturnTheSizeOfASet(){
        SetBehavior mySet = new SetBehavior();
        mySet.addManyElements(new int[]{1,2,3,4});
        assertEquals(4, mySet.size);
    }
}

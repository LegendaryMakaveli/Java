package DSA_LIST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestListBehaviour {

    @Test
    public void TestThatListIsEmptyOnCreation() {
        ListBehaviour list = new ListBehaviour();
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestThatListIsNotEmptyAfterAddingElement() {
        ListBehaviour list = new ListBehaviour();
        list.addElement("Come");
        assertFalse(list.isEmpty());
    }

    @Test
    public void TestThatListRemainsNotEmptyAfterAddingMultipleElements() {
        ListBehaviour list = new ListBehaviour();
        list.addElement("Come");
        list.addElement("Here");
        assertFalse(list.isEmpty());
    }

    @Test
    public void TestToAddTwoElementsRemoveOneAndListIsNotEmpty() {
        ListBehaviour list = new ListBehaviour();
        list.addElement("Come");
        list.addElement("Here");
        list.removeElement();
        assertFalse(list.isEmpty());
    }
    
    @Test
    public void TestToAddElementAtSpecificIndex() {
        ListBehaviour list = new ListBehaviour();
        list.addElementAtIndex(0, "John");

        assertEquals("John", list.getElementAtIndex(0));
    }

    @Test
    public void TestToAddElementAtSpecificIndexAndCheckForIndexChange() {
        ListBehaviour list = new ListBehaviour();
        list.addElement("Imagine");
        list.addElement("Dragon");
        list.addElementAtIndex(1, "Exist");

        assertEquals("Exist", list.getElementAtIndex(1));
        assertEquals("Dragon", list.getElementAtIndex(2));
        assertEquals("Imagine", list.getElementAtIndex(0));
    }

    @Test
    public void TestToRemoveElementAtSpecificIndexAndCheckForIndexChange() {
        ListBehaviour list = new ListBehaviour();
        list.addElement("Imagine");
        list.addElement("Dragon");
        list.removeElementAtIndex(0, "Imagine");

        assertEquals("Dragon", list.getElementAtIndex(0));
    }

    @Test
    public void TestToRemoveAllElementAndListIsEmpty() {
        ListBehaviour list = new ListBehaviour();
        list.addElement("Come");
        list.addElement("Come");
        list.addElement("Come");
        list.addElement("Come");
        list.removeAllElement();
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestSearchForElementInTheList(){
        ListBehaviour list = new ListBehaviour();
        list.addElement("Imagine");
        list.addElement("Dragon");
        list.addElement("Exist");
        assertTrue(list.searchElement("Exist"));
    }

    @Test
    public void TestCheckIfAllElementIsInTheList(){
        ListBehaviour list = new ListBehaviour();
        list.addElement("Imagine");
        list.addElement("Dragon");
        list.addElement("Now");
        assertTrue(list.searchAll(new String[]{"Imagine", "Dragon", "Now"}));
    }

    @Test
    public void TestThatReturnTheIndexOfFirstElementOccurrence(){
        ListBehaviour list = new ListBehaviour();
        list.addElement("Imagine");
        list.addElement("Dragon");
        list.addElement("Now");
        list.addElement("Bobo");
        assertEquals(0, list.indexOf("Imagine"));
    }

    @Test
    public void TestThatReturnTheSizeOfTheList(){
        ListBehaviour list = new ListBehaviour();
        list.addElement("Imagine");
        list.addElement("Dragon");
        list.addElement("Now");
        list.addElement("Bobo");
        assertEquals(4, list.getSize());
    }

    @Test
    public void TestThatSortElementsInTheList(){
        ListBehaviour list = new ListBehaviour();
        list.addElement("Imagine");
        list.addElement("Dragon");
        list.addElement("Now");
        list.addElement("Bobo");
        list.sortElements();
        assertEquals("Bobo", list.getElementAtIndex(0));
        assertEquals("Dragon", list.getElementAtIndex(1));
        assertEquals("Imagine", list.getElementAtIndex(2));
        assertEquals("Now", list.getElementAtIndex(3));
    }
    @Test
    public void TestThatTheListExpandsWhenCapacityIsReached() {
        ListBehaviour list = new ListBehaviour();
        for (int count = 0; count < 21; count++) {
            list.addElement("Element " + count);
        }
        assertEquals(21, list.getSize());
        assertEquals("Element 20", list.getElementAtIndex(20));
    }
    
    
}

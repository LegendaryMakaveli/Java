package DSA_SET;

public class SetBehavior {
    private boolean isEmpty = true;
    private int[] elements = new int[4];
    int size = 0;


    public boolean isEmpty() {
        return isEmpty;
    }


    public void addElement(int element) {
        for(int count = 0; count < size; count++) {
            if (elements[count] == element) {
                return;
            }
        }
            elements[size] = element;
            size++;
            isEmpty = false;
    }

    public void addManyElements(int[] newSet) {
      for(int element : newSet){
          addElement(element);
      }
    }

    public void clearElement() {
        elements = new int[4];
        size = 0;
        isEmpty = true;
    }

    public boolean searchElement(int element) {
        for(int count = 0; count < size; count++) {
            if (elements[count] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean searchAll(int[] newSet) {
        for(int element : newSet){
            if(!searchElement(element)){
                return false;
            }
        }
        return true;
    }

    public void removeElementByValue(int element) {
            for (int count = 0; count < size; count++) {
                if (elements[count] == element) {
                    for (int counter = count; counter < size - 1; counter++) {
                        elements[counter] = elements[counter + 1];
                    }
                    size--;
                    if (size == 0) isEmpty = true;
                    return;
                }
            }
    }
}
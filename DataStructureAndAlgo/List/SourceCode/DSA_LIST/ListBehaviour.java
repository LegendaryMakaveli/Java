package DSA_LIST;

public class ListBehaviour {
    private boolean isEmpty = true;
    private int countElements = 0;
    private String [] listBehaviour = new String[4];

    public boolean isEmpty() {
        return isEmpty;
    }

    public void addElement(String come) {
        adjustCapacity();
        listBehaviour[countElements] = come;
        countElements++;
        isEmpty = false;
    }

    public void removeElement() {
        listBehaviour[countElements -1] = null;
        countElements--;
        if (countElements == 0) {
            isEmpty = true;
        }
    }




    public void addElementAtIndex(int index, String John) {
        if(index < 0 || index > countElements) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        adjustCapacity();
        for(int count = countElements - 1; count >= index; count--) {
            listBehaviour[count + 1] = listBehaviour[count];
        }
        listBehaviour[index] = John;
        countElements++;
        isEmpty = false;
    }

    public String getElementAtIndex(int index) {
        if(index < 0 || index >= countElements) {
            throw new IndexOutOfBoundsException("Cannot get element at index: " + index);
        }
        return listBehaviour[index];
    }

    public void removeElementAtIndex(int index, String imagine) {
        if(index < 0 || index >= countElements) {
            throw new IndexOutOfBoundsException("Cannot remove element at index: " + index);
        }
        for(int count = index; count < countElements - 1; count++) {
            listBehaviour[count] = listBehaviour[count + 1];
        }
        listBehaviour[countElements - 1] = null;
        countElements--;
        if (countElements == 0) {
            isEmpty = true;
        }
    }

    public void removeAllElement() {
        for(int count = 0; count < countElements; count++) {
            listBehaviour[count] = null;
        }
        countElements = 0;
        isEmpty = true;
    }

    public boolean searchElement(String Exist) {
       for(String str : listBehaviour) {
           if(str != null && str.equals(Exist)) {
               return true;
           }
        }
        return false;
    }

    public boolean searchAll(String[] strings) {
        for(String str : strings) {
            if(!searchElement(str)) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(String imagine) {
        for(int count = 0; count < countElements; count++) {
            if(listBehaviour[count].equals(imagine) && listBehaviour[count] != null) {
                return count;
            }
        }
        return -1;
    }

    public int getSize() {
        return countElements;
    }

    public void sortElements() {
        for(int count = 0; count < countElements - 1; count++) {
            for(int counter = count + 1; counter < countElements; counter++) {
                if(listBehaviour[count].compareTo(listBehaviour[counter]) > 0) {
                    String temp = listBehaviour[count];
                    listBehaviour[count] = listBehaviour[counter];
                    listBehaviour[counter] = temp;
                }
            }
        }
    }

    private void adjustCapacity() {
        if (countElements >= listBehaviour.length) {
            String[] newList = new String[listBehaviour.length * 2];
            for (int count = 0; count < listBehaviour.length; count++) {
                newList[count] = listBehaviour[count];
            }
            listBehaviour = newList;
        }
    }

}

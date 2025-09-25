package DSA;

public class StackStructure {
    public int count = 0;
    public boolean isEmpty = true;

    public boolean isEmpty() {
        if(count > 0){
            isEmpty = false;
        } else {
            isEmpty = true;
        }
        return isEmpty;
    }

    public void pushElement(int newElemeent) {
        count++;
    }

    public void popElement() {
        count--;
    }
}

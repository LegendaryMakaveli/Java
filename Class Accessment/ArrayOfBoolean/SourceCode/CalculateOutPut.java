public class CalculateOutPut {

    public int [] sumOfTwo(int [] array){
        int EXPECTED = 8;
        int [] newArray = new int[2];
        for(int count = 0; count < array.length; count++){
            for(int counter = 0; counter < array.length-1; counter++){
                if (array[count] + array[counter] == EXPECTED) {
                    newArray[count] = array[count];
                    break;
                }
            }
        }
        return newArray;
    }
}

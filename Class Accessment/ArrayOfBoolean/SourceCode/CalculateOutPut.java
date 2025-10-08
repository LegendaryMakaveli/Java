public class calculateOutPut{

    public int [] sumOfTwo(int [] array){
        int EXPECTED = 8;
        int [] newArray = new int[array.length];
        for(int count = 0; count < array.length; count++){
            if(array[count] + array[count+1] == EXPECTED){
                newArray[count] = array[count];
            }
        }
        return newArray;
    }
}

import java.util.Arrays;
public class MultiArray {

public static void main(String... makaveli) {
int [] [] values = {
{100,10},
{20,90},
{80,11}
};
int largest = values[1][0];
int smallest = values[0][0];
for (int row = 0; row < values.length; row++) {
for (int column = 0; column < values[row].length; column++) {
int correctValue = values[row][column];
if (correctValue > largest) largest = correctValue;
if (correctValue < smallest) smallest = correctValue;
}
}
System.out.println("The largest is: " + largest);
System.out.println("The smallest: " + smallest);
}


}
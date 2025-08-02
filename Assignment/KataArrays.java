public class KataArrays {


public static int maximumInArrays(int [] numbers) {
int largest = numbers[0];
for (int rows : numbers) {
if (rows > largest) largest = rows;
}
return largest;
}


public static int minimumInArrays(int [] numbers) {
int smallest = numbers[0];
for (int rows : numbers) {
if (rows < smallest) smallest = rows;
}
return smallest;
}


public static int sumOfArray(int [] numbers) {
int total = 0;
 for (int rows : numbers) {
total+= rows;
}
return total;
}


public static int sumOfEvenNumbersInArray(int [] evenNumbers)  {
int total = 0;
int number = 0;
for (int rows : evenNumbers) {
if (rows % 2 == 0) {
number = rows;

total+= number;
}
}
return total;
}


public static int sumOfOddNumbersInArray(int [] oddNumbers) {
int total = 0;
int number = 0;
for (int rows : oddNumbers) {
if (rows % 2 == 1) {
number = rows;
total+= number;
}
}
return total;
}


public static int [] maximumAndMinimumOfArray(int [] numbers) {
int largest = numbers[0];
int smallest = numbers[1];
for (int rows : numbers) {
if (rows > largest) largest = rows;
if (rows < smallest) smallest = rows;
}
return new int [] {largest, smallest};
}


public static int numberOfOddNumbersInArray(int [] numbers) {
int number = 0;
for (int rows : numbers) {
 if(rows % 2 != 0) {
number++;
}
}
return number;
}


public static int numberOfEvenNumbersInArray(int [] numbers) {
int number = 0;
for (int rows : numbers) {
if (rows % 2 == 0) {
number++;
}
}
return number;
}


public static int [] evenNumberInArray(int [] numbers) {
int count = 0;
for (int rows : numbers) {
if (rows % 2 == 0) {
count++;
}
}
int counter = 0;
int  []newArray = new int [count];
for (int rows : numbers) {
if (rows % 2 == 0) {
newArray[counter++] = rows;
}
}
return newArray;
}


public static int [] oddNumberInArray(int [] numbers) {
int count = 0;
for (int rows : numbers) {
if (rows % 2 == 1) {
count++;
}
}
int counter = 0;
int [] newArray = new int [count];
for (int rows : numbers) {
if (rows % 2 == 1) {
newArray[counter++] = rows;
} 
}
return newArray;
}


public static int [] squareNumbersInArray(int [] numbers) {
int [] newArray = new int [numbers.length];
for (int rows = 0; rows < numbers.length; rows++) {
newArray[rows] = numbers[rows] * numbers[rows];
}
return newArray;
}
}






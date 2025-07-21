public class Patterns {

public static void main(String[] args) {

int row = 1;

while (row < 10 ) {

int column =1; 

while (column <= row ) {
System.out.print("*");
column++;
}
System.out.println(" ");
row++;
}

}
}
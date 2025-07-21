public class MultipleEven {

public static void main(String[] args) {


int total = 1;
for (int i = 1; i <= 10; i++) {
i += 1;

total *= i;
}
System.out.print("The product is:  " + total);
}
}
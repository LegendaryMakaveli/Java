public class TaskSeven {

public static void main(String... makaveli) {
int multiply = 1;
int sum = 0;
for (int count = 4; count < 8; count+=4) {	
	for (int counter = 1; counter <= 5; counter ++) {
		multiply *=count;
		sum+=multiply;
		}
			System.out.print(sum + " " );
}
for (int space = 1; space < 2; space ++) {
		System.out.print(" ");
		}
int total = 1;
int sumNumber = 0;
for (int index = 8; index < 16; index+= 8) {
	for (int counter = 1; counter <=5; counter ++) {
		total *=index;
		sumNumber +=total;
			}
	System.out.print( sumNumber + " ");
		}
}
}

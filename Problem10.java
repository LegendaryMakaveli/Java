import java.util.Scanner;

public class Problem10 {

public static void main(String[] args) {

Scanner problem = new Scanner(System.in);

System.out.print("Enter the number of minute: ");
int minute = problem.nextInt();

int calculate = minute / 525_600;
int days = (minute - calculate * 525_600) / 1440; // 60 * 24 which make a day that's 1440

System.out.print("Minute is approximately: " + calculate + "years" + " " + "Day(s) is: " + days);
}
}
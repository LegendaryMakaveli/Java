import java.util.Scanner;

public class NokiaVersion3 {

public static void main(String... args) {

Scanner input = new Scanner(System.in);
boolean makaveli = true;
while (makaveli) {

String promptIkka = """                   

                                                 WELCOME                 TO
                                               
                          

                                                  NOKIA                   3310
                              """;

System.out.println(promptIkka);

String prompt = """

      
        LISTS OF MENU FUNCTION:

1 ->   Phone book
2 ->   Messages
3 ->   Chat
4 ->   Call register
5 ->   Tones
6 ->   Settings
7 ->   Call divert
8 ->   Games
9 ->   Calculator
10 ->  Reminders
11 ->  Clock
12 ->  Profile
13 ->  Sim services
0 -> Exit	


                             """;
System.out.println(prompt);

System.out.println("Press any key for action:  ");

int mainInput = input.nextInt();
switch (mainInput) {
	
		case 1: NokiaMethod.GoToPhoneBook(mainInput); break;
		case 2: NokiaMethod.GoToMessages(mainInput); break;
		case 3: NokiaMethod.GoToChat(mainInput); break;
		case 4: NokiaMethod.GoToCallRegister(mainInput); break;
		case 5: NokiaMethod.GoToTones(mainInput); break;
		case 6: NokiaMethod.GoToSettings(mainInput); break;
		case 7: NokiaMethod.GoToCallDivert(mainInput); break;
		case 8: NokiaMethod.GoToGames(mainInput); break;
		case 9: NokiaMethod.GoToCalculator(mainInput); break;
		case 10: NokiaMethod.GoToReminder(mainInput); break;
		case 11: NokiaMethod.GoToClock(mainInput); break;
		case 12: NokiaMethod.GoToProfile(mainInput); break;
		case 13: NokiaMethod.GoToSimServices(mainInput); break;
		case 0: makaveli = false; {
		System.out.println("Thanks for choosing Nokia !!!");
} break;
  default: System.out.println("Oga use your eye well nah !!!");

}
}
}

}
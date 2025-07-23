import java.util.Scanner;

public class NokiaMethod {

		// FUNCTION FOR MAINMENU

public static void mainMenu () {

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
                             """;
System.out.println(prompt);
}

		// FUNCTION FOR PHONEBOOK

public static int  GoToPhoneBook(int userInput) {
Scanner input = new Scanner(System.in);    
switch(userInput) {
                  case 1: 
		boolean phoneBookSubMenu = true;
		while (phoneBookSubMenu) {
		System.out.println("""

					PHONE BOOK

					1 -> Search
					2 -> Service Nos
					3 -> Add name
					4 -> Erase
					5 -> Edit
					6 -> Assignment
					7 -> Send b'card
					8 -> Option
					9 -> Speed dial
					10 -> Voice tags
					11 -> Go back
                                   """);
                              System.out.println("Enter a phonebook option:");
                               int phonebookOption = input.nextInt();
        switch(phonebookOption) {
		case 1: System.out.println("1.Search"); break;
		case 2: System.out.println("2.Service Nos"); break;
		case 3: System.out.println("3.Add name"); break;
		case 4: System.out.println("4.Erase"); break;
		case 5: System.out.println("5.Edit"); break;
		case 6: System.out.println("6.Assignment"); break;
		case 7: System.out.println("7.Send b'card"); break;
		case 8: System.out.println("8.Option"); break;
		case 9 : System.out.println("Speed dial"); break;
		case 10: System.out.print("Voice tags"); break;
		case 11: {
		if (phonebookOption == 11) {
		    mainMenu ();
	            phoneBookSubMenu = false;
}
} break;
  default: System.out.println("Invalid input bruh !!!");
}
}
}
 return userInput;
}

		//FUNCTION FOR MESSAGES

public static int GoToMessages( int userInputForMessageOption) {
Scanner input = new Scanner(System.in);
switch (userInputForMessageOption) {
		case 2:
		boolean messageSubMenu = true;
		while (messageSubMenu) {
		System.out.println("""

					MESSAGES				

					1 -> Write messages
					2 -> Inbox
					3 -> Outbox
					4 -> Picture messsages
					5 -> Template
					6 -> Smileys
					7 -> Message setting
					8 -> Info service
					9 -> Voice mailbox number
					10 -> Service command editor
					11 -> Go back
			""");
System.out.println("Press any key for messages options");
int optionsForMessages = input.nextInt();
switch (optionsForMessages) {
			case 1: System.out.println("Write messages"); break;
			case 2: System.out.println("Inbox"); break;
			case 3: System.out.println("Outbox"); break;
			case 4: System.out.println("Picture messages"); break;
			case 5: System.out.println("Template"); break;
			case 6: System.out.println("Smileys"); break;
			case 7: System.out.println("Message setting"); break;
			case 8: System.out.println("Info service"); break;
			case 9: System.out.println("Voice mailbox number"); break;
			case 10: System.out.println("Service command editor"); break;
			case 11: {
		if (optionsForMessages == 11) {
		mainMenu ();
	messageSubMenu = false;
}
} break;
	default: System.out.println("Invalid input bruh !!!");
}
}
}
	return userInputForMessageOption;
}

		//FUNCTION FOR CHAT

public static int GoToChat (int chatInput) {
Scanner input = new Scanner(System.in);
switch (chatInput) {
		case 3:
		boolean chatOptionMenu = true;
		while (chatOptionMenu) {
		System.out.println("""

					CHAT
					
					0 -> Go back
		""");
System.out.println("Press 0 to go back");
int inputChat = input.nextInt();
switch (inputChat) {
		case 0: {
	if (inputChat == 0) {
		mainMenu ();
	chatOptionMenu = false;
}
} break;
	default:System.out.print("Invalid input bruh !!!");
}
}
}
	return chatInput;
}

		
		// FUNCTION FOR CALL REGISTER


public static int GoToCallRegister (int userInputForRegister) {
Scanner input = new Scanner(System.in);
switch (userInputForRegister) {
		case 4:
		boolean usersCallRegister = true;
		while (usersCallRegister) {
		System.out.println("""

					CALL REGISTER

					1 -> Missed calls
					2 -> Received calls
					3 -> Dialled numbers
					4 -> Erase recent call list
					5 -> Show call duration
					6 -> Show call costs
					7 -> Call cost settings
					8 -> Prepaid credit
					9 -> Go back
			""");
System.out.println("Press any key for options");
int callRegister = input.nextInt();
switch (callRegister) {
			case 1: System.out.println("Missed calls"); break;
			case 2: System.out.println("Recieved calls"); break;
			case 3: System.out.println("Dialled numbers"); break;
			case 4: System.out.println("Erase recent call list"); break;
			case 5: System.out.println("Show call duration"); break;
			case 6: System.out.println("Show all costs"); break;
			case 7: System.out.println("Call cost settings"); break;
			case 8: System.out.println("Prepaid credit"); break;
			case 9: {
	if (callRegister == 9) {
		mainMenu();
		usersCallRegister = false;
}
} break;
  default: System.out.println("Invalid input bruh !!!");	
}
}
}
	return userInputForRegister;
}


		//FUNCTION FOR TONES


public static int GoToTones (int tonesInput) {
Scanner input = new Scanner(System.in);
switch (tonesInput) {
		case 5:
		boolean toneInput = true;
		while (toneInput) {
		System.out.println("""
					
					TONES

					1 -> Ringing tone
					2 -> Ringing volume
					3 -> Incoming call alert
					4 -> Composer
					5 -> Message alert time
					6 -> Keypad tones
					7 -> Warning and game tones
					8 -> Vibrating alert
					9 -> Screen saver
					10 -> Go back
			""");
System.out.println("Press any key for option");
int inputTone = input.nextInt();
switch (inputTone) {
			case 1: System.out.println("Ringing tone"); break;
			case 2: System.out.println("Ringing volume"); break;
			case 3: System.out.println("Incoming call alert"); break;
			case 4: System.out.println("Composer"); break;
			case 5: System.out.println("Message alert time"); break;
			case 6: System.out.println("Keypad tones"); break;
			case 7: System.out.println("Warning and game tones"); break;
			case 8: System.out.println("Vibrating alert"); break;
			case 9: System.out.println("Screen saver"); break;
			case 10: {
		if (inputTone == 10) {
		mainMenu();
		toneInput = false;
}
}
  default: System.out.println("Invalid input bruh !!!");
}
}
}
   return tonesInput;
}


		// FUNCTION FOR SETTINGS


public static int GoToSettings (int mobileSettings) {
Scanner input = new Scanner(System.in);
switch (mobileSettings) {
			case 6 :
			boolean settings = true;
			while (settings) {
			System.out.println("""

					SETTINGS

					1 -> Call settings
					2 -> Phone settings
					3 -> Security settings
					4 -> Restore factory settings
					5 -> Go back
			""");
System.out.println("Press any key for option: ");
int settingsInputs = input.nextInt();
switch (settingsInputs) {
			case 1: System.out.println("Call settings"); break;
			case 2: System.out.println("Phone settings"); break;
			case 3: System.out.println("Security settings"); break;
			case 4: System.out.println("Restore factory  settings"); break;
			case 5: {
		if (settingsInputs == 5) {
			mainMenu ();
		settings = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return mobileSettings;
}

public static int GoToCallDivert (int callDiverts) {
Scanner input = new Scanner(System.in);
switch (callDiverts) {
			case 7:
			boolean callDivert = true;
			while (callDivert) {
			System.out.println("""

					CALL DIVERT
					
					0 ->  Go back
			""");
System.out.println("Press 0 to go back");
int divert = input.nextInt();
switch (divert) {
			case 0: {
		if (divert == 0) {
			mainMenu();
		callDivert = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return callDiverts;
}


		// FUNCTION FOR GAMES

public static int GoToGames (int game) {
Scanner input = new Scanner(System.in);
switch (game) {
			case 8:
			boolean phoneGame = true;
			while (phoneGame) {
			System.out.println("""

					CALL DIVERT
					
					0 ->  Go back
			""");
System.out.println("Press 0 to go back");
int gaming = input.nextInt();
switch (gaming) {
			case 0: {
		if (gaming == 0) {
			mainMenu();
		phoneGame = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return game;
}


		// FUNCTION FOR CALCULATOR

public static int GoToCalculator (int calculators) {
Scanner input = new Scanner(System.in);
switch (calculators) {
			case 9:
			boolean phoneCalculator = true;
			while (phoneCalculator) {
			System.out.println("""

					CALCULATOR
					
					0 ->  Go back
			""");
System.out.println("Press 0 to go back");
int calculating = input.nextInt();
switch (calculating) {
			case 0: {
		if (calculating == 0) {
			mainMenu();
		phoneCalculator = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return calculators;
}


		// FUNCTION FOR REMINDER

public static int GoToReminder (int reminders) {
Scanner input = new Scanner(System.in);
switch (reminders) {
			case 10:
			boolean phoneReminder = true;
			while (phoneReminder) {
			System.out.println("""

					REMINDER
					
					0 ->  Go back
			""");
System.out.println("Press 0 to go back");
int reminding = input.nextInt();
switch (reminding) {
			case 0: {
		if (reminding == 0) {
			mainMenu();
		phoneReminder = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return  reminders;
}


		// FUNCTION FOR CLOCK

public static int GoToClock (int clocks) {
Scanner input = new Scanner(System.in);
switch (clocks) {
			case 11:
			boolean phoneClock = true;
			while (phoneClock) {
			System.out.println("""
					1 -> Alarm clock
					2 -> Clock settings
					3 -> Date settings
					4 -> Stopwatch
					5 -> Countdown timer
					6 -> Auto update of date and time 
					7 -> Go back
			""");
System.out.println("Press any key for option: ");
int clocking = input.nextInt();
switch (clocking) {
			case 1: System.out.println("Alarm clock"); break;
			case 2: System.out.println("Clock settings"); break;
			case 3: System.out.println("Date settings"); break;
			case 4: System.out.println("Stopwatch"); break;
			case 5: System.out.println("Countdown timer"); break;
			case 6: System.out.println("Auto update of date and time"); break;
			case 7: {
		if (clocking == 7) {
			mainMenu();
		phoneClock = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return clocks;
}

		// FUNCTION FOR PROFILE

public static int GoToProfile (int profiles) {
Scanner input = new Scanner(System.in);
switch (profiles) {
			case 12:
			boolean userProfile = true;
			while (userProfile) {
			System.out.println("""

					PROFILE
					
					0 ->  Go back
			""");
System.out.println("Press 0 to go back");
int profiling = input.nextInt();
switch (profiling) {
			case 0: {
		if (profiling == 0) {
			mainMenu();
		userProfile = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return  profiles;
}


		//FUNCTION FOR SIM SERVICES

public static int GoToSimServices (int service) {
Scanner input = new Scanner(System.in);
switch (service) {
			case 13:
			boolean userSimServices = true;
			while (userSimServices) {
			System.out.println("""

					SIM SERVICES
					
					0 ->  Go back
			""");
System.out.println("Press 0 to go back");
int servicing = input.nextInt();
switch (servicing) {
			case 0: {
		if (servicing == 0) {
			mainMenu();
		userSimServices = false;
}
} break;
   default: System.out.println("Invalid input bruh !!!");
}
}
}
	return  service;
}
























}
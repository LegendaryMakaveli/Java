import java.util.Scanner;

public class NokiaMenuFunctionsModified {

public static void main(String... args) {

boolean mainMenu = true;
while (mainMenu) {
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

Scanner input = new Scanner(System.in);

System.out.println("Choose an option");
int userInput = input.nextInt();

switch (userInput) {
	case 1: System.out.println("Phone book");{
	boolean subMenuOne = true;
	while (subMenuOne) {
        System.out.println( """

		1 -> Search
		2 -> Service Nos
		3 -> Add name
		4 -> Erase
		5 -> Edit
		6 -> Assign tone
		7 -> Send b'card
		8 -> Options *
		9 -> Speed dials
		10 -> Voice tags
		11 -> Go back
""");                                   
System.out.print("Press any key for more options");
  int eightInput = input.nextInt();
switch(eightInput) {
		case 1: System.out.println("Search"); {
           boolean sea =true;
	while (sea) {
	String promptsea = """
			0 -> Go back
			""";
System.out.println(promptsea);
System.out.println("Press 0 to go back");
int Zero = input.nextInt();
switch (Zero) {
		case 0: sea = false; break;
 default: System.out.println("Invalid input bruh !!!");
}
}
}break;
		case 2: System.out.println("Search Nos"); {
			boolean nos =true;
			while (nos) {
		  String nos2 = """
				0 -> Go back
				""";
System.out.println(nos2);
System.out.println("Press 0 to go back");
int nos3 = input.nextInt();
switch (nos3) {
		case 0: nos = false; break;
default: System.out.println("Invalid input bruh !!!");
}
}
}break;
		case 3: System.out.println("Add name"); {
				boolean name = true;
				while (name) {
			System.out.println("""
					0 -> Go back
					""");
System.out.println("Press 0 to go back");
int naming = input.nextInt();
switch (naming) {
		case 0: name = false; break;
	default: System.out.println("Invalid input bruh !!!");
}
}
}break;
		case 4: System.out.println("Erase"); {
			boolean erase = true;
			while (erase) {
			System.out.println("""
				0 -> Go back
					""");
System.out.println("Press 0 to go back");
int erasing = input.nextInt();
switch (erasing) {
		case 0: erase = false; break;
default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 5: System.out.println("Edit"); {
			boolean edit = true;
			while (edit) {
		System.out.println("""
                               0 -> Go back
                                    """);
System.out.println("Press 0 to go back");
int editing = input.nextInt();
switch (editing) {
			case 0: edit = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}

} break;
		case 6: System.out.println("Assign tone"); {
			boolean tone = true;
		while (tone) {
		System.out.println("""
					0 -> Go back
					""");
System.out.println("Press 0 to go back");
int toning = input.nextInt();
switch (toning) {
		case 0: tone = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
}break;
		case 8: System.out.println("Options"); break;
		case 7: System.out.println("Send b'card");{
			boolean card = true;
			while (card) {
			System.out.println("""
					0 -> Go back
				""");
System.out.println("Press 0 to go back");
int carding = input.nextInt();
switch (carding) {
		case 0: card =false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
}  break;
		case 9: System.out.println("Speed dials"); {
				boolean dials = true;
				while (dials) {
			System.out.println("""
						0 -> Go back
 						""");
  System.out.println("Press 0 to go back");
 int dialing = input.nextInt();
switch (dialing) {
			case 0: dials = false; break;
default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 10: System.out.println("Voice tags"); {
			boolean tags = true;
			while (tags) {
			System.out.println("""
					0 -> Go back
				""");
System.out.println("Press 0 to go back");
int taging = input.nextInt();
switch (taging) {
		case 0: tags =  false; break;
default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 11: subMenuOne = false; break;
  default: System.out.println("Invalid input bruh");
}
switch (eightInput) {
			case 8: 
			boolean innerMenuOne = true;
			while (innerMenuOne) {
			 String eight = """
						1 -> Type of view
						2 -> Memory status
						3 -> Go back
						""";
	System.out.println(eight);
 eightInput = input.nextInt();
switch (eightInput) {
		case 1: System.out.println("Type of view"); {
			boolean view = true;
			while (true) {
		System.out.println("""
			0 -> Go back
				""");
System.out.println("Press 0 to go back");
int viewing = input.nextInt();
switch (viewing) {
			case 0: view = false; break;
   default: System.out.println("Invalid input bruh");
} break;
}
} 

		case 2: System.out.println("Memory status"); {
			boolean status = true;
			while (status) {
                      System.out.println("""
					0 -> Go back
				""");
System.out.println("Press 0 to go back");
int statuses = input.nextInt();
switch (statuses) {
			case 0: status = false; break;
   default: System.out.println("Invalid input bruh");
}
}
} break;
		case 3: innerMenuOne = false; break;
 default: System.out.println("Invalid input");
}
}
}
}
} break;
	case 2: System.out.print("Messages"); {
	boolean subMenuTwo = true;
	while (subMenuTwo) {
	System.out.println( """

		1 -> Write messages
		2 -> Inbox
		3 -> Outbox
		4 -> Picture messages
		5 -> Templates
		6 -> Smileys
		7 -> Message setting *
		8 -> Info service
		9 -> Voice mailbox number
		10 -> Service command editor
		11 -> Go back
""");
System.out.println("Press keys for options");
int sevenInput = input.nextInt();
switch (sevenInput) {
		case 1: System.out.println("Write messages"); 
		boolean message = true;
		while (message) {
		System.out.println("""
			0 -> Go back
""");
System.out.println("Press 0 to go back");
int messages = input.nextInt();
switch (messages) {
		case 0: message = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
break;
		case 2: System.out.println("Inbox"); {
		boolean inbox = true;
		while (inbox) {
		System.out.println("""
    				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int inboxes = input.nextInt();
switch (inboxes) {
		case 0:  inbox = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}

}break;
		case 3: System.out.println("Outbox"); {
		boolean outbox = true;
		while (outbox) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int outboxes = input.nextInt();
switch (outboxes) {
		case 0: outbox = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}

} break;
                case 4: System.out.println("Picture messages"); {
		boolean picture = true;
		while (picture) {
		System.out.println("""
				0 -> Go back
	       """);
System.out.println("Press 0 to go back ");
int pictures = input.nextInt();
switch (pictures) {
		case 0: picture = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
}break;
		case 5: System.out.println("Template"); {
		boolean tempt = true;
		while (tempt) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int templates = input.nextInt();
switch (templates) {
		case 0: tempt = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
}break;
		case 6: System.out.println("Smiley"); {
		boolean smile = true;
		while (smile) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int smileys = input.nextInt();
switch (smileys) {
		case 0: smile = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
}break;
		case 7: System.out.println("Message setting"); break;
		case 8: System.out.println("Info service"); {
		boolean info = true;
		while (info) {
		System.out.println("""
				0 -> Go back
		""");

}
}break;
		case 9: System.out.println("Voice mailbox number"); {
		boolean mailBox = true;
		while (mailBox) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int mailBoxes = input.nextInt();
switch (mailBoxes) {
		case 0: mailBox = false; break;
  default: System.out.print("Invalid input bruh !!!");
}
}
} break;
		case 10: System.out.println("Service command editor"); {
		boolean command = true;
		while (command) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int commando = input.nextInt();
switch (commando) {
		case 0: command = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 11: subMenuTwo = false; break;
  default: System.out.println("Invalid input bruh!!!"); 
}
 switch (sevenInput) {
		case 7:
			boolean innerMenuTwo = true;
			while (innerMenuTwo) {
			 String seven = """
						1 -> Set 1
						2 -> Common
						4 -> Go back
						""";
System.out.println(seven);
System.out.println("press 1 or two for option and 4 to go back");
int menuMenu = input.nextInt();
switch (menuMenu) {
			case 4: innerMenuTwo = false; break;
   //default: System.out.println("Invalid input bruh !!!");
}

System.out.println("Press any key for options");
   //menuMenu = input.nextInt();
 switch (menuMenu) {
		case 1: String oneOption = """
							1 -> Message centre number
							2 -> Messages sent as
							3 -> Message validity
							4 -> Go back
							""";
  System.out.print(oneOption);
int centre = input.nextInt();
switch (centre) {
			case 1: System.out.println("Message centre number"); {
			boolean centerNumber = true;
			while (centerNumber) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int centeredNumber = input.nextInt();
switch (centeredNumber) {
			case 0: centerNumber = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 2: System.out.println("Messages sent as"); {
			boolean sentAs = true;
			while (sentAs) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int sentAss = input.nextInt();
switch (sentAss) {
		case 0: sentAs = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 3: System.out.println("Message validity"); {
			boolean validityMess = true;
			while (validityMess) {
			System.out.println("""
					0 -> Go back
			""");
 System.out.println("Press 0 to go back");
 int validityMessage = input.nextInt();
 switch (validityMessage) {
			case 0: validityMess = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			//case 4: innerMenuTwo = false; break;
default: System.out.println("Invalid input bruh");
}
//break;
		case 2: String common = """
							1 -> Delivery reports
							2 -> Reply via same centre
							3 -> Character support
							4 -> Go back
							""";
 System.out.print(common);
int reports = input.nextInt();
switch (reports) {
			case 1: System.out.println("Delivery reports"); {
			boolean deliveryReports = true;
			while (deliveryReports) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int deliverRepo = input.nextInt();
switch (deliverRepo) {
			case 0: deliveryReports = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 2: System.out.println("Reply via same centre"); {
			boolean sameCentre = true;
			while (sameCentre) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int sameCen = input.nextInt();
switch (sameCen) {
		case 0: sameCentre = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 3: System.out.println("Character support"); {
			boolean characterSupport = true;
			while (characterSupport) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int supportCharac = input.nextInt();
switch (supportCharac) {
			case 0: characterSupport = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 4: innerMenuTwo = false; break;
default: System.out.println("Invalid input bruh!!!");
}
}
}
}
}
} break;
	case 3: System.out.print("Chat"); {
	boolean chatMan = true;
	while (chatMan) {
	System.out.println("""
			0 -> Go back
	""");
System.out.println("Press 0 to go back");
int chatWoman = input.nextInt();
switch (chatWoman) {
		case 0: chatMan = false; break;
  default: System.out.println("Invalid input bruh !!!");
}
}
} break;
	case 4: System.out.print("Call register");{                                              
	boolean calReg = true;
	while (calReg) {
  System.out.println("""


		1 -> Missed calls
		2 -> Received calls
		3 -> Dailled numbers
		4 -> Erase recent call list
		5 -> Show call duration *
		6 -> Show call costs *
		7 -> Call cost settings *
		8 -> Prepaid credit
		9 -> Go back
""");
System.out.println("Press 5, 6,  or 7 for option");
int missed = input.nextInt();
switch (missed) {
			case 1: System.out.println("Missed calls"); {
			boolean missedCall = true;
			while (missedCall) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int callMissed = input.nextInt();
switch (callMissed) {
			case 0: missedCall = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 2: System.out.println("Recieved calls"); {
			boolean receivedCall = true;
			while (receivedCall) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int callRecieved = input.nextInt();
switch (callRecieved) {
			case 0: receivedCall = false; break;
   default: System.out.println("Invalid input bruh");
}
}
} break;
			case 3: System.out.println("Dailled calls"); {
			boolean dialledCalls = true;
			while (dialledCalls) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int callDialled = input.nextInt();
switch (callDialled) {
			case 0: dialledCalls = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 4: System.out.println("Erase recent call list"); {
			boolean eraseRecent = true;
			while (eraseRecent) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int recentErase = input.nextInt();
switch (recentErase) {
			case 0: eraseRecent = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 8: System.out.println("Prepaid credit"); {
			boolean preCredit = true;
			while (preCredit) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int creditPre = input.nextInt();
switch (creditPre) {
			case 0: preCredit = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 9 : calReg = false; break;
}
switch (missed) {
		case 5: 
		boolean calDuration = true;
		while (calDuration) {
		String callDuration = """
							1 -> Last call duration
							2 -> All call's duration
							3 -> Recieved call's duration
							4 -> Dailled call's duration
							5 -> Clear timers
							6 -> Go back
 								""";
System.out.println(callDuration);
int recieved = input.nextInt();
switch (recieved) {
			case 1: System.out.println("Last call duration"); {
			boolean lastCall = true;
			while (lastCall) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int callLast = input.nextInt();
switch (callLast) {
			case 0: lastCall = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 2: System.out.println("All call's duration"); {
			boolean allCalls = true;
			while (allCalls) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int callAll = input.nextInt();
switch (callAll) {
			case 0: allCalls = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 3: System.out.println("Recieved call's duration"); {
			boolean callDurations = true;
			while (callDurations) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int durationCall = input.nextInt();
switch (durationCall) {
			case 0: callDurations = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}	
} break;
			case 4: System.out.println("Dailled call's duration"); {
			boolean innerCall = true;
			while (innerCall) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int callInner = input.nextInt();
switch (callInner) {
			case 0: innerCall = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 5: System.out.println("Clear timers"); {
			boolean timerClear = true;
			while (timerClear) {
			System.out.println("""
					0 -> Go back
			""");
System.out.println("Press 0 to go back");
int clearTimmer = input.nextInt();
switch (clearTimmer) {
			case 0: timerClear = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 6: calDuration = false; break;
}
}
break;
 		case 6: 
		boolean calCost = true;
		while (calCost) {
		String callCost = """
							1 -> Last call cost
							2 -> All call's cost
							3 -> Clear counters
							4 -> Go back
							""";
System.out.println(callCost);
	int lastCall = input.nextInt();
	switch (lastCall) {
		case 1: System.out.println("Last call cost"); {
		boolean lastCost = true;
		while (lastCost) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int costLast = input.nextInt();
switch (costLast) {
			case 0: lastCost = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 2: System.out.println("All call's cost"); {
		boolean costCost = true;
		while (costCost) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int notCost = input.nextInt();
switch (notCost) {
			case 0: costCost =false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 3: System.out.println("Clear counters"); {
		boolean counterIt = true;
		while (counterIt) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int countCounters = input.nextInt();
switch (countCounters) {
			case 0: counterIt = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 4: calCost = false; break;
}
}
break;
		case 7:
		boolean costSet = true;
		while (costSet) {
		 String costSettings = """
							1 -> Call cost limit
							2 -> Show costs in
							3 -> Go back
							""";
System.out.println(costSettings);
int showCost = input.nextInt();
switch (showCost) {
		case 1: System.out.println("Call cost limit"); {
		boolean notLimit = true;
		while (notLimit) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int limitNot = input.nextInt();
switch (limitNot) {
			case 0: notLimit = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 2: System.out.println("Show costs in"); {
		boolean inCost = true;
		while (inCost) {
		System.out.println("""
				0 -> Go back
		""");
System.out.println("Press 0 to go back");
int outterCost = input.nextInt();
switch (outterCost) {
			case 0: inCost = false; break;
   default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 3: costSet = false; break;
}
}
}
} break;
}                                                                                                        
	case 5: System.out.print("Tones");{                            
         boolean tones = true;
	while (tones) {
	 System.out.println("""


			1 -> Ringing tone
			2 -> Ringing volume
			3 -> Incoming call alert
			4 -> Composer
			5 -> Message alert tone
			6 -> Keypad tones
			7 -> Warning and game tones
			8 -> Vibrating alert
			9 -> Screen saver
			10 -> Go back
           """);
	int ringingTone = input.nextInt();
	switch (ringingTone) {
				case 1: System.out.println("Ringing tone"); {
				boolean toneRinger = true;
				while (toneRinger) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int ringerTone = input.nextInt();
  switch (ringerTone) {
			case 0: toneRinger = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
				case 2: System.out.println("Ringing volume"); {
				boolean volumeRinger = true;
				while (volumeRinger) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int ringerVolume = input.nextInt();
  switch (ringerVolume) {
			case 0: volumeRinger = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
				case 3: System.out.println("Incoming call alert"); {
				boolean incomeRinger = true;
				while (incomeRinger) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int ringerIncome = input.nextInt();
  switch (ringerIncome) {
			case 0: incomeRinger = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
				case 4: System.out.println("Composer"); {
				boolean composerTone = true;
				while (composerTone) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int toneComposer = input.nextInt();
  switch (toneComposer) {
			case 0: composerTone = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
				case 5: System.out.println("Message alert tone"); {
				boolean messageTones = true;
				while ( messageTones) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int toneMessage = input.nextInt();
  switch (toneMessage) {
			case 0: messageTones = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
				case 6: System.out.println("Keypad tones"); {
				 boolean keypadTones = true;
				while ( keypadTones) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int toneKeypad = input.nextInt();
  switch (toneKeypad) {
			case 0: keypadTones = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
				case 7: System.out.println("Warning and tones"); {
				boolean warningTones = true;
				while ( warningTones) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int toneWarning = input.nextInt();
  switch (toneWarning) {
			case 0: warningTones = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}

} break;
				case 8: System.out.println("Vibrating alert"); {
				boolean vibratingTones = true;
				while ( vibratingTones) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int toneVibrating = input.nextInt();
  switch (toneVibrating) {
			case 0: vibratingTones = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}

} break;
				case 9: System.out.println("Screen saver"); {
				boolean saverTones = true;
				while ( saverTones) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int toneSaver = input.nextInt();
  switch (toneSaver) {
			case 0: saverTones = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
				case 10: tones = false; break;
default: System.out.println("Invalid input bruh!!!");
} 
}                                                                                                                                      
} break;
	case 6: System.out.println("Settings"); {                               //coming back herez
	boolean setting = true;
	while (setting) { 	
		System.out.println("""
			1 -> Call settings
			2 -> Phone settings
			3 -> Security settings
			4 -> Restore factory settings
			5 -> Go back
                        """);
	System.out.println("Press any key for options");
	int input1234 = input.nextInt();
switch (input1234) {
			case 1: 
		boolean setCall = true;
		while (setCall) {
		String settingsCall = """

									1 -> Authomatic redial
									2 -> Speed dialling
									3 -> Call waiting options
									4 -> Own number sending
									5 -> Phone line in use
									6 -> Automatic answer
									7 -> Go back

									""";
		System.out.println(settingsCall);
 int authomatic = input.nextInt();
switch (authomatic) {
			case 1: System.out.println("Authomatic redial"); {
			boolean autoRedial = true;
				while (  autoRedial) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int redialAuto = input.nextInt();
  switch (redialAuto) {
			case 0: autoRedial = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 2: System.out.println("Speed dailling"); {
			boolean speedRedial = true;
				while (speedRedial) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int redialSpeed = input.nextInt();
  switch (redialSpeed) {
			case 0: speedRedial = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 3: System.out.println("Call waiting options"); {
			boolean waitingOptions = true;
				while (waitingOptions) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int optionsWaiting = input.nextInt();
  switch (optionsWaiting) {
			case 0: waitingOptions = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 4: System.out.println("Own number sending"); {
			boolean ownNumber = true;
				while (ownNumber) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int numberOwn = input.nextInt();
  switch (numberOwn) {
			case 0: ownNumber = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 5: System.out.println("Phone line in use"); {
			boolean linePhone = true;
				while (linePhone) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int phoneLine = input.nextInt();
  switch (phoneLine) {
			case 0: linePhone = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 6: System.out.println("Authomatic answer"); {
			boolean autoAnswer = true;
				while (autoAnswer) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int answerAuto = input.nextInt();
  switch (answerAuto) {
			case 0: autoAnswer = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 7: setCall = false; break;
default: System.out.println("Invalid input bruh!!!");
}
}
break;
			case 2:
		boolean phoneSet = true;
		while (phoneSet) {
		 String phoneSettings = """
									1 -> Language
									2 -> Cell info display
									3 -> Welcome note
									4 -> Network selection
									5 -> Lights
									6 -> Confirm SIM service actions
									7 -> Go back
                                                                      """;
		System.out.println(phoneSettings);
int language = input.nextInt();
switch (language) {
			case 1: System.out.println("Languages"); {
			boolean autoLag = true;
				while (autoLag) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int lagAuto = input.nextInt();
  switch (lagAuto) {
			case 0: autoLag = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 2: System.out.println("Cell info display"); {
			boolean autoDisplay = true;
				while (autoDisplay) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int displayAuto = input.nextInt();
  switch (displayAuto) {
			case 0: autoDisplay = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 3: System.out.println("Welcome note"); {
			boolean noteWell = true;
				while (noteWell) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int wellNote = input.nextInt();
  switch (wellNote) {
			case 0: noteWell = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 4: System.out.println("Network selection"); {
			boolean networkSec = true;
				while (networkSec) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int secNetwork = input.nextInt();
  switch (secNetwork) {
			case 0: networkSec = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 5: System.out.println("Light"); {
			boolean autoLight = true;
				while (autoLight) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int lightAuto = input.nextInt();
  switch (lightAuto) {
			case 0: autoLight = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 6: System.out.println("Confirm SIM service actions"); {
			boolean autoSim = true;
				while (autoSim) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int simAuto = input.nextInt();
  switch (simAuto) {
			case 0: autoSim = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 7: phoneSet = false; break;
default: System.out.println("Invalid input bruh!!");
}
}
break;
			case 3: 
		boolean secSetting = true;
		while (secSetting) {
		String securitySettings = """
									1 -> PIN code request
									2 -> Call barring service
									3 -> Fixed dialling
									4 -> Closing user group
									5 -> Phone security
									6 -> Change access codes
									7 -> Go back
                                                                     """;
		System.out.println(securitySettings);
   int pinRequest = input.nextInt();
switch (pinRequest) {
			case 1: System.out.println("PIN code request"); {
			boolean autoRequest = true;
				while (autoRequest) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int requestAuto = input.nextInt();
  switch (requestAuto) {
			case 0: autoRequest = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 2: System.out.println("Call barring service"); {
			boolean barringService = true;
				while (barringService) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int serviceBarring = input.nextInt();
  switch (serviceBarring) {
			case 0: barringService = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 3: System.out.println("Fixed dialling"); {
			boolean autoFixing = true;
				while (autoFixing) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int fixingAuto = input.nextInt();
  switch (fixingAuto) {
			case 0: autoFixing = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}

} break;
			case 4: System.out.println("Closing user group"); {
			boolean autoClosing = true;
				while (autoClosing) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int closingAuto = input.nextInt();
  switch (closingAuto) {
			case 0: autoClosing = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 5: System.out.println("Phone security"); {
			boolean autoSecurity = true;
				while (autoSecurity) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int securityAuto = input.nextInt();
  switch (securityAuto) {
			case 0: autoSecurity = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 6: System.out.println("Change access codes"); {
			boolean autoAccess = true;
				while (autoAccess) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int accessAuto = input.nextInt();
  switch (accessAuto) {
			case 0: autoAccess = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
			case 7: secSetting = false; break;
default: System.out.println("Invalid input bruh l!!");
}
}
break;
                    case 4: System.out.println("Restore factory settings"); {
		    boolean autoFactory = true;
				while (autoFactory) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int factoryAuto = input.nextInt();
  switch (factoryAuto) {
			case 0: autoFactory = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		    case 5: setting = false; break;
  default: System.out.println("Invalid input bruh !!!");
}       
}                                                                                                                // to here
}break;
	case 7: System.out.print("Call divert"); {
	boolean autoDivert = true;
				while (autoDivert) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int divertAuto = input.nextInt();
  switch (divertAuto) {
			case 0: autoDivert = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
	case 8: System.out.print("Games"); {
	boolean autoGame = true;
				while (autoGame) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int gameAuto = input.nextInt();
  switch (gameAuto) {
			case 0: autoGame = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
	case 9: System.out.print("Calculator"); {
	boolean autoCalculate = true;
				while (autoCalculate) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int calculateAuto = input.nextInt();
  switch (calculateAuto) {
			case 0: autoCalculate = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
	case 10: System.out.print("Reminders"); {
	boolean autoReminder = true;
				while (autoReminder) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int reminderAuto = input.nextInt();
  switch (reminderAuto) {
			case 0: autoReminder = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
	case 11: System.out.print("Clock"); {                                               //from here
		boolean alarmSet = true;
		while (alarmSet) {
		System.out.println("""
					
					1 -> Alarm clock 
					2 -> Clock settings
					3 -> Date setting
					4 -> Stopwatch
					5 -> Countdown timer
					6 -> Auto update of date and time
					7 -> Go back

                                         """);
   int alarm = input.nextInt();
switch (alarm) {
		case 1: System.out.println("Alarm clock"); {
		boolean autoAlarm = true;
				while (autoAlarm) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int alarmAuto = input.nextInt();
  switch (alarmAuto) {
			case 0: autoAlarm = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 2: System.out.println("Clock settings"); {
		boolean autoClock = true;
				while (autoClock) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int clockAuto = input.nextInt();
  switch (clockAuto) {
			case 0: autoClock = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 3: System.out.println("Date setting"); {
		boolean autoDate = true;
				while (autoDate) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int dateAuto = input.nextInt();
  switch (dateAuto) {
			case 0: autoDate = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 4: System.out.println("Stopwatch"); {
		boolean autoStopwatch = true;
				while (autoStopwatch) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int stopwatchAuto = input.nextInt();
  switch (stopwatchAuto) {
			case 0: autoStopwatch = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 5: System.out.println("Counter timer"); { 
		boolean autoCounterTimer = true;
				while (autoCounterTimer) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int counterTimerAuto = input.nextInt();
  switch (counterTimerAuto) {
			case 0: autoCounterTimer = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}		
} break;
		case 6: System.out.println("Auto update of date and time"); {
		boolean autoUpdateDate = true;
				while (autoUpdateDate) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int updateDateAuto = input.nextInt();
  switch (updateDateAuto) {
			case 0: autoUpdateDate = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
		case 7: alarmSet = false; break;
default: System.out.println("Invalid input bruh!!");
}
}

}break;
	case 12: System.out.print("Profile"); {
	boolean autoProfiling = true;
				while (autoProfiling) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int profilingAuto = input.nextInt();
  switch (profilingAuto) {
			case 0: autoProfiling = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
	case 13: System.out.print("Sim services"); {
	boolean autoServicesSim = true;
				while (autoServicesSim) {
				System.out.println("""
						0 -> Go back
				""");
  System.out.println("Press 0 to go back");
  int serviceSimAuto = input.nextInt();
  switch (serviceSimAuto) {
			case 0: autoServicesSim = false; break;
    default: System.out.println("Invalid input bruh !!!");
}
}
} break;
        case 0 : mainMenu = false; {
            System.out.println("Thanks for choosing NOKIA!!!");
}break;

default: System.out.println("But you see the options nah!!!");
}
}
}
}
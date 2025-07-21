import java.util.Scanner;

public class NokiaVersion1 {

public static void main (String[] args) {

NokiaMethod.showMenu();

Scanner input = new Scanner(System.in);

 String promptIkka = """                   

                                                 WELCOME             TO    

                                               
                          

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

             System.out.println("Enter an option:");
              int menuFunctions = input.nextInt();
             
switch(menuFunctions) {
                  case 1: System.out.println("1.Phonebook"); 
			NokiaMethod.showMenu();
                         String PhonebookMenu = """
                                    1.Search
                                    2.Service Nos
                                    3.Add name
                                    4.Erase
                                    5.Edit
                                    6.Assignment
                                    7.Send b'card
                                    8.Option
                                    9.Speed dial
                                   10.voice tags
                                   """;
                              System.out.println( PhonebookMenu);
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
                  case 8: System.out.println("8.Option"); 

                  String optionMenu = """
                               1.Type of view
                               2.Memmory status 
                                       """;
                           System.out.println( optionMenu);
                              System.out.println("Enter a option option:");
                               int optionOption = input.nextInt();
        switch(optionOption) {
                   case 1: System.out.println("1.Type of view"); break;
                   case 2: System.out.println("2.Memmory status"); break;
                   default: System.out.println("Invalid option."); break;
                        }
                    break;
                    
                  case 9: System.out.println("9.Speed dial"); break;
                  case 10: System.out.println("10.voice tags"); break;
                  default: System.out.println("Invalid option."); break;
                }       


                  case 2: System.out.println("2.Messages");
                       String messageMenu = """
                                    1.Write messages
                                    2.Inbox
                                    3.Outbox
                                    4.Picture messsages
                                    5.Template
                                    6.Smileys
                                    7.Message setting
                                    8.Info service
                                    9.Voice mailbox number
                                    10.Service command editor
                                  """;
                        System.out.println( messageMenu);
                              System.out.println("Enter a message option:");
                               int messageOption = input.nextInt();  
         switch(messageOption) { 
                   case 1: System.out.println("1.Write messages"); break;
                   case 2: System.out.println("2.Inbox"); break;
                   case 3: System.out.println("3.Outbox"); break;
                   case 4: System.out.println("4.Picture messsages"); break;
                   case 5: System.out.println("5.Template"); break;
                   case 6: System.out.println("6.Smileys"); break;
                   case 7: System.out.println("7.Message setting");
 
                        String messageSettingMenu = """
                                    1.Set
                                    2.Common
                                  """;
                              System.out.println(messageSettingMenu);
                              System.out.println("Enter a message Setting option:");
                              int messageSettingOption = input.nextInt(); 
           switch(messageSettingOption) {
                   case 1: System.out.println("1.Set");

                        String setMenu = """
                               1.Message centre number
                               2.Message sent as
                               3.Message validity
                          """;
                              System.out.println(setMenu);
                              System.out.println("Enter a Set option:");
                              int setOption = input.nextInt();
           switch(setOption) {
                      case 1: System.out.println("1.Message centre number"); break;
                      case 2: System.out.println("2.Message sent as"); break;
                      case 3: System.out.println("3.Message validity"); break;
                      default: System.out.println("Invalid option."); break;
                    }
                   
               break;

                   case 2: System.out.println("2.Common");

                         String commonMenu = """
                               1.Delivery reports
                               2.Reply via same centre
                               3.Character support
                          """;                    
                              System.out.println(commonMenu);
                              System.out.println("Enter a common option:");
                              int commonOption = input.nextInt();
             switch(commonOption) {
                      case 1: System.out.println("1.Delivery reports"); break;
                      case 2: System.out.println("2.Reply via same centre"); break;
                      case 3: System.out.println("3.Character support"); break;
                      default: System.out.println("Invalid option."); break;
                    }
               break;

                   default: System.out.println("Invalid option."); break;
                    }
               break;
                      case 8: System.out.println("8.Info service"); break;
                      case 9: System.out.println("9.Voice mailbox number"); break;
                      case 10: System.out.println("10.Service command editor"); break; 
                   default: System.out.println("Invalid option."); break;
                     }         
                break;

                  case 3: System.out.println("3.Chat"); break;
                  case 4: System.out.println("4.Call register");

                  String registerMenu = """
                               1.Missed calls
                               2.Received calls
                               3.Dialled numbers
                               4.Erase recent call list
                               5.Show call duration
                               6.Show call costs
                               7.Call cost settings
                               8.Prepaid credit
                          """;                    
                              System.out.println(registerMenu);
                              System.out.println("Enter a register option:");
                              int registerOption = input.nextInt();
                switch(registerOption) {
                      case 1: System.out.println("1.Missed calls"); break;
                      case 2: System.out.println("2.Received calls"); break;
                      case 3: System.out.println("3.Dialled numbers"); break;
                      case 4: System.out.println("4.Erase recent call list"); break;
                      case 5: System.out.println("5.Show call duration");

                      String showCallDurationMenu = """
                               1.Last call duration
                               2.All calls duration
                               3.Received calls duration
                               4.Dialled calls duration
                               5.Clear timers
                          """;                    
                              System.out.println(showCallDurationMenu);
                              System.out.println("Enter a show Call Duration option:");
                              int showCallDurationOption = input.nextInt();
               switch(registerOption) {
                      case 1: System.out.println("1.Last call duration"); break;
                      case 2: System.out.println("2.All calls duration"); break;
                      case 3: System.out.println("3.Received calls duration"); break;
                      case 4: System.out.println("4.Dialled calls duration"); break;
                      case 5: System.out.println(" 5.Clear timers"); break;
                      default: System.out.println("Invalid option."); break;
                    }  
               break;
                      case 6: System.out.println("6.Show call costs");
                       String showCallCostMenu = """
                               1.Last call cost
                               2.All calls cost
                               3.Clear counters 
                           """;
                              System.out.println(showCallCostMenu);
                              System.out.println("Enter a show Call Cost option:");
                              int showCallCostOption = input.nextInt();
               switch(showCallCostOption) {
                      case 1: System.out.println("1.Last call cost"); break;
                      case 2: System.out.println("2.All calls cost"); break;
                      case 3: System.out.println("3.Clear counters"); break;
                      default: System.out.println("Invalid option."); break;
                    }   
               break;

                      case 7: System.out.println("7.Call cost settings");
                     String showCallSettingsMenu = """
                               1.call cost limit
                               2.Show costs in
                           """;
                              System.out.println(showCallSettingsMenu);
                              System.out.println("Enter a show Call settings option:");
                              int showCallSettingsOption= input.nextInt();
               switch(showCallSettingsOption) {
                      case 1: System.out.println("1.call cost limit"); break;
                      case 2: System.out.println("2.Show costs in"); break;
                      default: System.out.println("Invalid option."); break;
                    }
               break;
                      case 8: System.out.println("8.Prepaid credit"); break;
                      case 0: System.out.println(prompt); break;
                      default: System.out.println("Invalid option."); break;
                    }  
                break;

                  case 5: System.out.println("5.Tones");
                String toneMenu = """
                     1.Ringing tone
                     2.Ringing volume
                     3.Incoming call alert
                     4.Composer
                     5.Message alert time
                     6.Keypad tones
                     7.Warning and game tones
                     8.Vibrating alert
                     9.Screen saver
                   """;         
             System.out.println(toneMenu);
             System.out.println("Enter an tone option:");
              int toneOption = input.nextInt();
      switch(toneOption) {
                  case 1: System.out.println("1.Ringing tone"); 
                  case 2: System.out.println("2.Ringing volume"); break;
                  case 3: System.out.println("3.Incoming call alert"); break;
                  case 4: System.out.println("4.Composer"); break;
                  case 5: System.out.println("5.Message alert time"); break;
                  case 6: System.out.println("6.Keypad tones"); break;
                  case 7: System.out.println("7.Warning and game tones"); break;
                  case 8: System.out.println("8.Vibrating alert"); break;
                  case 9: System.out.println("9.Screen saver"); break;
                  default: System.out.println("Invalid option."); break;
 }
                 break;
                  case 6: System.out.println("6.Settings");
            String settingsMenu = """
                     1.Call settings
                     2.Phone settings
                     3.Security settings
                     4.Restore factory settings
                   """;         
             System.out.println(settingsMenu);
             System.out.println("Enter a setting option:");
              int settingsOption = input.nextInt();
           switch(settingsOption) {
                  case 1: System.out.println("1.Call settings");
                String callSettingsMenu = """
                     1.Automatic redial
                     2.Speed dialing
                     3.Call waiting options
                     4.Own number sending
                     5.Phone line user
                     6.Automatic answer
                   """;      
             System.out.println(callSettingsMenu);
             System.out.println("Enter a call settings option:");
              int callSettingsOption = input.nextInt();
     switch(callSettingsOption) {  
                      case 1: System.out.println("1.Automatic redial"); break;
                      case 2: System.out.println("2.Speed dialing"); break;
                      case 3: System.out.println("3.Call waiting options"); break;
                      case 4: System.out.println("4.Own number sending"); break;
                      case 5: System.out.println("5.Phone line user"); break;
                      case 6: System.out.println("6.Automatic answer"); break;
                      default: System.out.println("Invalid option."); break;
                    } 
       break; 
                  case 2: System.out.println("2.Phone settings");
         String phoneSettingsMenu = """
                     1.Language
                     2.Cell info display
                     3.Welcome note
                     4.Network selection
                     5.Lights
                     6.Confirm SIM service action  
                  """;         
             System.out.println(phoneSettingsMenu);
             System.out.println("Enter an phone settings option:");
              int phoneSettingsOption = input.nextInt();
      switch(phoneSettingsOption) {
                      case 1: System.out.println("1.Language"); break;
                      case 2: System.out.println("2.Cell info display"); break;
                      case 3: System.out.println("3.Welcome note"); break;
                      case 4: System.out.println("4.Network selection"); break;
                      case 5: System.out.println(" 5.Lights"); break;
                      case 6: System.out.println("6.Confirm SIM service action"); break;
                      default: System.out.println("Invalid option."); break;
                    } 
              
        break;
                  case 3: System.out.println("3.Security settings");
          String securitySettingsMenu = """
                     1.PIN code request
                     2.Call barring service
                     3.Fixed dialing
                     4.Closed user group
                     5.Phone security
                     6.Change acess codes  
                  """;        
       System.out.println(securitySettingsMenu);
             System.out.println("Enter an security settings option:");
              int securitySettingsOption = input.nextInt();
      switch(securitySettingsOption) {
                      case 1: System.out.println("1.PIN code request"); break;
                      case 2: System.out.println("2.Call barring service"); break;
                      case 3: System.out.println("3.Fixed dialing"); break;
                      case 4: System.out.println("4.Closed user group"); break;
                      case 5: System.out.println("5.Phone security"); break;
                      case 6: System.out.println("6.Change acess codes"); break;
                      default: System.out.println("Invalid option."); break;
                    } 

 break;
                  case 4: System.out.println("4.Restore factory settings"); break;
                  default: System.out.println("Invalid option."); break; 
 }
        break;
                  case 7: System.out.println("7.Call divert"); break;
                  case 8: System.out.println("8.Games"); break;
                  case 9: System.out.println("9.Calculator"); break;
                  case 10: System.out.println("10.Reminders"); break;
                  case 11: System.out.println("11.Clock");

            String clockMenu = """
                     1.Alarm clock
                     2.Clock settings
                     3.Date settings
                     4.Stopwatch
                     5.Countdown timer
                     6.Auto update of date and time 
                  """;     
         System.out.println(clockMenu);
             System.out.println("Enter a clock option:");
              int clockOption = input.nextInt();
      switch(clockOption) {
                      case 1: System.out.println("1.Alarm clock"); break;
                      case 2: System.out.println("2.Clock settings"); break;
                      case 3: System.out.println("3.Date settings"); break;
                      case 4: System.out.println("4.Stopwatch"); break;
                      case 5: System.out.println("5.Countdown timer"); break;
                      case 6: System.out.println("6.Auto update of date and time"); break;
                      default: System.out.println("Invalid option."); break;
                    } 

      break;
                  case 12: System.out.println("12.Profiles"); break;
                  case 13: System.out.println("13.SIM services"); break;
                  default: System.out.println("Invalid option."); break;
}
}
}   
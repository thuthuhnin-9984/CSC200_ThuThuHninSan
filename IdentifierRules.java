// Intentionally incorrect program to demonstrate invalid Java identifiers.
/*Rule 1: Identifiers cannot be Java reserved keyword.
Rule 2: Identifiers cannot begin with a digit.
Rule 3: Identifiers cannot contain spaces.
Rule 4: Identifiers cannot contain special characters (except _ and $)
Rule 5: Identifiers must follow naming conventions. */

//class switch{

class Switch{ //R1
	String SwitchStatus = "On";
	
}

public class IdentifierRules {
	
   // public static void 1start() {
   public static void start() { //R2
        
		System.out.println("Static Method Output");
	}

    public static void main(String[] args) {

        //int 2ndPlace = 2;
        int secondPlace = 2;//R2
        //int first name = 10;
        int firstname = 10; //R3

        //int price# = 99;
        int price =99;//R4
        
		//int user-name = 25;
		int username =25;//R4
		//int class = 1;
		//int double = 3;
		int a =1; //R1
		int b =3;//R1

        int Score = 10;
        //System.out.println(score);
		System.out.println(Score); //R5
		System.out.println("This program is executed after all errors are rectified.");


        //1start();
        start(); //R2
    }

}

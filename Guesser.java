import java.util.Random;
import java.util.Scanner;

public class Guesser {
	public static void main(string args[]){
		scanner input = new scanner(system.in);
		Random random = new Random();
		int randomNumber = randomNextInt(100) + 1;
		int guess;
		int attempts = 0;
	} // end main
	
	public string menu(){
        	system.out.println("0) Exit");
        	system.out.println("1) Human Guesser");
        	system.out.println("2) Computer Guesser");
        	string response = input.nextLine();
        	return response;
	} // end menu
	
	public Guesser() {
		boolean keepGoing = true;
		while(keepGoing){
			string response = menu();
		
			if (response.equals("1")){
				system.out.println("Human Guesser");
				string number = input.nextLine();
				number = Math.random();
				system.out.print("Please enter a number: ");
				system.out.println(human(number));
		
			} else if (response.equals("2")){
				system.out.println("Computer Guesser");
				string number  = input.nextline();
				number = Math.random();
				system.out.print("I guess: ");

			} else if (response.equals("0")){
				system.out.println(computer(number));out.println("Goodbye!");
				keepGoing = false;

			} else {
				system.out.println("Sorry I did not understand");
			}	// end else
		} // end while
	} // end constructor

	public void humanGuesser(){
		input("please enter 0-2: ");
		correct = math.random();
		while (guess != correct){
			tries++;
			system.out.print("your guess: ");
			string Guesser = input.nextLine();
			if (guess < correct){
				system.out.println("Too Small!");
			} else if (guess > correct){
				system.out.println("Too Large!");
			} else {
				system.out.println("Perfect!");
			}// end else
		}// end while
	}// end HumanGuesser

	public void computerGuesser(){
		input("Please enter 0-2: ");
		int lower = 1;
		int higher = 100;
		int guesser;
		int right = arr.length - 1;
		int left = 0;

		while (guess != correct){
			tries++;
			system.out.println("Too (H)igh, too (L)ow, or (C)orrect?");
			if (guess < correct) {
				system.out.println("Too Low!");
			} else if (guess > correct) {
				system.out.println("Too High!");
			} else { 
				system.out.println("Correct!");
			}// end else
		} // end while
	} // end computerGuesser
} // end Guesser


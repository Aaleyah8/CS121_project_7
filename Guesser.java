import java.util.Random;
import java.util.Scanner;

public string menu(){
	system.out.println("0) Exit");
	system.out.println("1) Human Guesser");
	system.out.println("2) Computer Guesser");
	string response = input.nextLine();
	return response;
} // end menu

public class Guesser {
	public static void main(string args[]){
		scanner input = new scanner(system.in);
		math.random();
		new Guesser():
	} // end main
} // end class

public Guesser {
	boolean keepGoing = true;
	while(keepGoing){
		string response - menu();
		
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
		} // end else
	} // end while
} // end constructor

public HumanGuesser(){
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
		} // end else
	} // end while
} // end HumanGuesser

public ComputerGuesser(){
	input("Please enter 0-2: ");
	int lower = 1;
	int higher = 100;
	int guesser;
	int right = arr.length - 1;
	int left = 0;

	system.out.println("Too (H)igh, too (L)ow, or (C)orrect?");

	while (low <= high){
		int mid = left + (right - left) / 2;
		if (arr[mid] == x) {
			return mid;
		} else if (arr[mid] < x) {
			left = mid + 1;
		} else {
			right = mid - 1;
		} // end else
	} // end while
} // end ComputerGuesser


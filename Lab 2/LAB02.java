
/*
 * Aaron Alvarez
 * Lab02
 * CS2012-3
 * Due:9.7.2016
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LAB02 {

	public static void main(String[] args) {
		int usersChoice = 3;
		do {
			Scanner in = new Scanner(System.in);
			List<String> copiedarrayList = createNamesArray();
			// print the array list of children extra step
			printArrayList(copiedarrayList);
			// My menu
			System.out.println("\n Choose your Option.");
			System.out.println(" 1.Easy Problem \n 2.Hard Problem \n 3.Else Press 3 To Quit");
			usersChoice = in.nextInt();
			// check for users number otherwise quit.
			if (usersChoice <= 0 || usersChoice >= 4) {
				System.out.println(usersChoice + " is not in the option menu. \n please try again.");
				usersChoice = 3;
			}

			switch (usersChoice) {
			case 1:
				easyProblem(copiedarrayList);
				System.out.println("");
				System.out.println(" Program Running Again");
				break;
			case 2:
				hardProblem(copiedarrayList);
				System.out.println("");
				System.out.println(" Program Running Again");
				break;
			case 3:
				System.out.println("");
				System.out.println(" Program Terminated");
				System.exit(0);
			default:
				System.out.println("Try Again!");
				usersChoice = in.nextInt();
			}

		} while (usersChoice != 3);
	}

	// method 1 That creates a list of names given by the user.
	public static List<String> createNamesArray() {
		Scanner in = new Scanner(System.in);
		System.out.println("How many names will you enter in the list? ");
		List<String> arrayList = new ArrayList<>();
		int numOfNames = in.nextInt();
		System.out.println("What are the names of your children? ");
		for (int i = 0; i < numOfNames; i++) {
			String userString = in.next();
			arrayList.add(userString);
		}
		return arrayList;
	}

	// method 2 that prints out the list array.
	public static void printArrayList(List<String> arrayListItSelf) {
		// for ( int i = 0; i < arrayListItSelf.length ; i++) {
		System.out.println(arrayListItSelf);
	}

	// create our easy methods
	public static int easyProblem(List<String> arrayListItSelf) {
		Scanner in = new Scanner(System.in);
		int correctNum = 0;
		int day = 0;
		int count = 0;
		String whoDoesTheDishes = "";
		String usersString = "";
		do {
			count = day % arrayListItSelf.size();
			System.out.println("Day " + day + ": " + arrayListItSelf.get(count) + " must do the dishes");
			whoDoesTheDishes = ("Day " + day + ": " + arrayListItSelf.get(count) + " must do the dishes");
			// System.out.println(whoDoesTheDishes);
			System.out.println(
					"(Copy The Whole thing in the top and paste it as your answer)\nWho does the dishes at day " + day
							+ "?");
			usersString = in.nextLine();
			// check if user string is the same
			// System.out.println(usersString);
			if (whoDoesTheDishes.equals(usersString)) {
				correctNum++;
				System.out.println("Correct!");
			}
			day++;
		} while (whoDoesTheDishes.equals(usersString));
		System.out.println("You Got " + correctNum + " Right!");
		return correctNum;
	}

	public static int hardProblem(List<String> arrayListItSelf) {
		Scanner in = new Scanner(System.in);
		int correctNum = 0;
		int day = 0;
		int count = 0;
		String childItSelf;
		String usersString;
		do {
			count = day % arrayListItSelf.size();

			childItSelf = arrayListItSelf.get(count);
			System.out.println("Who does the dishes at day " + day + "?" + "(Just Give me a name)");
			System.out.println("Input: ");
			usersString = in.next();
			// check if user string is the same
			if (childItSelf.equals(usersString)) {
				correctNum++;
				System.out.println("Correct!");
			}
			day++;
		} while (childItSelf.equals(usersString));
		System.out.println("You Got " + correctNum + " Right!");
		return correctNum;
	}
}

/*
 * Aaron Alvarez
 * Lab3 AttackMonitor Class
 * 9.27.2016
*/
package Lab3;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AttackMonitor {

	private List<MonsterAttack> monsterAttacks = new ArrayList<MonsterAttack>();

	public void monitor() throws IOException {

		String[] choices = { "Quit", "List Attacks ", "Del an Attack", "Add an Attack", "Read File", "Save File" };
		int choice;
		do {
			choice = JOptionPane.showOptionDialog(null, "Main Menu", "Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");

			switch (choice) {
			case 0:
				break;
			case 1:
				listMonsterAttack();
				break;
			case 2:
				delAtt();
				break;
			case 3:
				addAtt();
				break;
			case 4:
				readFile();
				break;
			case 5:
				copyFile();
				break;
			} // end switch

		} while (choice != 0); // end do
	}// end main

	private void addAtt() {
		int monstersID = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The ID For This Monster"));
		String dateAttack = JOptionPane.showInputDialog("Please Enter The Date Of The Attack");
		String monstersName = JOptionPane.showInputDialog("Please Enter the Name Of The Monster");
		String locationOfAttack = JOptionPane.showInputDialog("Please Enter The Location Of Attack");
		int numbersOfVictims = Integer
				.parseInt(JOptionPane.showInputDialog("Please Enter The Number of Victims Due To The Attack"));
		monsterAttacks.add(new MonsterAttack(monstersID, dateAttack, monstersName, locationOfAttack, numbersOfVictims));

	}

	private void listMonsterAttack() {
		StringBuilder sb = new StringBuilder("List of Attacks \n");
		if (monsterAttacks.isEmpty())
			sb.append("None");
		else
			for (MonsterAttack i : monsterAttacks)
				sb.append(i + "\n");
		JOptionPane.showMessageDialog(null, sb);
	} // end if

	private void delAtt() {
		int usersDeleleteAttack = Integer
				.parseInt(JOptionPane.showInputDialog("Please Enter The ID of the Monster You want to Delete"));
		for (int i = 0; i < monsterAttacks.size(); i++) {
			if (usersDeleleteAttack == monsterAttacks.get(i).getAttackID()) {
				monsterAttacks.remove(i);
			}
		}
	}
	public void readFile() {
		
		monsterAttacks.clear();
		try {
			String userPathName = JOptionPane.showInputDialog("Enter a filepath to read from");
			File inFile = new File(userPathName); // File to read from.
			Scanner freader = new Scanner(inFile);

			String line;
			String[] fields;
			int attackID;
			String dateAttack;
			String monsterName;
			String locationOfAttack;
			int numberOfVictims;

			while (freader.hasNextLine()) {
				line = freader.nextLine();
				fields = line.split(",");
				attackID = Integer.parseInt(fields[0]);
				dateAttack = fields[1];
				monsterName = fields[2];
				locationOfAttack = fields[3];
				numberOfVictims = Integer.parseInt(fields[4]);

				monsterAttacks
						.add(new MonsterAttack(attackID, dateAttack, monsterName, locationOfAttack, numberOfVictims));
			}

			freader.close(); // Close to unlock.
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}

	public void copyFile() throws IOException {
		String fileIn = JOptionPane.showInputDialog("Where you want to save your file.");
		PrintWriter write = new PrintWriter(new FileWriter(fileIn));
		for (MonsterAttack i : monsterAttacks) {
			write.println(i.getAttackID() + "," + i.getDate() + "," + i.getMonsterName() + "," + i.getLocationOfAttack()
					+ "," + i.getNumberOfVictims());
		}

		// ... Close reader and writer.

		write.close();
		

	}
}

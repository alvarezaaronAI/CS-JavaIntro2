/*
 * Aaron Alvarez
 * Lab3 AttackMonitor Class
 * 9.27.2016
*/
package Lab11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AttackMonitor {

	private List<MonsterAttack> monsterAttacks = new ArrayList<MonsterAttack>();

	public void monitor() throws IOException {

		String[] choices = { "Quit", "List Attacks ", "Del an Attack", "Add an Attack", "Save File", "Read File" };
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
				saveFile();
				break;
			case 5:
				readFile();
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


	
	 public void saveFile(){
		 MonsterPersister persist = new BinaryMonsterPersister();
			JFileChooser filechooser = new JFileChooser();
			int retVal = filechooser.showOpenDialog(null);
			if (retVal == JFileChooser.APPROVE_OPTION) {
				File selectedFile = filechooser.getSelectedFile();
				persist.fileOutPut(selectedFile, monsterAttacks);
			}
	 }
	public void readFile() {
		MonsterPersister persister = new BinaryMonsterPersister();
		JFileChooser filechooser = new JFileChooser();
		int retVal = filechooser.showOpenDialog(null);
		if (retVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = filechooser.getSelectedFile();
			monsterAttacks = persister.fileInPut(selectedFile);
		}

	}
}

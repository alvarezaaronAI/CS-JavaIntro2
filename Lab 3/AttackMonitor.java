package Lab3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AttackMonitor {

	private List<MonsterAttack> monsterAttacks = new ArrayList<MonsterAttack>();

	public void monitor() {

		String[] choices = { "Quit", "List Attacks ",
				"Del an Attack", "Add an Attack" };
		int choice;
		do {
			choice = JOptionPane.showOptionDialog(null, "Main Menu",
					"Main Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
					choices, "null");

			switch (choice) {
			case 0:
				break;
			case 1:
				if (!(monsterAttacks.isEmpty()))
					listMonsterAttack();
				break;
			case 2:
				if (!(monsterAttacks.isEmpty()))
					delAtt();
				break;
			case 3:
				addAtt();
				break;
			} // end switch

		} while (choice != 0); // end do
	}// end main
	
	private MonsterAttack getMonsterAttackFromInput() {

		int choice = JOptionPane.showOptionDialog(null, "Monster Attack List?",
				"Monster Attack LIst?", 0, JOptionPane.QUESTION_MESSAGE, null,
				monsterAttacks.toArray(), "null"); // the choices must be an array
		return monsterAttacks.get(choice);
	}

	private void listMonsterAttack() {
		/*MonsterAttack monsterAtt = getMonsterAttackFromInput();
		if (monsterAttacks.contains(monsterAtt)) {
			List<MonsterAttack> deptCourses = dept.getMonsterAttack();
			StringBuilder sb = new StringBuilder(dept.getDeptName()
					+ " offers the following courses:\n ");
			if (deptCourses.isEmpty())
				sb.append("None");
			else
				for (Course c : deptCourses)
					sb.append(c + "\n"); // note that this will use the
				// toString() method of Course
			JOptionPane.showMessageDialog(null, sb);
		} // end if
*/	}

	private void delAtt() {
		//Searches the list and deletes the whole list 
		//If user enters the attack id then that attack id list gets remove
	}

	private void addAtt() {
		MonsterAttack monsterAtt = getMonsterAttackFromInput();
		int monstersID= Integer.parseInt
				
		String dateAttack = JOptionPane.showInputDialog
				("Please Enter The Date Of The Attack" );
		String monstersName = JOptionPane.showInputDialog
				("Please Enter the Name Of The Monster" );
		String locationOfAttack = JOptionPane.showInputDialog
				("Please Enter The Location Of Attack" );
		String numbersOfVictims = JOptionPane.showInputDialog
				("Please Enter The Number of Victims Due To The Attack" );
		monsterAttacks.add(new MonsterAttack
				(monstersID, dateAttack, monstersName, locationOfAttack, numbersOfVictims));
		
	}
}
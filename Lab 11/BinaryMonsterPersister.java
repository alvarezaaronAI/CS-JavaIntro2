package Lab11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

public class BinaryMonsterPersister implements MonsterPersister {
	//from slides
	@Override
	public void fileOutPut(File fileInputIn , List<MonsterAttack> monsterAttackObjIn) {
		ObjectOutputStream Oos = null;
		try {
			Oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileInputIn)));
			Oos.writeObject(monsterAttackObjIn);
			Oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//from slides
	@Override
	public List<MonsterAttack> fileInPut(File fileInputIn) {
		ObjectInputStream inputStream = null;
		List<MonsterAttack> monsterAttacksList = null;
		try {
			
			FileInputStream fileIn = new FileInputStream(fileInputIn);
			inputStream = new ObjectInputStream(new BufferedInputStream(fileIn));
			monsterAttacksList = (List<MonsterAttack>) inputStream.readObject();
			inputStream.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return monsterAttacksList;
	}

}

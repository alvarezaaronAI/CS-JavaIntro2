package Lab11;

import java.io.File;
import java.util.List;

public interface MonsterPersister {

	public void fileOutPut(File fileInputIn , List<MonsterAttack> listOfMonsterObjIn);//write means save
	public List<MonsterAttack> fileInPut(File fileInputIn);//read means read
}

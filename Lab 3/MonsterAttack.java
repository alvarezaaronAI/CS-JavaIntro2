package Lab3;

public class MonsterAttack {
	private int attackID;
	private String date;
	private int month;
	private int day;
	private int year;
	private String monsterName;
	private String locationOfAttack;
	private String numbersOfVictims;

	public MonsterAttack(int attackIDIn, String dateIn, String monsterNameIn, String locationOfAttackIn,
			String numberOfVictimsIn) {
		attackID = attackIDIn;
		date = dateIn;
		monsterName = monsterNameIn;
		locationOfAttack = locationOfAttackIn;
		numbersOfVictims = numberOfVictimsIn;
		//Finish the Split
		String[] splitDate = date.split("/");
		month = Integer.parseInt(splitDate[0]);
		day = Integer.parseInt(splitDate[1]);
		year = Integer.parseInt(splitDate[2]);
		
	}
	public int getAttackID() {
		return attackID;
	}
	public void setAttackID(int attackID){
		this.attackID = attackID;
	}
	
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date = date;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}

	public String getMonsterName() {
		return monsterName;
	}
	public void setMonsterName(String monsterName){
		this.monsterName = monsterName;
	}
	
	public String getLocationOfAttack(){
		return locationOfAttack;
	}
	public void setLocationOfAttack(String locationOfAttack){
		this.locationOfAttack = locationOfAttack;
	}
	
	public String getNumberOfVictims() {
		return numbersOfVictims;
	}
	public void setNumberOfVictims(String numbersOfVictims){
		this.numbersOfVictims = numbersOfVictims;
	}
	public String toString(){
		return "Attack # " + attackID + "occured on" + month + "/" + day + "/" + "year" + ". " +
				monsterName + " attacked "  + locationOfAttack + ", resulting in "+ 
				numbersOfVictims + " tragic fatalities.";
	}
}
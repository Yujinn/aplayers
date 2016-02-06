
public abstract class Character {

String firstName;
String lastName;
boolean gender;
int strength;
int charisma;
int intellect;
int dexterity;

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public boolean isGender() {
	return gender;
}
public void setGender(boolean gender) {
	this.gender = gender;
}
public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
public int getCharisma() {
	return charisma;
}
public void setCharisma(int charisma) {
	this.charisma = charisma;
}
public int getIntellect() {
	return intellect;
}
public void setIntellect(int intellect) {
	this.intellect = intellect;
}
public int getDexterity() {
	return dexterity;
}
public void setDexterity(int dexterity) {
	this.dexterity = dexterity;
}
	
}

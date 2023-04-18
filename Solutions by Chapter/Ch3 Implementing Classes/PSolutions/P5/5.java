/* 

5.- A Person has a name (just a first name for simplicity) and friends. Store the names of
the friends in a string, separated by spaces. Provide a constructor that constructs a person with a given name and no friends. Provide methods

	public void befriend(Person p)
	public void unfriend(Person p)
	public String getFriendNames()

*/

class Person {
	
	private String name;
	private StringBuilder friends;
	
	Person(String n) {
		name = n;
		friends = new StringBuilder();
	}
	
	private String getName(){
		return this.name;
	}
	
	void befriend(Person p) {
		friends.append(" " + p.getName());
	}
	
	void unfriend(Person p) {
		int indexOfName = friends.indexOf(p.getName());
		int nameLenght = p.getName().length();
		friends.replace(indexOfName, (indexOfName + nameLenght + 1),"");
	}
	
	void getFriendNames(){
		System.out.println(friends);
	}
	
}

public class PersonTester {
	
	public static void main(String[] args){
		
		Person mario = new Person("Mario");
		Person dario = new Person("Dario");
		Person carlos = new Person("Carlos");
		
		mario.befriend(dario);
		mario.befriend(carlos);
		
		mario.getFriendNames();
		
		mario.unfriend(dario);
		
		mario.getFriendNames();
		
		System.exit(0);
		
	}
	
}


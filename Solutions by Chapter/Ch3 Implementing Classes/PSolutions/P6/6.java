/* 

6.- Add a method public int getFriendCount() to the Person class of Exercise P3.5.

*/

class Person {
	
	private String name;
	private StringBuilder friends;
	private int friendCount;
	
	Person(String n) {
		name = n;
		friends = new StringBuilder();
	}
	
	private String getName(){
		return this.name;
	}
	
	void befriend(Person p) {
		friends.append(" " + p.getName());
		friendCount++;
	}
	
	void unfriend(Person p) {
		int indexOfName = friends.indexOf(p.getName());
		int nameLenght = p.getName().length();
		friends.replace(indexOfName, (indexOfName + nameLenght + 1),"");
		friendCount--;
	}
	
	void getFriendNames(){
		System.out.println(friends);
	}
	
	int getFriendCount(){
		
		return friendCount;
	}
	
}

public class PersonTesterFriendCount {
	
	public static void main(String[] args){
		
		Person mario = new Person("Mario");
		Person dario = new Person("Dario");
		Person carlos = new Person("Carlos");
		
		mario.befriend(dario);
		mario.befriend(carlos);
		
		mario.getFriendNames();
		
		mario.unfriend(dario);
		
		mario.getFriendNames();
		
		System.out.println(" Friend Count: " + mario.getFriendCount());
		
		
		System.exit(0);
		
	}
	
}


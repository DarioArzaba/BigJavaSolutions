/* 

14.- Provide a class for authoring a simple letter. In the constructor, supply the names of the sender and the recipient:

	public Letter(String from, String to)
	public void addLine(String line)
	public String getText()

*/

class Letter {
	
	private String sender;
	private String recipient;
	private String text;
	
	public Letter(String from, String to) {
		sender = from;
		recipient = to;
		text = "";
	}
	
	public void addLine(String line) {
		text = text.concat(line + "\n");
	}
	
	public String getText() {
		String letter = "Dear " + recipient + ":\n\n";
		letter += text + "\n";
		letter += "Sincerely, \n\n" + sender;
		return letter;
	}
	
}


public class LetterPrinter {
	
	public static void main(String[] args){
		
		Letter letter = new Letter("Mary", "John");
		letter.addLine("I am sorry we must part.");
		letter.addLine("I wish you all the best.");
		System.out.println(letter.getText());
		
		System.exit(0);
	}

}


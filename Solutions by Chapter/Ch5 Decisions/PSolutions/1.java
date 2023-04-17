/* 

1.- Write a program that prompts for the day and month of the user’s birthday and then prints a horoscope. Make up fortunes for programmers, like this:

	Please enter your birthday (month and day): 6 16
	Gemini are experts at figuring out the behavior of complicated programs. You feel where bugs are coming from and then stay one step ahead. Tonight, your style wins approval from a tough critic.
	
Each fortune should contain the name of the astrological sign. (You will find the names and date ranges of the signs at a distressingly large number of sites on the Internet.)

Use a class Date with a method getFortune.

Dates:
	Capricorn (December 22-January 19)
	Aquarius (January 20 to February 18)
	Pisces (February 19 to March 20)
	Aries (March 21-April 19)
	Taurus (April 20-May 20)
	Gemini (May 21-June 20)
	Cancer (June 21-July 22)
	Leo (July 23-August 22)
	Virgo (August 23-September 22)
	Libra (September 23-October 22)
	Scorpio (October 23-November 21)
	Sagittarius (November 22-December 21)

Horoscope Fortunes from:
https://odetocode.com/blogs/scott/archive/2008/12/19/your-developer-horoscope.aspx

*/


import java.util.Scanner;

class Date {
	
	private String m, d, horoscope, fortune;
	
	
	public Date(String month, String day){
		m = month;
		d = day;
		horoscope = getHoroscope(Integer.parseInt(m), Integer.parseInt(d));
	}
	
	public String getHoroscope(int month, int day) {
		
		if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
			return "Capricorn";
		} else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
			return "Aquarius";
		} else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
			return "Pisces";
		} else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
			return "Aries";
		} else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
			return "Taurus";
		} else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
			return "Gemini";
		} else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
			return "Cancer";
		} else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			return "Leo";
		} else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			return "Virgo";
		} else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			return "Libra";
		} else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
			return "Scorpio";
		} else {
			return "Sagittarius";
		}
	}
	
	public String getFortune(){
		String f = "";
		if (horoscope.equals("Capricorn")){
			f = "Capricorn it is time for a change. If you’ve been using a statically typed language,\n then try something dynamic. If you’ve been using a dynamic language,\n then try something static. If you do both, then try Malbolge.";
		} else if (horoscope.equals("Aquarius")){
			f = "Aquarius, to you, software is a craft. You always have your eye on an impossible star,\n but you reach anyway. The vague predictions of horoscopes drive you crazy,\n but no one ever accused them of being a science, eh? \nPisces will be your friend. ";
		} else if (horoscope.equals("Pisces")){
			f = "Pisces, you may think your team is just a bunch of monkeys with keyboards \nwhen the next project starts. When life gives you monkeys – make bananas.\n Or something like that. Watch out for Sagittarius.";
		} else if (horoscope.equals("Aries")){
			f = "Aries avoid committing yourself to the next project at work. \nIt’s going to become a death march, and you know it. \nSave your skills and energy for some open source hacking.";
		} else if (horoscope.equals("Taurus")){
			f = "Taurus, you’ve been flirting with functional programming \nand now it’s time to take the plunge. Free your soul of side-effects and embrace a monad. \nIt will make you feel good.";
		} else if (horoscope.equals("Gemini")){
			f = "Gemini, you are entering a period of introspection. For pair programming,\n it’s best to hook up with Cancer. Avoid Pisces,\nbecause you know you’ll bicker over inheritance versus composition \nuntil someone gets hurt by a fast-moving keyboard.";
		} else if (horoscope.equals("Cancer")){
			f = "Cancer, your creative juices are flowing. Color coordinated themes will jump\n from your mind to fill the soft, supple curves of the rounded rectangles your customers visually crave.\n Who said developers can’t design a UI? Not you!";
		} else if (horoscope.equals("Leo")){
			f = "Leo, you might start feeling detached from the rest of the team. \nNow is the time to randomly refactor code that someone else wrote in the name of collective code ownership.\n You might spark a new relationship!";
		} else if (horoscope.equals("Virgo")){
			f = "Virgo, you might need to apply some fundamental design patterns to find the\n elegant solution you seek. Repository. Abstract Factory. Visitor. Pick 2.";
		} else if (horoscope.equals("Libra")){
			f = "Libra, there are lots of meetings in your future. \nSome of those future meetings will be meeting to discuss future meetings (the meta-meeting meeting). \nGood for you the gaming market for cell phones is hitting its stride.";
		} else if (horoscope.equals("Scorpio")){
			f = "Scorpio, don’t get frustrated with what your future holds. \nBroken builds, failing tests, and bug reports like “I think it broke when I click Submit, or something”. \nBe positive and live stress free. Consider taking up Yoga.";
		} else if (horoscope.equals("Sagittarius")){
			f = "Sagittarius, you should start taking security seriously. \nSQL injections, code injections, script injections, header injections. \nEveryone is out to get you, and it’s only a matter of time. \nOnly the paranoid survive. If you can trust a Scorpio, you might find a mentor.";
		}
		return f;
	}
	
}

public class HoroscopeProgrammersPrinter {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your birthday (month and day): " );
		
		String b = input.nextLine();
		
		String[] birthday = b.split(" ");
		
		if ((Integer.parseInt(birthday[0]) >= 1 && Integer.parseInt(birthday[0]) <= 12 ) &&  (Integer.parseInt(birthday[1]) >= 1 && Integer.parseInt(birthday[1]) <= 31)  ){
			Date horoscope = new Date(birthday[0], birthday[1]);
			System.out.println(horoscope.getFortune());
		} else {
			System.out.println("Error. Invalid Birthday. Use a space to separate month and day." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}


		
		
		
		
		
		
		
		
		












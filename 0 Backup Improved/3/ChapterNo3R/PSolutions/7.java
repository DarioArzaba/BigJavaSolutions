/* 

7.- Implement a class Student. For the purpose of this exercise, a student has a name and a total quiz score. Supply an appropriate constructor and methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the average, you also need to store the number of quizzes that the student took. Supply a StudentTester class that tests all methods.

*/


class Student  {
	
	private String name;
	private int totalScore;
	private int quizNumber;
	
	/**
	 * Constructs a student with a given name.
	 *
	 * @param aName student's name
	 */
	Student(String aName) {
		name = aName;
		totalScore = 0;
		quizNumber = 0;
	}
	
	/**
	 * Gets the name of the student.
	 *
	 * @return the name
	 */
	String getName() {
		return name;
	}
	
	/**
	 * Adds a score to the total score.
	 *
	 * @param score quiz score
	 */
	void addQuiz(int score) {
		totalScore += score;
		quizNumber++;
	}
	
	/**
	 * Gets total quiz score.
	 *
	 * @return total score
	 */
	int getTotalScore() {
		return totalScore;
	}
	
	/**
	 * Gets the average score dividing total score by number of quizzes taken.
	 *
	 * @return average score
	 */
	int getAverageScore() {
		return totalScore / quizNumber;
	}
	
	
}

public class StudentScoreTests {
	
	public static void main(String[] args){
		
		Student student = new Student("Dario");
		
		student.addQuiz(30);
		student.addQuiz(20);
		student.addQuiz(50);
		
		String studentName = student.getName();
		
		int totalScore = student.getTotalScore();
		
		int averageScore = student.getAverageScore();
		
		System.out.println("\n" + studentName + " total score: " + totalScore);
		System.out.println("\n" + studentName + " average score: " + averageScore);
		
		System.exit(0);
		
	}
	
}
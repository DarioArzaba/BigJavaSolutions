package e_10_02_MeasurableQuizScore;

/**
 * Implement a class {@code Quiz} that implements the {@code Measurable}
 * interface. A quiz has a score and a letter grade (such as B+). Use the
 * {@code Data} class of Exercise E10.1 to process an array of quizzes.
 * Display the average score and the quiz with the highest score (both letter
 * grade and score).
 */
public class QuizDemo
{
    public static void main(String[] args)
    {
        String[] grades = {
                "A+", "A", "A-", "B+", "B", "B-",
                "C+", "C", "C-", "D+", "D", "E", "F"
        };

        Measurable[] quizzes = new Quiz[5];

        // Assign random grades to quizzes

        for (int i = 0; i < quizzes.length; i++)
        {
            int r = (int) (Math.random() * grades.length);
            quizzes[i] = new Quiz(grades[r]);
            System.out.println(quizzes[i].getMeasure());
        }

        // Compute the average score

        double averageScore = Data.average(quizzes);
        System.out.printf("%s%.2f%n", "Average score: ", averageScore);

        // Compute the quiz with the highest score

        Measurable largest = Data.max(quizzes);
        System.out.println("Largest score: " + largest.getMeasure());
        System.out.println("Largest grade: " + ((Quiz) largest).getGrade());

    }
}

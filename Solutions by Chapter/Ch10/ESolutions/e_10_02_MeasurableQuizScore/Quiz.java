package e_10_02_MeasurableQuizScore;

/**
 * Implement a class {@code Quiz} that implements the {@code Measurable}
 * interface. A quiz has a score and a letter grade (such as B+). Use the
 * {@code Data} class of Exercise E10.1 to process an array of quizzes.
 * Display the average score and the quiz with the highest score (both letter
 * grade and score).
 */
public class Quiz implements Measurable
{
    private double score;
    private String grade;

    /**
     * Constructs a quiz with letter grade.
     *
     * @param grade the letter grade
     */
    public Quiz(String grade)
    {
        this.grade = grade;
    }

    /**
     * @return the letter grade of the quiz
     */
    public String getGrade()
    {
        return grade;
    }

    @Override
    public double getMeasure()
    {
        convertToGradePoint();
        return score;
    }

    /**
     * Converts the grade into the score equivalent.
     */
    public void convertToGradePoint()
    {
        if (grade.equalsIgnoreCase("A+") || grade.equalsIgnoreCase("A"))
        {
            score = 4.0;
        }
        else if (grade.equalsIgnoreCase("A-"))
        {
            score = 3.7;
        }
        else if (grade.equalsIgnoreCase("B+"))
        {
            score = 3.3;
        }
        else if (grade.equalsIgnoreCase("B"))
        {
            score = 3.0;
        }
        else if (grade.equalsIgnoreCase("B-"))
        {
            score = 2.7;
        }
        else if (grade.equalsIgnoreCase("C+"))
        {
            score = 2.3;
        }
        else if (grade.equalsIgnoreCase("C"))
        {
            score = 2.0;
        }
        else if (grade.equalsIgnoreCase("C-"))
        {
            score = 1.7;
        }
        else if (grade.equalsIgnoreCase("D+"))
        {
            score = 1.3;
        }
        else if (grade.equalsIgnoreCase("D"))
        {
            score = 1.0;
        }
        else if (grade.equalsIgnoreCase("E") || grade.equalsIgnoreCase("F"))
        {
            score = 0;
        }
    }
}

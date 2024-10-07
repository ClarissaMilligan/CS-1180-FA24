public class MethodsSec02
{
    public static void main(String[] args)
    {
        int quizOne = 80;
        int midterm = 98;
        int quizTwo = 77;
        int totalGrade = 0;
        double averageGrade = 0.0;

        totalGrade = sum(quizOne, midterm);
        System.out.println(totalGrade);

        averageGrade = avg(quizOne, midterm, quizTwo);
        System.out.println(averageGrade);

    }

    public static int sum(int gradeOne, int gradeTwo)
    {
        int result = gradeOne + gradeTwo;
        return result;
    }

    public static double avg(int gradeOne, int gradeTwo, int gradeThree)
    {
        return ((gradeOne + gradeTwo + gradeThree) / 3.0);
    }
}

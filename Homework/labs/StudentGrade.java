// Write a grading program for an instructor whose course has the following policies:
// • Two quizzes, each graded on the basis of 10 points, are given.
// • One midterm exam and one final exam, each graded on the basis of 100 points, are given.
// • The final exam counts for 50 percent of the grade, the midterm counts for 25 percent, 
// and the two quizzes together count for a total of 25 percent. (Do not forget to normalize the quiz scores. 
// They should be converted to percentages before they are averaged in.)
// Any grade of 90 percent or more is an A, any grade between 80 and 89 percent is a B, 
// any grade between 70 and 79 percent is a C, any grade between 60 and 69 percent is a D, 
// and any grade below 60 percent is an F.
// The program should read in the student’s scores and display the student’s
// record, which consists of two quiz scores, two exam scores, the student’s total score 
// for the entire course, and the final letter grade. The total score is a number in the range 0 to 100, 
// which represents the weighted average of the student’s work.

// Remember, one method can call another method. If you prefer, you can define a single method that sets 
// both the overall numeric score and the final letter grade, but if you do this, use a helping method. 
// Your program should use all the methods described here. Your class should have a reasonable set of 
// accessor and mutator methods, whether or not your program uses them.
// You may add other methods if you wish.

import java.util.Scanner;

public class StudentGrade{
    //instance vars
    private String name;
    private int quizOne;
    private int quizTwo;
    private int midterm;
    private int finalExam;

    public void inputRecords(){
        Scanner input = new Scanner(System.in);

        System.out.println("FOLLOWING LINES, ENTER: NAME, QUIZ1, QUIZ2, MID, FINAL");     
        String    
    }

    public void createStudent(String name, int quizOne, int quizTwo, int midterm, int finalExam){
        this.name = name;
        this.quizOne = quizOne;
        this.quizTwo = quizTwo;
        this.midterm = midterm;
        this.finalExam = finalExam;

        System.out.println("RECORD FINISHED");
    }
}
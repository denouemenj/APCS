/*
 * Jiayu Li
 * 2022/02/23
 * This class takes in the academic record of a said student and calculate their final average and letter grade.
 */

import java.util.stream.DoubleStream;

public class JiayuLi_GradingCS_2022 {

    //init instance variables
    double[] quizMarks;
    double midtermMark;
    double finalExamMark;

    public JiayuLi_GradingCS_2022(double[] inQuizMarks, double inMidtermMarks, double inFinalExamMarks) {
        //constructor

        quizMarks = inQuizMarks;
        midtermMark = inMidtermMarks;
        finalExamMark = inFinalExamMarks;
    }

    public String[] gradeCalculator() {
        //grade calculator based on input

        String[] returnGrade = new String[2]; //int a string array of 2, for percentage and letter grade (decimal)
        double quizAverage = DoubleStream.of(quizMarks).sum() / 50; //find quiz average (decimal)
        double midtermAverage = midtermMark / 50; //find midterm average (decimal)
        double finalExamAverage = finalExamMark / 100; // find final exam average (decimal)

        double gradeAverage = (quizAverage * 0.5 + midtermAverage * 0.25 + finalExamAverage * 0.25) * 100; //calculate percentage average
        returnGrade[0] = Integer.toString((int) Math.round(gradeAverage)); //record rounded percentage average in returnGrade array's first slot

        if (gradeAverage >= 90) { //more or equal to 90
            returnGrade[1] = "A"; //store the the letter grade to the second slot of the returnGrade array
        } else if (gradeAverage >= 80) { //more or equal to 80 but smaller than 90
            returnGrade[1] = "B";
        } else if (gradeAverage >= 70) { //more or equal to 70 but smaller than 80
            returnGrade[1] = "C";
        } else if (gradeAverage >= 60) { //more or equal to 60 but smaller than 70
            returnGrade[1] = "D";
        } else if (gradeAverage < 60) { //less than 60
            returnGrade[1] = "F";
        }

        return returnGrade;
    }
}

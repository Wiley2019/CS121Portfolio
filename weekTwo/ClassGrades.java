package weekTwo;

import java.util.Scanner;

public class ClassGrades {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int classPercent;
        String classGrade;

        System.out.println("PLease enter the class grade: ");

        classPercent = Integer.parseInt(scn.nextLine());

        if(classPercent >= 90){
            classGrade = "A";

        } else if (classPercent > 80) {
            classGrade = "B";

        } else if (classPercent >70 ) {
            classGrade = "C";

        } else if (classPercent > 60) {
            classGrade = "D";


        }
        else{
            classGrade = "F";

        }
        System.out.printf("Your class Grade is: %s", classGrade);
        scn.close();
    }


    }

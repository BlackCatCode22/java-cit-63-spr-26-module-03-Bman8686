package mystudent;

import java.util.Scanner;

public class App {




    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

       Student myStudent = new Student();
       myStudent.firstName = "Mark";
       myStudent.lastName = "Duper";
       myStudent.major = "Wide Receiver";
       myStudent.gpa = 3.0;
       myStudent.age = 25;
       myStudent.onProbation = false;
       
       Student myStudent2 = new Student();
       myStudent2.firstName = "Keith";
       myStudent2.lastName = "Jackson";
       myStudent2.major = "Tight End";
       myStudent2.gpa = 3.2;
       myStudent2.age = 28;
       myStudent2.onProbation = true;

       System.out.println(myStudent.major);
       





              }
}
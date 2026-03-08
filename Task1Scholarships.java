package lab5tasks;

import java.util.Scanner;

public class Task1Scholarships {
    public static void main(String[] args) {

        int marks[] = new int[12];
        int sum = 0; double average = 0;
        int belowAvg = 0; int fullSch = 0; int halfSch = 0; int noSch =0; int graceMrks=0;
        Scanner input = new Scanner(System.in);

        for (int i=0; i<marks.length; i++){
            System.out.print("Enter Marks for "+(i+1)+": ");
            marks[i] = input.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input! Marks must be between 0 and 100.");
                System.out.print("Re-enter Marks for " + (i+1) + ": ");
                marks[i] = input.nextInt();
            }

            sum += marks[i];

        }

        for (int i=0; i<marks.length; i++){
            if (marks[i]<40){
                marks[i] = 40;
                graceMrks++;
            }
        }

        average = sum/marks.length;

        for (int i=0; i<marks.length; i++){

            if(marks[i]<average){
                belowAvg++;
            }

            if (marks[i]>=85){
                fullSch++;
            } else if (marks[i]>=70 && marks[i]<85) {
                halfSch++;
            } else {
                noSch++;
            }

        }

        System.out.println("\n\t**** Class Marks Report ****\n");
        System.out.println("Average Marks (after added grace marks): " + average);
        System.out.println("Number of students who scored below Average = " + belowAvg);
        System.out.println("Number of students with Full Scholarship = " + fullSch);
        System.out.println("Number of students with Half Scholarship = " + halfSch);
        System.out.println("Number of students with No Scholarship = " + noSch);
        System.out.println("Number of students with Grace Marks = " + graceMrks);


    }
}
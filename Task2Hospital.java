package lab5tasks;

import java.util.Scanner;

public class Task2Hospital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp[][] = new double[5][7];
        double average[] = new double[5];
        double sum = 0; int exceed = 0;
                int highest = 0; int replaced = 0;

        for (int i=0; i<5; i++){
            sum = 0;
            for (int j=0; j<7; j++){
                System.out.print("Enter temp for Patient "+ (i+1) + " day " + (j+1) + ": ");
                temp[i][j]=input.nextDouble();

                if(temp[i][j]>100){
                    exceed++;
                }
                if(temp[i][j]<95){
                    temp[i][j]=95;
                    replaced++;
                }

                sum+=temp[i][j];


            }

            //to checking replacing logic, working correctly currently
            System.out.print("weekly temp sum: "+ sum);
            average[i] = sum/7;
            System.out.print("weekly patient avg: "+ average[i]);
            System.out.print("\n\n");
        }

        for (int i=0; i<5; i++){
            if(average[i]>average[highest]){
                highest=i;
            }
        }

        //like .2f in C lang, java uses String.format to format the output like limiting decimal places
        //syntax example = String.format(".3f" , array[i])

        System.out.println("Highest Weekly Average = Patient " + (highest+1) + ", with avg temp of " + String.format("%.2f", average[highest]));
        System.out.println("No of times Temperature exceeded 100 = " + exceed);
        System.out.println("No of times Temperature replaced with 95 (Equipment fix)= " + replaced);


    }
}

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr no. of Subjects: ");
        int mS = sc.nextInt();
        int totalMarks = 0;
            for(int j = 1; j <= mS; j++){
                System.out.print("Enter Marks obtained (out of 100) in " +j+": ");
                int input  = sc.nextInt();
                if(input < 100){
                    totalMarks += input;
                }else{
                    System.out.println("Marks obtained should be out of 100.");
                    System.out.print("Enter Marks obtained (out of 100) in " +j+": ");
                    input =sc.nextInt(); 
                }
            } 
        double avgP = (double) totalMarks/mS;
        char Grade;
        if(avgP >= 90 && avgP <=100){
            Grade = 'O';
        } 
        else if(avgP >= 80 && avgP <=89){
            Grade = 'E';
        } 
        else if(avgP >= 70 && avgP <=79){
            Grade = 'A';
        } 
        else if(avgP >= 60 && avgP <=69){
            Grade = 'B';
        } 
        else if(avgP >= 50 && avgP <=59){
            Grade = 'C';
        } 
        else if(avgP >= 40 && avgP <=49){
            Grade = 'D';
        } 
        else{
            Grade = 'F';
        }
        System.out.println("Total marks: "+ totalMarks);
        System.out.println("Average Percantage: "+ avgP +"%");
        System.out.println("Grade: "+ Grade);
    sc.close();
    }
}
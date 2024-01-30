import java.util.Scanner;

public class J5_Calculator{
    public static void main(String[] args){
        System.out.println("Calculate Your Percentage");
        Scanner number = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i < 6; i++){
            System.out.println("Enter you marks of subject "+i);
            int marks = number.nextInt();
            if(marks > 100 || marks < 0){
                System.out.println("Marks cannot be greater than 100 or less than 0! Retry");
                i--;
            }
            else{
                sum = sum + marks;
            }
        }
        float percentage = (sum * 100) / 500;
        System.out.println("Your percentage is: "+percentage);
        number.close();
    }
}
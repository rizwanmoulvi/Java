import java.util.Scanner;

public class J4_Input{
    public static void main(String[] args){
        System.out.println("Adder");
        Scanner number = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = number.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = number.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: "+sum);
        number.close();
    }
}
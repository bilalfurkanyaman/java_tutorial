
import java.util.Scanner;

public class Main{

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Iki sayı giriniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }
}




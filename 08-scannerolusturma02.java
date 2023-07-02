
import java.util.Scanner;

public class Main{

    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ilk isminizi giriniz");
        String firstName = input.next();
        
        System.out.println("Soy isminizi giriniz");
        String lastName = input.next();
        
        System.out.print(firstName + lastName);
    }
}




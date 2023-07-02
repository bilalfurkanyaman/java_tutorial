import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Dikdortgenin kisa kenarini giriniz");
        double shortSide = input.nextDouble();
        
        System.out.println("Dikdortgenin uzun kenarini giriniz");
        double longSide = input.nextDouble();
        
        System.out.println("Alan = " + (shortSide * longSide));
        
        System.out.println("Cevre = " + (2*shortSide + 2*longSide));
        
}
}
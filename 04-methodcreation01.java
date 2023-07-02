

public class Main{
    public static void main(String[] args) {
       int sonuc = add(3, 5);
       System.out.println(sonuc);
       
       long carpmaSonuc = multiply(3, 5);
       System.out.println(carpmaSonuc);
    
    }
    
    public static int add(int a, int b){
        return a+b;
    }
    
    protected static long multiply (int a, int b){
        return a*b;
        
        
    }
}

import java.util.*;

public class Q4_largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>=b && a>=c) {
            System.out.println(a+" is largest");
        } else if(b>=c) {
            System.out.println(b+" is largest");
        } else{
            System.out.println(c+" is largest.");
        }
    }    
}

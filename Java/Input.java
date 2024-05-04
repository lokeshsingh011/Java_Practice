import java.util.Scanner;
public class Input {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer Value : ");
        int i = sc.nextInt();
        System.out.println("\nYou entered the Integer value: " + i);

        System.out.println("Enter String Value : ");
        String is = sc.next();
        System.out.println("\nYou entered the String value: " + is);
    }
    
}

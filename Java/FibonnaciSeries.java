import java.util.Scanner;
public class FibonnaciSeries {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 1;
        System.out.println("Enter the number of terms you want in the series:");
        int n = sc.nextInt();

        System.out.println("\n\nFibonacci series of "+n+" terms :-");
        System.out.println(a);
        System.out.println(b);

        for(int i=3; i<=n; i++){
            int c=a+b;
            System.out.print(c+"\n");
            a=b;
            b=c;
        }
    }
    
}

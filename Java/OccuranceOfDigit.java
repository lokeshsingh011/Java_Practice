import java.util.Scanner;
public class OccuranceOfDigit {

    public static void main(String arga[]){

        Scanner sc = new Scanner(System.in);

        int c = 0;
        System.out.println("Enter a number :");
        long n =sc.nextLong();

        long t=n;

        System.out.println("You want to know the occurance of which digit :");
        int a = sc.nextInt();

        while(n>0){
            long r = n%10;
            if(r==a){
                c++;
            }
            n/=10;
        }

        System.out.println(a+" has occured "+c+" times in the number "+t);


    }
    
}

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any year to check if it is a Leap year or not : ");

        int year = sc.nextInt();

        if( (year%4==0 && year%100!=0) || year%400==0 ){
            System.out.println(year + " ia a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
    
}

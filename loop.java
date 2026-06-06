
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        //  System.out.println("enter terminating number");
        //  int sum=0;
        Scanner sc = new Scanner(System.in);
        // int num=sc.nextInt();
        // int i=0;
        // while(i<=num){
        //     sum+=i;
        //     System.out.print("+"+sum);
        //     i++;
        // }
         int number;
 int choice;
 int evenSum = 0;
 int oddSum = 0;
 do {
 System.out.print("Enter the number ");
 number = sc.nextInt();
 if( number % 2 == 0) {
 evenSum += number;
 } else {
 oddSum += number;
 }
 System.out.print("Do you want to continue? Press 1 for yes or 0 forno");
 choice = sc.nextInt();
 } while(choice==1);
 System.out.println("Sum of even numbers: " + evenSum);
 System.out.println("Sum of odd numbers: " + oddSum);

//  int n=10899;
//  int rev=0;
//  while(n>0){
//     int last_digit=n%10;
//     rev=rev*10+last_digit;
//     // System.out.println(rev);
//     n=n/10;
//  }
//    System.out.println(rev);

    }
    
}

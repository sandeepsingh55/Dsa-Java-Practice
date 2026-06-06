import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  System.out.println("enter income");
        // int income=sc.nextInt();
        // // System.out.println("age of candidate is "+(age));
        // // if(age>=18){
        // //     System.out.println("he is adult  can vote");
        // // }
        // // else{
        // //     System.out.println("he can't vote");

        // // }
        // if(income<500000){
        //     System.out.println("he will not give tax");

        // }
        // else if(income>=50000 && income<=1000000){
        //     double tax=income*(0.20);
        //     System.out.println("tax paid "+(tax));
        //  }
        //  else{
        //     double tax=income*(0.30);
        //     System.out.println("tax paid"+(tax));
        //  }

        System.out.println("enter two number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter operator");
        char operator =sc.next().charAt(0);
   
        // if(a>b && a>c){
        //     System.out.println("a is gretest"+a);
        // }
        // else if(b>a && b>c){
        //     System.out.println("b is greatest"+b);
        // }
        // else{
        //     System.out.println("c is greatest"+c);
        // }
        switch (operator) {
            case '+': System.out.println("sum of number is "+(a+b));
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            default:System.out.println("invalid operator");  
                
        }


    }
}

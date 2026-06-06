

public class fun {
    // public static int multip(int a ,int b){
    //     return a*b;
    // }
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int binomial(int n, int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_r_fact=factorial(n-r);

        int binomial=n_fact /(r_fact* n_r_fact);
        return binomial;
    }
    public static boolean  isprime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
           
        }
        return true;
    } 

public static void binTOdec(int bin){
    int pow=0;
    int dec=0;
    while(bin>0){
        int last_digit=bin%10;
        dec=dec+last_digit*(int)Math.pow(2,pow);
        pow++;
        bin=bin/10;

    }
    System.out.println("decimal number is "+bin +" ="+dec );
}

public static void decTobin(int n){
    int bin=0;
    int pow=0;
    while(n>0){
        int rem=n%2;
        bin=bin+rem*(int)(Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    System.out.println("binary number of = "+bin);
}

    public static void main(String args[]){
        // System.out.println("enter two number ");
        // Scanner s =new Scanner(System.in);
        // int a= s.nextInt();
        // int b=s.nextInt();
        // int m=multip(a,b);
        // System.out.println("multipicatuon" + m);
        System.out.println(factorial(5));
        int result=binomial(5, 2);
        System.out.println(result);
        System.out.println(isprime(5));
        binTOdec(1001);
        decTobin(7);
        decTobin(9);
        
    }
    
}

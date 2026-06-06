
public class sumofevenOdd{
    public static void main(String[] args) {
    int num=5;
    int even_sum=0;
    int odd_sum=0;

    for(int i=0;i<=num;i++){
        if(i%2==0){
            even_sum+=i;
        }
        else{
            odd_sum+=i;
        }
    }
    System.out.println(even_sum);
    System.out.println(odd_sum);


    }
}
import java.util.Scanner;

public class FibonacciNumbers {
    public void fibonacci(int n1,int n2){
        if(n2>100){
            return;
        }else{
            System.out.println(n1);
            fibonacci(n2,n2+n1);
        }
    }
    public static void main(String[] args){
        FibonacciNumbers fibo=new FibonacciNumbers();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number from where you " +
                "want to start the fibbonaci series");
        int n=input.nextInt();
        fibo.fibonacci(n,n+1);
    }
}

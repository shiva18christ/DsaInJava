import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to check if it is prime or not");
        int number=input.nextInt();
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                System.out.println("Not prime");
                break;
            } else if (number%i!=0) {
                System.out.println("prime");
                break;



            }

            }
        }
    }


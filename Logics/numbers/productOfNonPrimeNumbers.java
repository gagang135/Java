// write a program to find the product of of only non prime digits of number
import java.util.Scanner;
class sumOfPrimeDigitsOfaNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number:");

        int n = sc.nextInt();
        int copy = n;
        int pro = 1;

        while(n != 0){

            int rem = n % 10;

            if(rem > 1){   

                boolean isPrime = true;

                for(int i = 2; i <= Math.sqrt(rem); i++){
                    if(rem % i == 0){
                        pro*=rem;
                        break;
                    }
                }

                
            }

            n /= 10;
        }

        System.out.println("product of non prime digits of the number " + copy + " is: " + pro);
    }
}
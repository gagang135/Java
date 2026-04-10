// write a program to find the sum of prime digits in a given number
import java.util.Scanner;

class sumOfPrimeDigitsOfaNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number:");

        int n = sc.nextInt();
        int copy = n;
        int sum = 0;

        while(n != 0){

            int rem = n % 10;

            if(rem > 1){   

                boolean isPrime = true;

                for(int i = 2; i <= Math.sqrt(rem); i++){
                    if(rem % i == 0){
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    sum += rem;
                }
            }

            n /= 10;
        }

        System.out.println("sum of prime digits of the number " + copy + " is " + sum);
    }
}
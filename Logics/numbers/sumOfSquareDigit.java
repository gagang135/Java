
import java.util.Scanner;

//write a prpgram to print the sum of square of each number
class sumOfSquareDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int sum=0,copy=n;
        while(n!=0){
            int rem=n%10;
            sum+=Math.pow(rem,2);
            n/=10;
        }
        System.out.println("sum of square of "+copy+" is "+sum);
    }
}
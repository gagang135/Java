//write a program to print sum and product of each digit of a number
import java.util.Scanner;
class sumOfEachNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int copy=n;
        int sum=0;
        int pro=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n/=10;
        }
        System.err.println("the sum of "+copy+ " is "+sum);
        System.err.println("the product of "+copy+ " is "+pro);


    }
}



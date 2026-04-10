// write a program to find the 1st largest value in the given number
import java.util.Scanner;
class largestvalueInNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int copy=n, large=0;
        while(n!=0){
            int rem=n%10;
            if(rem > large){
                large=rem;
            }
            n/=10;
        }
        System.out.println("Largest value in the number "+copy+" is: "+large);
    }
}
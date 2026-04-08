//write a program to check whether the given number is palindrome or not 
import java.util.Scanner;
class palindroemNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int copy=n,rev=0;
        while(n!=0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;

        }
        if(rev==copy){
            System.out.println("the number "+copy+" is palindrome");
        }else{
            System.out.println("the number "+copy+" is not palindrome");
        }
    }
}
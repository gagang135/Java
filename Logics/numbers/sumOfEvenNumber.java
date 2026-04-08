//write a program to print the sum and product of evendigits of a number
import java.util.Scanner;
class sumOfEvenNumber{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    int sum=0, pro =1, copy=n;
    
    while(n!=0){
        int rem=n%10;
        if(rem%2==0){
            sum+=rem;
            pro*=rem;
        }
        n/=10;
    }
    System.out.println("the sum of "+copy+" is "+sum);
    System.out.println("the product of "+copy+" is "+pro);
}
}

//write a program to sum of each digit and sum of square of number till get a single digit
import java.util.Scanner;
class sumOfSquareDigitTillGetSingleDigit{
    public int sum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

public int square(int n){
    int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=(rem*rem);
            n/=10;
        }
        return sum;
    }


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    sumOfSquareDigitTillGetSingleDigit s1=new sumOfSquareDigitTillGetSingleDigit();
System.out.println("enter a number:");
    int no=sc.nextInt();
    int copy=no,copy2=no;
    
    while(no>9){
        no=s1.sum(no);
        copy=s1.square(copy);
    }
    System.out.println("the sum of "+copy2+" is "+no);
    System.out.println("the sum of square of "+copy2+" is "+no);

}
}

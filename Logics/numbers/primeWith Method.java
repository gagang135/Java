//write a program to check whether the given number is prime or not using method with return type
import java.util.Scanner;
class primeWithMethod{
static boolean isPrime(int n){
    boolean f=false;
    if(n<=1){
        f=false;
    }
    else{
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                f=false;
                break;
            }else{
               f= true;
            }
        }
    }
    return f;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int no=sc.nextInt();
    
    System.out.println(isPrime(no)? no+" is a palindrome":no+ " is not a palindrome");
}
}
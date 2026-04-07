//write a program to find the given number is prime or not
import java.util.Scanner;
// import java.lang.Math;
class prime{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    boolean f=false;
    if(n<=1){
        f=false;
    }
    else{
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                f= false;
            }
            else{
                f=true;
            }
        }
    }
    if(f){
        System.out.println(n+" is prime number.");
    }else{
         System.out.println(n+" is not a prime number.");
    }
}
}
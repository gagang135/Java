//write a program to check whether the given number is armstrong or not

//it is a number which is equal to the sum of its number raised to the power of the number count is called as armstrong number
import java.util.Scanner;
class armStrongNumber{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    int copy=n, no=n, sum=0, count=0;
    while(n!=0){
        count++;
        n/=10;
    }
    while(no!=0){
        int rem=no%10;
        sum+=Math.pow(rem,count);
        no/=10;
    }
    if(sum==copy){
        System.out.println(copy+" is an armstrong number");
    }else{
        System.out.println(copy+" is not an armstrong number");
    }

}
}
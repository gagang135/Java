//write a program to check whether the given number is disarium number or not
//disarium: it is a number which is equal to the sum of its own number raised to the power of its own position
import java.util.Scanner;
class disariumNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int no=n, copy=n;
        int count=0,sum=0;
        while(n!=0){
            count++;
            n/=10;
        } 
        while(no!=0){
            int rem=no%10;
            sum+=Math.pow(rem,count);
            count--;
            no/=10;
        }
        if(sum==copy){
            System.out.println(copy+" is a disarium number");
        }else{
            System.out.println(copy+" is not a disarium number");
        }

    }
}
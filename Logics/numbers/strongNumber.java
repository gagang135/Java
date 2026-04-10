// write a program to check whether the given number is strong number or not

//if sum of factorial of each number is equal to its original number then its called as strong number
import java.util.Scanner;
class strongNumber{
    public static int fact(int no){
        int fact=1;
        if(no == 0 || no == 1){
            return 1;
        }
        else{
            for(int i=no;i>=1;i--){
                fact*=i;
            }
        }return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int sum=0, copy=n;
        while(n!=0){
            int rem=n%10;
            sum+=fact(rem);
            n/=10;
        }
        if(sum==copy){
            System.out.println(copy+" is a strong number");
        }else{
            System.out.println(copy+" is not a strong number");
        }
    }
}
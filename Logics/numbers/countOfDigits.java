//write a program to count the each digit, count the even number and count the odd number
import java.util.Scanner;
class countOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int count=0,countE=0,countO=0,copy=n;
        while(n!=0){
            int rem=n%10;
            count++;
            if(rem%2==0){
                countE++;
            }
            if(rem%2!=0){
                countO++;
            }
            n/=10;
        }
        System.out.println("count of number"+copy+" is:"+count);
        System.out.println("count of even number"+copy+" is: "+countE);
        System.out.println("count of odd number"+copy+" is: "+countO);
    }
}
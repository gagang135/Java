//write a program to reverse the give number
import java.util.Scanner;
class reverseNumber{
    public int rev(int n){
        int rev=0;
        while(n!=0){
            int r=n%10;
            rev=(rev*10)+r;
            n/=10;
        }
        return rev;
    }
    public String rev2(int n1){
        String rev="";
        while(n1!=0){
            int rem=n1%10;
            rev+=rem;
            n1/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        reverseNumber r=new reverseNumber();
        System.out.println("enter the number:");
        int no=sc.nextInt();
        System.out.println("reversed number using number ");
        System.out.println("the reverse order of the number "+no+" is "+r.rev(no));
        System.out.println("\n reversed number using string method ");
        System.out.println("the reverse order of the number "+no+" is "+r.rev2(no));


    }

}
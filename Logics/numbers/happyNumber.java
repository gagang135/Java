//write a program to check whether the given number is happy number or not
//which is equal to to the sum of square of each number till get single digit and the number if its equal to 1 or 7 then it is called happy number

import java.util.Scanner;
public class happyNumber{
    public static int sum(int no){
        int sum=0;
        while(no!=0){
            int r=no%10;
            sum+=(r*r);
            no/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int copy=n;
        while(n>9){
            n=sum(n);
        }
        if(n==1 || n==7){
            System.out.println(copy+" is a happy number.");
        }else{
            System.out.println(copy+" is not a happy number.");
        }

    }
    }

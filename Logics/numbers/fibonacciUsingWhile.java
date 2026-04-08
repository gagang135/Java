//write a program to print fibonacci series using while loop

import java.util.Scanner;
class fibonacciUsingWhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int f1=0,f2=1,f3=0,i=0;
        System.out.println("Enter teh range of series:");
        int range=sc.nextInt();
        System.out.print("fibonacci seires:\n"+f1+" "+f2);
        while(i<range){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
            i++;
        }
    }
}
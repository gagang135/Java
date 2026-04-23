//write a program to print the numbers for given range without using any looping statements

//a method calling itself again and again for defined number of cycles is called recursion

import java.util.Scanner;
class printNumberswithoutUsingLoop{

    static void disp(int first, int last){
        if(first<=last){
            System.out.print(first+" ");
            first++;
            disp(first, last);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int first=sc.nextInt();
        System.out.println("enter the last number: ");
        int last=sc.nextInt();
        disp(first, last);
        

    }
}
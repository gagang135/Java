//write a program to swap two strings without using any third variables


import java.util.Scanner;
class swapTwoStringWithoutUsingThirdvariable{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first string");
        String s1=sc.next();
        System.out.println("enter a second string");
        String s2=sc.next();
        System.out.println("Strings before reverse");
        System.out.println(s1+" "+s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println("Strings after reverse:");
        System.out.println(s1+" "+s2);
    }
}
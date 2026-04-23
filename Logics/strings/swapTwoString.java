//write a program to swap two string with using third variable


import java.util.Scanner;
class swapTwoString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first string");
        String s1=sc.next();
        System.out.println("enter a second string");
        String s2=sc.next();
        System.out.println("strings before reverse:");
        System.out.println(s1+" "+s2);
        String temp=s1;
        s1=s2;
        s2=temp;
        System.out.println("Strings after reverse:");
        System.out.println(s1+" "+s2);
    }
}
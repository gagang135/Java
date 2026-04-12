//write a program to reverse a given string
import  java.util.Scanner;
class reverseAString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to reverse:");
        String str=sc.next();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        System.out.println("reversed String is:  "+res);
    }
}
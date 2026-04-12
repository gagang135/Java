//write a program to reverse a sentence

import java.util.Scanner;

class reverseASentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String ch[]=str.split(" ");
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]+" ");
        }
    }
}
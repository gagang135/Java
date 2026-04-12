//write a program to check whether the given string is palindrome or not 
import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to check the palindrome");
        String str=sc.next();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res+=str.charAt(i);
        }
        if(str.equals(res)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");

        }
    }
}
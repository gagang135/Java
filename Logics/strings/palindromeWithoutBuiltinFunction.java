//write a program to check  whether the given string is palindrome or not without using builtin function (charAt function)


import java.util.Scanner;
class palindromeWithoutBuiltinFunction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        char[] ch=str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<j){
            if(ch[i]!=ch[j]){
                System.out.println(str+ " is not a palindrome.");
                return;
            }
            i++;
            j--;
        }
        
                System.out.println(str+" is a palindrome.");
            

    }
}
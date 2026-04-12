//write a program to check whether the given string is anagram or not
//if two string contains same characters irrespective of thier position then it is called as anagram
import java.util.Arrays;
import java.util.Scanner;
class anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first strig");
        String s1=sc.next();
        System.out.println("enter a second strig");
        String s2=sc.next();
        if(s1.length()==s2.length()){
            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                System.out.println("Anagram");
            }else{
                System.out.println("not an anagram");
            }
        }else{
            System.out.println("not an anagram");
        }
    }
}
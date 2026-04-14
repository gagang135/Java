//write a program to find the given string is panagram or not
// panagram:- it is a string which cntains all the 26 alphabetic letters atleast once [it must contains all 26 characters of english alphabets]
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class panagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence:");
        String str=sc.nextLine();
        String s=str.replaceAll(" ", "");
        char[] ch=s.toCharArray();
        Set s1=new TreeSet();

        for(char x:ch){
            s1.add(x);

        }
        System.err.println(s1);
        if(s1.size()==26){
            System.out.println("the given String '"+str+"' is a panagram");
        }else{
            System.out.println("the given String '"+str+"' is not a panagram");

        }

    }
}
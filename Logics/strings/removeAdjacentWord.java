// write a program to remove adjacent word in a given sentence
import java.util.Scanner;
class removeAdjacentWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String str=sc.nextLine();
        String s[]=str.split(" ");
        for(int i=0;i<s.length-1;i++){
            if(!s[i].equals(s[i+1])){
                System.out.print(s[i]+" ");
            }
           
        }
         System.out.println(s[s.length-1]);
    }
}
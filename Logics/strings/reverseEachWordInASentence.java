//write a program to reverse a each word in a given sentence
import java.util.Scanner;
class reverseEachWordInASentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String str=sc.nextLine();
        String ch[]=str.split(" ");

        for(int i=0;i<ch.length;i++){
            for(int j=ch[i].length()-1;j>=0;j--){
                System.out.print(ch[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
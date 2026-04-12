//write a program to find the frequency of letters in a given string
import java.util.Scanner;
class FrequencyOfLetters{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        int[] arr=new int[127];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            arr[ch]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                System.out.println((char)i+" "+arr[i]);
            }
        }
    }
}
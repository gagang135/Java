// write a program to remove adjacent repeated cahracters

import java.util.Scanner;
class removeAdjusantChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String str=sc.next();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]){
                System.out.print(ch[i]+" ");
            }
    
        }
        System.out.println(ch[ch.length-1]);
    }
}
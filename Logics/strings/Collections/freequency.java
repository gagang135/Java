// write a program to find the frequency of letters, strings and number arrays

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


class frequency{
 void character(String str){
    char[] ch=str.toCharArray();
    Map<Character, Integer> m1=new LinkedHashMap();
    for(char x:ch){
        m1.put(x,m1.getOrDefault(x,0)+1);
        
    }
    System.out.println("frequency of characters for the string "+str+" is ");
    m1.forEach((k,v)->{
        System.out.println(k+" : "+v);
    });
 }
 void strings(String str){
    String[] ch=str.split(" ");
    Map<String, Integer> m1=new LinkedHashMap();
    for(String x:ch){
        m1.put(x,m1.getOrDefault(x,0)+1);
        
    }
    System.out.println("frequency of characters for the string "+str+" is ");
    m1.forEach((k,v)->{
        System.out.println(k+" : "+v);
    });
 }
 
 void arrays(int arr[]){
    Map<Integer, Integer> m1=new LinkedHashMap();
    for(int x:arr){
        m1.put(x,m1.getOrDefault(x,0)+1);
        
    }
        System.out.println("frequency of characters for the string "+arr+" is ");

    m1.forEach((k,v)->{
        System.out.println(k+" : "+v);
    });
 
 }
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     frequency f1=new frequency();
     System.out.println("enter an option \n 1. Character \n 2. Strings \n 3.Number Array");
        int n=sc.nextInt();
        sc.nextLine();
        if(n==1){
            System.out.println("enter a character set");
            String srt=sc.next();
            f1.character(srt);
        }else if(n==2){
            System.out.println("enter a sentence");
            String srt=sc.nextLine();
            f1.strings(srt);
        }else if(n==3){
            System.out.println("enter a length of an array");
            int no=sc.nextInt();
            System.out.println("Enter a array elements");
            int a[]=new int[no];
            for (int i = 0; i < no; i++) {
                a[i]=sc.nextInt();
            }
            f1.arrays(a);
        }

 }
}
// write a program to print the unique values in cahr, string and number array
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class printDuplicateValues{
 void character(String str){
    char[] ch=str.toCharArray();
    Map<Character, Integer> m1=new LinkedHashMap();
    for(char x: ch){
        m1.put(x, m1.getOrDefault(x,0)+1);

    }
    System.out.println("duplicated characters are with count:");
    m1.forEach((k,v)->{
        if(v==1)
        System.out.println(k+" "+v);
    });
 }

 void strings(String str){
    String[] ch=str.split(" ");
    Map<String, Integer> m1=new LinkedHashMap();
    for(String x: ch){
        m1.put(x, m1.getOrDefault(x,0)+1);

    }
    System.out.println("duplicated characters are with count:");
    m1.forEach((k,v)->{
        if(v==1)
        System.out.println(k+" "+v);
    });
 }

 void arrays(int arr[]){
    Map<Integer, Integer> m1=new LinkedHashMap();
    for(int x: arr){
        m1.put(x, m1.getOrDefault(x,0)+1);

    }
    System.out.println("duplicated characters are with count:");
    m1.forEach((k,v)->{
        if(v==1)
        System.out.println(k+" "+v);
    });
 }

 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        printDuplicateValues r1=new printDuplicateValues();
        System.out.println("enter an option \n 1. Character \n 2. Strings \n 3.Number Array");
        int n=sc.nextInt();
        sc.nextLine();
        if(n==1){
            System.out.println("enter a character set");
            String srt=sc.next();
            r1.character(srt);
        }else if(n==2){
            System.out.println("enter a sentence");
            String srt=sc.nextLine();
            r1.strings(srt);
        }else if(n==3){
            System.out.println("enter a length of an array");
            int no=sc.nextInt();
            System.out.println("Enter a array elements");
            int a[]=new int[no];
            for (int i = 0; i < no; i++) {
                a[i]=sc.nextInt();
            }
            r1.arrays(a);
        }

    }
}
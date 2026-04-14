// write a program to remove the duplicate values in characters, strings and number array

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
class removeDuplicate{
    void character(String str){
        char[] ch=str.toCharArray();
        Set s1=new LinkedHashSet();
        for(char x: ch){
            s1.add(x);
        }
        System.out.println("the final result after removing the duplicate characters:"+s1);
    }

    void strings(String str){
        String[] ch=str.split(" ");
        Set s1=new LinkedHashSet();
        for( String x: ch){
            s1.add(x);
        }
                System.out.println("the final result after removing the duplicate Strings:"+s1);
    }

    void arrays(int arr[]){
        Set s1=new LinkedHashSet();
        for( int x: arr){
            s1.add(x);
        }
                System.out.println("the final result after removing the duplicate elements in an array:"+s1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        removeDuplicate r1=new removeDuplicate();
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
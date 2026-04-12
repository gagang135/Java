//write a program to reverse a string without using builtin function (charAt function)


import java.util.Scanner;
class reverseAStringWithoutUsingBuiltInFunction{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
    String str=sc.next();
    char[] ch=str.toCharArray();
    int i=0,j=str.length()-1;
    while(i<j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        i++;
        j--;
    }
   for(int k=0;k<ch.length;k++){
     System.out.print(ch[k]);
   
   }
   }
}
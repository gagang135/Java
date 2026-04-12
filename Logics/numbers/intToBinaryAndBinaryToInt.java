//write a program to convert integer to binary number and binary number to integer

import java.util.Scanner;
class intToBinaryAndBinaryToInt{
    String intToBinary(int no){
        String res="";
        while(no!=0){
            int rem=no%2;
            res=rem+res;
            no=no/2;
        }
        return res;
    }
int binaryToInt(String no){
    int s=0;
    for(int i=0;i<no.length();i++){
        char ch = no.charAt(i);
        s=(s*2)+(ch-'0');
    }
    return s;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    intToBinaryAndBinaryToInt s1=new intToBinaryAndBinaryToInt();
    System.out.println("choose a option: \n 1. integer to binary convertion. \n 2. binary to integer convertion");
    int n=sc.nextInt();
    if(n==1){
        System.out.println("enter a number to convert from integer to binary");
        int number=sc.nextInt();
        String res=s1.intToBinary(number);
        System.out.println(number+"'s binary value is "+res);
    }else{
        System.out.println("enter a binary digits to convert from binary to integer");
        String binary=sc.next();
        int res=s1.binaryToInt(binary);
        System.out.println(binary+" this bainary's number is "+res);
    }

}

}
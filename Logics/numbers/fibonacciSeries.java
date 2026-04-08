//write a program to print fibonacci series
import java.util.Scanner;
class fibonacciSeries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh range of series:");
        int f1=0,f2=1,f3=0;
        int range=sc.nextInt();
        System.out.print("fibonacci series" +"\n"+f1+" "+f2);
        for(int i=2;i<range;i++){
            f3=f1+f2;
            System.out.print(" "+f3);
            f1=f2;
            f2=f3;
        }
    }
}
// write a program to check whether the given array is palindrome or not
import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enetr the array element");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                System.out.println(arr[i]+" not palindrome");
                return;
            }
            i++;
            j--;
        }System.out.println("palindrome");
    }
}
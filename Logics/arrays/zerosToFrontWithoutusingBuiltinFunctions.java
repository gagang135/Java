//write a program to move all zeros to front without using any builtin functions
import java.util.Arrays;
import java.util.Scanner;
class zerosToFrontWithoutusingBuiltinFunctions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }else if(arr[j]!=0){
                j--;
            }else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
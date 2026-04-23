// write a program to print the second min and max elements of an array


import java.util.Scanner;

class secondMinAndMax{
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0], max=arr[0];
        int smin=Integer.MAX_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax){
                smax=arr[i];
            }
            
            if(arr[i]<min){
                smin=min;
                min=arr[i];
            }else if(arr[i]<smin){
                smin=arr[i];
            }
        }
        System.out.println("second maximum value is:"+smax);
        System.out.println("second minimum value is:"+smin);


}
}
// write a program to print the third minimum and maximum value in a given array


import java.util.Scanner;
class thirdMinAndMax{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of an array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the array elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    int smin=Integer.MAX_VALUE;
    int tmin=Integer.MAX_VALUE;
    int smax=Integer.MIN_VALUE;
    int tmax=Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
        if(arr[i]>max){
                tmax=smax;
                smax=max;
                max=arr[i];

            }else if(arr[i]>smax){
                tmax=smax;
                smax=arr[i];
            }else if(arr[i]>tmax){
                tmax=arr[i];
            }
            
            if(arr[i]<min){
                tmin=smin;
                smin=min;
                min=arr[i];
            }else if(arr[i]<smin){
                tmin=smin;
                smin=arr[i];
            }else if(arr[i]<tmin){
                tmin=arr[i];
            }

    }
     System.out.println("third maximum value is:"+tmax);
        System.out.println("third minimum value is:"+tmin);

}
}
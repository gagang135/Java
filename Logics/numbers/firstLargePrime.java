//write a program  to print first large prime number in given array
import java.util.Scanner;
class firstLargePrime{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    
    System.err.println("Enter the length of an array:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int large=0;
        int arr[]=new int[no];
        System.err.println("Enter the array elements");
        for (int i = 0; i < no; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
             if(arr[i]>large && isPrime(arr[i])){
                large=arr[i];
                
            }
        }
        System.out.println(large+" is a large prime number.");


}
}
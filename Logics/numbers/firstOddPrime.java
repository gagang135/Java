//write a program to print first odd prime number
import java.util.Scanner;
class firstOddPrime{
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
        Scanner sc= new Scanner(System.in);
        System.err.println("enther array length");
        int no=sc.nextInt();
        System.err.println("Enter array elements:");
        int arr[]=new int[no];
        for (int i = 0; i < no; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<no;i++){
            if(isPrime(arr[i]) && arr[i]%2!=0){
            System.err.println(arr[i]+" is the odd prime number");
            }
            else{
                System.out.println(arr[i]+" is not a odd prime number");
            }
        }

    }
}
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrongNum(n));
    }

        static boolean armstrongNum(int n){
           int original= n;
           int sum=0;
           while(n!=0){


                int rem=n%10;
                sum+=rem*rem*rem;
                n=n/10;
           }
           return sum==original;
        }
    }


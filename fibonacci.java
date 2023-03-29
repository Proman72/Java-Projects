import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci series");
        System.out.print("Enter number of times: ");
        int n = sc.nextInt();
        int a = 0,b = 1, val;
        for (int i = 0;i <= n; i++){
            System.out.print(a+" ");
            val = a + b;
            a = b;
            b = val;
        }
    }
}

import java.util.Scanner;

public class amicable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int val = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            if(i < n){
                if(n % i == 0){
                    val += i;
                }else{
                    continue;
                }
            } else if (i == n) {
                System.out.println("The amicable number of "+n+" is "+val);
                break;
            }
        }
    }
}

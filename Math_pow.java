import java.util.Scanner;

public class Math {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Power finding without Math.pow()");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter the power: ");
        int pow = sc.nextInt();
        int val = n;
        for (int i = 1; i <= pow; i++){
            if(i < pow){
                val *= n;
            }else{
                System.out.println("The value of "+n+" to the power of "+pow+" is "+val);
            }
        }
    }
}

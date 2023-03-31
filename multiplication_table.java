import java.util.Scanner;

public class table {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mathematical multiplication table");
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int columns = sc.nextInt();
        for (int i = 1; i < rows;i++){
            for (int n = 9; n < columns;n++){
                System.out.print(i*n+" ");
            }
            System.out.print("\n");
        }
    }
}

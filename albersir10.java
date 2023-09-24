import java.util.Scanner;

public class albersir10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a positive nonzero integer: ");
        int num = input.nextInt();

       
        if (num <= 0) {
            System.out.println("Please enter a positive nonzero integer.");
        } else {
        
            int sum = 0;

        
            for (int i = 1; i <= num; i++) {
                sum += i;
            }

            System.out.println("The sum of integers from 1 to " + num + " is: " + sum);
        }

        input.close();
    }
}

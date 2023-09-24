// 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:

// *

// **

// ***

// ****

// *****

// Use a nested for loop to generate the above pattern.

import java.util.Scanner;

public class albertsir6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the numbers of star you want to form: ");
        int star =input.nextInt();
        for(int i=1; i<=star; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        input.close();
    }
}

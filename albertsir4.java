// 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:

// *****

// *****

// *****

// *****

// *****

import java.util.Scanner;

public class albertsir4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width= input.nextInt();
        for(int i=1; i<=width; i++){
            System.out.println("******");
        }
        input.close();
    }
}

// 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.

import java.util.Scanner;

public class albertsir8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with at least two digits: ");
        int number = input.nextInt();

        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10; 
        }

        System.out.println("Reversed number: " + reversedNumber);
        
        input.close();
    }
}


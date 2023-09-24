// 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.

import java.util.Scanner;

public class albertsir1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= input.next();
        for (int i=1; i<=5; i++){
            System.out.println("Hello your name is "+name);
        }
        
        input.close();
    }
    
}

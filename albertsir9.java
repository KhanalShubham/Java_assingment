import java.util.Scanner;

public class albertsir9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalNumbers = 10;
        int greaterThan50Count = 0;
        int lessThan50Count = 0;
        int equalTo50Count = 0;
        int sumGreaterThan50 = 0;
        int sumLessThan50 = 0;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            if (num > 50) {
                greaterThan50Count++;
                sumGreaterThan50 += num;
            } else if (num < 50) {
                lessThan50Count++;
                sumLessThan50 += num;
            } else {
                equalTo50Count++;
            }
        }

        input.close();

        System.out.println("Numbers greater than 50: " + greaterThan50Count);
        System.out.println("Numbers less than 50: " + lessThan50Count);
        System.out.println("Numbers equal to 50: " + equalTo50Count);

        if (greaterThan50Count > 0) {
            double averageGreaterThan50 = (double) sumGreaterThan50 / greaterThan50Count;
            System.out.println("Average of numbers greater than 50: " + averageGreaterThan50);
        } else {
            System.out.println("No numbers greater than 50 entered.");
        }

        if (lessThan50Count > 0) {
            double averageLessThan50 = (double) sumLessThan50 / lessThan50Count;
            System.out.println("Average of numbers less than 50: " + averageLessThan50);
        } else {
            System.out.println("No numbers less than 50 entered.");
        }
    }
}

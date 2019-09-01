import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        if(isDivisibleBy4){
            if(isDivisibleBy100){
                if(isDivisibleBy400){

                    isLeapYear = true;

                } else {

                    isLeapYear = false;

                }
            } else {

                isLeapYear = true;

            }
        }

        if(isLeapYear){
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " is not leap year!");
        }
    }
}

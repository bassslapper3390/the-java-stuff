package Loops;

import java.util.Scanner;

public class switchcase {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1-7: ");
        int n = sc.nextInt();
        sc.close();
        switch(n){
            case 1:
            System.out.println("Monday");
            case 2:
            System.out.println("Tuesday");
            case 3:
            System.out.println("Wednesday");
            case 4:
            System.out.println("Thursday");
            case 5:
            System.out.println("Friday");
            case 6:
            System.out.println("Saturday");
            case 7:
            System.out.println("Sunday");
        }

    }
    
}

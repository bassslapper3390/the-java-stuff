package Loops;

import java.util.*; 

public class switchcase {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1-7: ");
        int n = sc.nextInt();
        sc.close();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday"); 
                break;
            default:
                System.out.println("Enter a valid number!!");
            
        }

    }
    
}

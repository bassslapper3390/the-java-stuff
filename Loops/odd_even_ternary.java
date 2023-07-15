package Loops;
/* program to check for odd even number 
 */
import java.util.*; 
public class odd_even_ternary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");  
        int a= sc.nextInt(); 
        String result="";
        result= a%2==0? "This is an even number": "This is a odd number";
        System.out.println(result);
        sc.close();
    }
}
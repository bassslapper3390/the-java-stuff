import java.util.*; 
public class demoloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");  
        int a= sc.nextInt(); 
        if(a%2==0)
        System.out.println("This is an even number");
        else if(a==0)
        System.out.println("This is a zero");
        else
        System.out.println("This is an odd number");
        sc.close();
    }
}
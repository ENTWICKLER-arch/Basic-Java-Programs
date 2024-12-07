// taking two numbers as input from user and add them
import java.util.*;
public class UserInput {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 , num2, result ;
        System.out.print("Enter Number 1 = ");
        num1 = sc.nextInt();
        System.out.print("Enter Number 2 =");
        num2=sc.nextInt();
        result= num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" numbers is = "+result);
        sc.close();
    }
    
}

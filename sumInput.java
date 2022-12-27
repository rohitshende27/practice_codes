package techmPractice;
import java.util.Scanner;
public class sumInput {
    public static void main(String[] args) {
        System.out.println("Enter first no");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second no");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is :"+sum);
        System.out.print("The no is integer or not  :");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
        //check boolean or not
    }
}

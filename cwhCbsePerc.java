package techmPractice;
import java.util.Scanner;
public class cwhCbsePerc {
    public static void main(String[] args) {
        int sum = 0;
        int perc;
        for ( int i=1; i < 6; i++)
        {
            System.out.print("Enter marks of subject "+i+" :");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            sum = sum + a;
        }
        perc = sum / 5;
        System.out.println("The percentage of marks is :"+ perc+"%");
    }
}

import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of sub1:");
        float sub1 = sc.nextFloat();
        System.out.println("Enter marks of sub2:");
        float sub2 = sc.nextFloat();
        System.out.println("Enter marks of sub3:");
        float sub3 = sc.nextFloat();
        System.out.println("Enter marks of sub4:");
        float sub4 = sc.nextFloat();
        System.out.println("Enter marks of sub5:");
        float sub5 = sc.nextFloat();

        float percentage = (sub1+sub2+sub3+sub4+sub5)/500 *100;
        System.out.println("The total percentage of atudent is:"+ percentage );
    }
}

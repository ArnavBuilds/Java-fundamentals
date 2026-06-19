
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= sc.nextInt();

        System.out.println("Enter your cgpa:");
        double cgpa=sc.nextDouble();

        System.out.println("Enter active backlogs:");
        int backlog=sc.nextInt();

        System.out.println("Analyzing..");

        if (age>=18 && cgpa>7 && backlog==0){
            System.out.println("You are elgible for most of the companies 😏");
        }
        else if (age>=18 && (cgpa >=6.0 && cgpa<=7) && backlog==0) {
            System.out.println("You are eligible for mass recruiters🫡");
        }
        else if (age<18){
            System.out.println("Wait for your 18 th birthday🎂 ");
        }
        else {
            System.out.println("Not eligible focus on improving cgpa and remove active backlogs");
        }

        //switch case
        System.out.println("Select your favourite programming language:");
        System.out.println("Press 1 for java \n Press 2 for python\n Press 3 for C++");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Hey javaholic");
                break;
            case 2:
                System.out.println("Future AI- ML master");
                break;
            case 3:
                System.out.println("Going with the og");
                break;
            default:
                System.out.println("Error");


        }
    }
}

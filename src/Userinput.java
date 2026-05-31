import java.util.Scanner;
public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int value
        System.out.println("Enter age :");
        int age = sc.nextInt();

        // float
        System.out.println("Enter cgpa:");
        float cgpa = sc.nextFloat();

        // string
        System.out.println("Enter first name:");
        String name = sc.next();

        System.out.println("Details of students are :\nAge:" + age + "\nCGPA:" + cgpa + "\nName:"
                + name);
    }
}

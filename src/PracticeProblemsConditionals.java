import java.util.Scanner;

public class PracticeProblemsConditionals {
    public static void main(String[] args) {
        // prog to find out if student is pass or fail
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics:");
        m1= sc.nextInt();
        System.out.println("Enter marks of chemistry:");
        m2= sc.nextInt();
        System.out.println("Enter marks of maths:");
        m3= sc.nextInt();

        float avg=(m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is % :"+avg);

        if (avg>=40 && m1>=33 && m2>=33 && m3>=33 ){
            System.out.println("You are promoted !");
        }
        else {
            System.out.println("You are failed ! ");
        }

        //print day acc to no using enhanced switch

        System.out.println("Enter any no.between 1-7:");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}


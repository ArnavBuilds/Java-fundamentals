import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock,1 for paper and 2 for scissors:");
        int userchoice = sc.nextInt();

        Random random = new Random();
        int computerchoice = random.nextInt(3);

        System.out.println("Your turn:" + userchoice);
        System.out.println("computers turn:" + computerchoice);

        if ((userchoice == 0 && computerchoice == 2) || (userchoice == 1 && computerchoice == 0) ||
                (userchoice == 2 && computerchoice == 1)) {
            System.out.println("User wins !");
        } else if (userchoice < 0 || userchoice > 3) {
            System.out.println("Please enter between 0,1 and 2 only");
        } else {
            System.out.println("Computer wins!");
        }
        sc.close();
    }
}




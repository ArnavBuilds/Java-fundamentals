import java.util.Scanner;
public class StringMethods {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String ab ="  Rahul";
        System.out.println(ab);
        System.out.println("Enter username:");
        String username = sc.nextLine();//prints complete username at once
        System.out.println("Your username is:"+username);
        String uppercase= ab.toUpperCase();//prints RAHUL
        System.out.println("uppercase username:"+uppercase);
        String trimmed =ab.trim();
        System.out.println("Trimmed name :"+trimmed);//cuts the spaces trims it .
        String city ="Nagpur";
        String substring =city.substring(2,5);
        System.out.println("words from index 2 to 4 are :"+substring);//prints gpu

    }
}

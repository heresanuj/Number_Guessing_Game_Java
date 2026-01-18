
import java.util.Random;
import java.util.Scanner;
public class cwh_Number_guessing_game {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Random r=new Random();
        System.out.println("WELCOME TO NUMBER GUESSING GAME:-");
        System.out.println("no is between 1 to 10");
        System.out.println("Enter a number only integer:-");
        int []arr={1,2,3,4,5,6,7,8,9,10};

        int index=r.nextInt(arr.length);  //computer input
        int secretNumber=arr[index];      //computer input
        int attempts=0;               //initialized attempts by user
while(true) {   //infinite looping condition//
    System.out.println("Enter your integer:-(1-10)");
    int n=sc.nextInt();
    attempts ++;
    if (secretNumber == n) {
        System.out.println("You won! guessed correct attempts =" + attempts);
        break;
    } else if (secretNumber < n) {
        System.out.println("smaller no plz");
    } else if (secretNumber > n) {
        System.out.println("greater no plz");
    } else {
        System.out.println("Invalid input ");
    }

}}}

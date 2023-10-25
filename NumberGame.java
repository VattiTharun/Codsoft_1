import java.util.*;
class NumberGame
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice ="yes";
        while(choice.equals("yes"))
        {
            Random rand = new Random();
            int Random1 = rand.nextInt(100)+1;
            int guesses = 1;
            int tries =0;
            while (guesses!=Random1)
            {
                System.out.println("Guess a Number Between From 1 to 100");
                guesses = sc.nextInt();
                tries++;
                if(guesses == Random1)
                {
                    System.out.println("You have guessed the number correctly");
                    System.out.println("It only Took "+tries+" guesses");
                    System.out.println("Would Like to Play Again: Yes or No");
                    choice = sc.next().toLowerCase();
                }
                else if (guesses<Random1)
                {
                    System.out.println("The Number You Have Guessed is Lesser than the actual");
                }
                else {
                    System.out.println("The Number You have Guessed is Greater Than The Actual");
                }
            }

        }
        sc.close();
    }
}
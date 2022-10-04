//GUSSING GAME
	import java.util.Scanner;


public class gg {


    public static void guessing() {


        Scanner s = new Scanner(System.in);
        int n = 1 + (int) (100
                * Math.random());
        int number_of_trials = 9;


        int i, g;


        System.out.println("A n is chosen"+ " between 1 to 100."+ "Guess the n"+ " within 5 trials.");


        for (i = 0; i < number_of_trials; i++)
        {


            System.out.println(
                    "Guess the number:");


            g = s.nextInt();
            s.close();


            if (n == g)
            {
                System.out.println("congratulation!"+ " You have guessed the correct number.");
                break;
            }
            else if(n > g && i != number_of_trials- 1)
            {
                System.out.println("smaller number please!");
            }
            else if(n < g && i != number_of_trials - 1)
            {
                System.out.println(" greater number please !");
            }
        }


        if (i == number_of_trials)
        {
            System.out.println("You reach your limit"+ " K trials.");


            System.out.println("The correct number is " + n);
        }

    }


    public static void main(String arg[]) {

        guessing();
    }
}



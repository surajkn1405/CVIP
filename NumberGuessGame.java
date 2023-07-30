import java.util.Scanner;

public class NumberGuessGame {

    void Check(int rand_no, int Guess ){
        rand_no = (int) (Math.random()*10);     // This code Generates Random Number Between 1 to 10 
        System.out.println(rand_no);
        try (Scanner sc = new Scanner(System.in)) {
            int chance =4;      // In this Game There are 4 Chance to Guess
            for (int i = 0; i <= chance; i++) {
                System.out.print("Enter Your Guess:- ");
                Guess = sc.nextInt();
                if (i < 4) {
                    if (rand_no == Guess) {
                        System.out.println("Your Guess is Correct, You Won The Game !!!");
                        break;
                    }
                    else if (rand_no > Guess) {
                        System.out.println("Your Guess is Too Low !!!");
                    }
                    else{
                        System.out.println("Your Guess is Too High !!!");
                    }
                }
                else{
                    System.out.println("Your Loss THe Game !!!");
                }     
            }
        }
            
    }
    public static void main(String[] args) {

        NumberGuessGame obj = new NumberGuessGame();
        obj.Check(0, 0);        

    }
}

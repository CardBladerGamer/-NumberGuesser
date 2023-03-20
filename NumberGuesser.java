//Jared Miller
//11/1/21
//Number Guessing Game
import java.util.Scanner;
public class NumberGuesser {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numToGuess = (int)(Math.random()*100+1);
    getNumber(input, numToGuess);
  }

  public static void getNumber(Scanner input, int numToGuess){
    System.out.printf("Guess a number between 1 and 100 (no letters)");
    if (!input.hasNextInt()){
      String word = input.nextLine();
      System.out.printf("%s is not a number.\n", word);
      getNumber(input, numToGuess);
      return;
    }

    int theGuess = input.nextInt();
    System.out.printf("You guessed %d\n", theGuess);
    while (theGuess!=numToGuess){
      if (theGuess>numToGuess){
         System.out.println("Too High. Guess Again.");
         theGuess = input.nextInt();
      }
      else{
         System.out.println("Too Low. Guess Again.");
         theGuess = input.nextInt();
      }
    }
    System.out.print("You got it!");
  }
}
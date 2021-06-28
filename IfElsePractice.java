import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class IfElsePractice {
	
	public static void main(String[] args) {
		
		
		//PROGRAM #1 - Guessing Game Program
		//Produce a random number between 1 and 10
		int minNumber = 1;
		int maxNumber = 10;
		Random random = new Random();
		int numberToGuess = random.nextInt(maxNumber + minNumber);
		System.out.println(numberToGuess); //Used to test if working properly
		
		//Ask the user for a number
        Scanner userInput = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 10. Guess the number!");
        int guessedNumber = Integer.parseInt(userInput.nextLine());
        
        //Set up where the user gets a different response if they guess within 1 of the random number
        int lowGuessRange = Math.abs(numberToGuess - 1);
        int highGuessRange = Math.abs(numberToGuess + 1);
		
        //See if the user guessed the number correctly
        if(numberToGuess == guessedNumber) {
        	System.out.println("Right on the money!");
        } else if((guessedNumber >= lowGuessRange) && (guessedNumber <= highGuessRange)){
        	System.out.println("Oh, so close!");
        } else {
        	System.out.println("Nope!");
        };
        
        
        //PROGRAM #2 - Grade in the Class Program
        //Ask the user for their number grade
        System.out.println("What is your grade in this class?");
        int studentGrade = Integer.parseInt(userInput.nextLine());
        
        //See if they passed or failed the class (>= 60 is passing)
        if(studentGrade <= 59) {
        	System.out.println("Sorry, you have to take this class again.");
        } else {
        	System.out.println("Congrats, you passed the class!");
        }
        
        
        
        //PROGRAM#3 - Ask for an Animal Program
        //Ask the user for an animal
        System.out.println("Choose one: dog, cat, bird, or fish.");
        String userAnimal = userInput.nextLine();
        
        String dog = "dog";
        String cat = "cat";
        String bird = "bird";
        String fish = "fish";
        
        if(userAnimal.equals(dog)) {
        	System.out.println("The " + userAnimal + " says, Woof!");
        } else if(userAnimal.equals(cat)) {
        	System.out.println("The " + userAnimal + " says, Meow!");
        } else if(userAnimal.equals(bird)) {
        	System.out.println("The " + userAnimal + " says, Chirp-Chirp!");
        } else if(userAnimal.equals(fish)) {
        	System.out.println("The " + userAnimal + " says... nothing. Fish don't have vocal cords.");
        } else {
        	System.out.println("That wasn't one of the four animal choices!");
        }
        		
	}

}
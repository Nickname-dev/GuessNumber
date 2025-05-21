import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int number = (int)(Math.random() * (100 - 1 + 1));
    while(true){
System.out.println("guess the number with range : 1-100");
   int guess = scan.nextInt();
  if(guess == number){
System.out.println("you guessed the number");
    break;
    
  }else if(guess < number){

    System.out.println("your guess is lower than the number");
  }else if(guess > number){
System.out.println("your guess is higher than the number");
    
  }
  }
  }
 
}
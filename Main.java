// Simple user input java test
// author Ericka B.H
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myExp = new Scanner(System.in);
    String expression;
    System.out.println("This is a simple user input program");
    System.out.println("");
    // user input
    System.out.println("Enter an arithemtic expression using only binary arithmitic operators: "); 
    expression = myExp.nextLine();   
    // user result   
    System.out.println("Your Expression: " + expression);        
  }
}
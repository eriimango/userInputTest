
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myExp = new Scanner(System.in);
    String expression;
    
    // Enter username and press Enter
    System.out.println("Enter an arithemtic expression using only binary arithmitic operators: "); 
    expression = myExp.nextLine();   
       
    System.out.println("Expression evaluated: " + expression);        
  }
}
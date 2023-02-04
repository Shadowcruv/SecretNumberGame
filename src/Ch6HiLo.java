import java.util.*;
/*
Chapter 6 Sample Development: Hi-Lo Game (Step 1)
The instantiable main class of the program.
*/
class Ch6HiLo {
    private static enum Response {YES, NO}

    private Scanner scanner;

    //Main Method
    public static void main(String[] args) {
        Ch6HiLo hiLo = new Ch6HiLo();
        hiLo.start();
    }

    public Ch6HiLo() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        Response answer;
        describeRules();
        answer = prompt("Do you want to play a Hi-Lo game?");
        while (answer == Response.YES) {
            generateSecretNumber();
            playGame();
            answer = prompt("Do you want to play another Hi-Lo game?");
        }
        System.out.println("Thank you for playing Hi-Lo.");
    }

    private void describeRules() {
        System.out.println("Inside describeRules"); //TEMP
    }

    private void generateSecretNumber() {
        System.out.println("Inside generateSecretNumber"); //TEMP
    }

    private void playGame() {
        System.out.println("Inside playGame"); //TEMP
    }

    private Response prompt(String question) {
        String input;
        Response response = Response.NO;
        System.out.print(question + " (Yes - y; No - n): ");
        input = scanner.next();
        if (input.equals("Y") || input.equals("y")) {
            response = Response.YES;
        }
        return response;
    }
}

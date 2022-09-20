import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double aa = 5;
        double bb = 10;

        if (aa < bb) {
            System.out.println("NOOOOO!");
        }
        else
        System.out.println("Hello world!");
    }
    static void execute() {
        System.out.println("Blak");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
    }
}


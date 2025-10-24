
import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a combination of (), [], {}: ");
        String input = scan.nextLine();

        System.out.println("Those parentheses are balanced: " + parenthesesChecker(input));
        
    }

    public static boolean parenthesesChecker(String input){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!matches(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }   

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}

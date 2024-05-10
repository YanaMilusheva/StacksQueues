import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void DecimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        Integer decimal = Integer.valueOf(scanner.nextLine());
        Deque<String> stack = new ArrayDeque<>();

        while (decimal != 0) {
            stack.push(String.valueOf(decimal%2));
            decimal = decimal/2;
        }

        if (stack.isEmpty()){
            System.out.println(decimal);
        }

        while (stack.size()>0)
        {
            System.out.print(stack.pop());
        }
    }
}

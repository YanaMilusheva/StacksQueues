import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {

    public static void PrinterQueue() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled ".concat(queue.pollFirst()));
                }
            }
            else {
                queue.offer(command);
            }

            command = scanner.nextLine();
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }
    }
}

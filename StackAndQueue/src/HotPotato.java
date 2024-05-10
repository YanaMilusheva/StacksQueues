import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void HotPotato() {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int toss = scanner.nextInt();

        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String child: children){
            queue.offer(child);
        }

        while (queue.size() > 1) {
            for (int i=0; i<toss; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed ".concat(queue.pollLast()));
        }

        //the last kid remained
        System.out.println("Last is ".concat(queue.poll()));
    }
}

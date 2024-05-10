import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int toss = scanner.nextInt();
        int cycle = 1;

        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < toss; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }

            cycle++;
        }
        //the last kid remained
        System.out.println("Last is ".concat(queue.poll()));

    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 0)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

 }

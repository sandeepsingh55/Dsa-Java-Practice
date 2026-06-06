public class fibo {
    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide the number of terms as a command line argument.");
            return;
        }

        // Parse the command line argument to an integer
        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + (i == n ? "" : ", "));

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); // for a new line at the end
    }
}

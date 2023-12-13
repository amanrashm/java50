public class Prime {
    public static void main(String[] args) {
        int limit = 21;
        boolean[] isPrime = new boolean[limit + 1];
        long startTime = System.nanoTime();
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        long executionTime = endTime - startTime;
        double spaceComplexity = (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024);
        System.out.println("\nExecution Time (milliseconds): " + executionTime / 1e6);
        System.out.println("Space Complexity (MB): " + spaceComplexity);
    }
}
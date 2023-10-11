public class Find_Tgt_number {
    public static void main (String[] args) {
        int targetNumber = 40;
        int count = countOnesInRange(targetNumber);

        System.out.println("The digit '3' appears " + count + " times between 0 and " + targetNumber);
    }
    static int countOnesInRange (int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 3) {
                    count++;
                }
                num /= 10;
            }
        }
        return count;
    }
}
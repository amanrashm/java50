import java.util.Scanner;
public class Fare_Share {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int K = sc.nextInt();
            int N = sc.nextInt();
            int fareShare = K / (N + 1);
            int finalFare = K - (fareShare * (N + 1));
            int fareshre = fareShare + finalFare;
            System.out.println(fareshre);
        }
    }
}
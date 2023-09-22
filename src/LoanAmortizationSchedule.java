import java.util.Scanner;

public class LoanAmortizationSchedule {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for loan amount, number of years, annual interest rate, and pre-closing option
        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Number of Years: ");
        int numYears = sc.nextInt();

        System.out.print("Annual Interest Rate (in %): ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Do you want to include pre-closing? (yes/no): ");
        String preClosingOption = sc.next().toLowerCase();

        System.out.println(); // Insert a new line

        // Print the amortization schedule with or without pre-closing
        if ("yes".equals(preClosingOption)) {
            printAmortizationScheduleWithPreClosing(loanAmount, annualInterestRate, numYears);
        } else {
            printAmortizationSchedule(loanAmount, annualInterestRate, numYears);
        }
    }

    /**
     * Prints amortization schedule for all months without pre-closing.
     *
     * @param principal          - the total amount of the loan
     * @param annualInterestRate in percent
     * @param numYears
     */
    public static void printAmortizationSchedule(double principal, double annualInterestRate, int numYears) {
        double interestPaid, principalPaid, newBalance;
        double monthlyInterestRate, monthlyPayment;
        int month;
        int numMonths = numYears * 12;

        // Output monthly payment and total payment
        monthlyInterestRate = annualInterestRate / 12;
        monthlyPayment = monthlyPayment(principal, monthlyInterestRate, numYears);
        System.out.format("Monthly Payment: %8.2f%n", monthlyPayment);
        System.out.format("Total Payment:   %8.2f%n", monthlyPayment * numYears * 12);

        // Print the table header
        printTableHeader();

        for (month = 1; month <= numMonths; month++) {
            // Compute amount paid and new balance for each payment period
            interestPaid = principal * (monthlyInterestRate / 100);
            principalPaid = monthlyPayment - interestPaid;
            newBalance = principal - principalPaid;

            // Output the data item without pre-closing
            printScheduleItem(month, interestPaid, principalPaid, newBalance);

            // Update the balance
            principal = newBalance;
        }
    }

    /**
     * Prints amortization schedule for all months with pre-closing.
     *
     * @param principal          - the total amount of the loan
     * @param annualInterestRate in percent
     * @param numYears
     */
    public static void printAmortizationScheduleWithPreClosing(double principal, double annualInterestRate, int numYears) {
        // Similar to the printAmortizationSchedule method, but include pre-closing calculations here.
        // You can calculate pre-closing based on your specific requirements.
        // For example, you can add a pre-closing fee or percentage to the final balance.

        // Calculate pre-closing amount based on your requirements
        double preClosingAmount = calculatePreClosingAmount(principal);

        // Call the existing printAmortizationSchedule method
        printAmortizationSchedule(principal, annualInterestRate, numYears);

        // Output the pre-closing amount
        System.out.format("Pre-Closing Amount: %8.2f%n", preClosingAmount);
    }

    /**
     * Calculates the pre-closing amount based on your specific requirements.
     * Modify this method according to your pre-closing rules.
     *
     * @param principal - the total amount of the loan
     * @return the pre-closing amount
     */
    private static double calculatePreClosingAmount(double principal) {
        // Implement your pre-closing calculations here, e.g., add a fixed fee or percentage to the final balance.
        return principal + 100.0; // Example: adding a fixed fee of 100.0 to the final balance
    }

    /**
     * @param loanAmount
     * @param monthlyInterestRate in percent
     * @param numberOfYears
     * @return the amount of the monthly payment of the loan
     */
    static double monthlyPayment(double loanAmount, double monthlyInterestRate, int numberOfYears) {
        monthlyInterestRate /= 100; // e.g. 5% => 0.05
        return loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }

    /**
     * Prints a table data of the amortization schedule as a table row.
     */
    private static void printScheduleItem(int month, double interestPaid, double principalPaid, double newBalance) {
        System.out.format("%8d%10.2f%10.2f%12.2f%n", month, interestPaid, principalPaid, newBalance);
    }

    /**
     * Prints the table header for the amortization schedule.
     */
    private static void printTableHeader() {
        System.out.println("\nAmortization schedule");
        for (int i = 0; i < 68; i++) { // Draw a line
            System.out.print("-");
        }
        System.out.format("\n%8s%10s%10s%12s%n", "Payment#", "Interest", "Principal", "Balance");
        System.out.format("%8s%10s%10s%12s%n", "", "paid", "paid", "");
    }
}
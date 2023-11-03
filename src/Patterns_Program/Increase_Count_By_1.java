package Patterns_Program;

public class Increase_Count_By_1 {
    public static void main(String[] args) {
        String input = "99999,0365,06067,999999";
        String[] inputArray = input.split(",");
        int[] resultArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            String value = inputArray[i].replaceAll("^0+(?!$)", "");
            int intValue = Integer.parseInt(value);
            resultArray[i] = intValue + 1;
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
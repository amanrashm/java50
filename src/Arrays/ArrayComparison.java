package Arrays;
public class ArrayComparison {
    public static void main(String[] args) {
        Integer[] al = {1, 2, 3, 2, 1};
        Integer[] a2 = {1, 2, 3};
        Integer[] a3 = {1, 2, 3, 4};
        Integer[] a4 = {1, 2, 3};
        Integer[] a5 = {1, 3, 2};

        compareArrays(al, a2, "al", "a2");
        compareArrays(al, a3, "al", "a3");
        compareArrays(al, a4, "al", "a4");
        compareArrays(al, a5, "al", "a5");

        printResults();
    }

    static String samePos = "";
    static String sameElemDiffPos = "";
    static String sameUniqueElem = "";

    public static void compareArrays(Integer[] arr1, Integer[] arr2, String name1, String name2) {
        if (areArraysEqual(arr1, arr2)) {
            samePos += name1 + ", " + name2 + ", ";
        } else if (haveSameElements(arr1, arr2)) {
            sameElemDiffPos += name1 + ", " + name2 + ", ";
        }
        if (haveSameUniqueElements(arr1, arr2)) {
            sameUniqueElem += name1 + ", " + name2 + ", ";
        }
    }

    public static boolean areArraysEqual(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean haveSameElements(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        boolean[] found = new boolean[arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            boolean elementFound = false;
            for (int j = 0; j < arr2.length; j++) {
                if (!found[j] && arr1[i].equals(arr2[j])) {
                    found[j] = true;
                    elementFound = true;
                    break;
                }
            }
            if (!elementFound) {
                return false;
            }
        }

        return true;
    }

    public static boolean haveSameUniqueElements(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        Integer[] sortedArr1 = arr1.clone();
        Integer[] sortedArr2 = arr2.clone();

        java.util.Arrays.sort(sortedArr1);
        java.util.Arrays.sort(sortedArr2);

        for (int i = 0; i < sortedArr1.length; i++) {
            if (!sortedArr1[i].equals(sortedArr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void printResults() {
        System.out.println("Arrays having same elements at each position: " + samePos);
        System.out.println("Arrays have the same elements but positions are different: " + sameElemDiffPos);
        System.out.println("Arrays have the same unique elements: " + sameUniqueElem);
    }
}
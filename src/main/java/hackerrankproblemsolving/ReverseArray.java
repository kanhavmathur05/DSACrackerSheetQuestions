package hackerrankproblemsolving;

public class ReverseArray {

    public static int[] returnConvertedArray(String string, int arraySize) {
        int[] array = new int[arraySize];
        String[] dividedString = string.split(" ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = Integer.parseInt(dividedString[i]);
        }
        return array;
    }

    public static int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        if (array.length % 2 == 0) {
//            while (start != (end - 1)) {
//                temp = array[start];
//                array[start] = array[end];
//                array[end] = temp;
//                start++;
//                end--;
//            }
            return swap(start,(end-1),array);
        } else {
//            while (start != end) {
//                temp = array[start];
//                array[start] = array[end];
//                array[end] = temp;
//                start++;
//                end--;
//            }
            return swap(start,end,array);
        }
    }

    public static int[] swap(int start, int end, int[] array)
    {
        int temp;
        while (start != end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static int countNumbersInArray(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    public static void printArray(int[] array) {
        System.out.println("Reversed Array:-");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }
    }

    public static void main(String args[]) {
        String string = "12 23 54 76 22 13";
        int numbers = countNumbersInArray(string);
        printArray(reverseArray(returnConvertedArray(string, numbers)));
    }
}

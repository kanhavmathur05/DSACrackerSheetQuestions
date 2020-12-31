public class ArrayQ2 {
    public int minimum(int number[]) {
        int min = number[0], temp;
        for (int i = 0; i < number.length - 1; i++) {
            if (min > number[i + 1]) {
                temp = number[i + 1];
                number[i + 1] = min;
                min = temp;
            }
        }
        return min;
    }

    public int maximum(int number[]) {
        int max = number[0], temp;
        for (int i = 0; i < number.length - 1; i++) {
            if (max < number[i + 1]) {
                temp = number[i + 1];
                number[i + 1] = max;
                max = temp;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        ArrayQ2 a = new ArrayQ2();
        int arr[] = {3, 5, 2, 1, 5, 7, 5, -3, 3, 5, 8, 0, 1};
        System.out.println("Maximum :- " + a.maximum(arr));
        System.out.println("Minimum :- " + a.minimum(arr));
    }
}

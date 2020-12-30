public class ArrayQ1 {
    public int[] reverseList(int arrayList[]) {
        int temp, end = arrayList.length - 1;
        for (int start = 0; start < end; start++) {
            if (start != end) {
                temp = arrayList[start];
                arrayList[start] = arrayList[end];
                arrayList[end] = temp;
                end--;
            } else {
                break;
            }
        }
        return arrayList;
    }

    public static void printArray(int arrayList[]) {
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(" " + arrayList[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        ArrayQ1 aObject = new ArrayQ1();
        aObject.printArray(aObject.reverseList(arr));

    }
}

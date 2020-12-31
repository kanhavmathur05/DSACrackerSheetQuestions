package stringsQuestions;

public class StringQ1 {
    public char[] reverseList(char arrayList[]) {
        char temp;
        int end = arrayList.length - 1;
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

    public static void printArray(char arrayList[]) {
        for (char i = 0; i < arrayList.length; i++) {
            System.out.print(" " + arrayList[i]);
        }
    }
    public static void main(String args[])
    {
        char arr[] = {'e','k','j','g','d','q'};
        StringQ1 sObject = new StringQ1();
        sObject.printArray(sObject.reverseList(arr));
    }
}

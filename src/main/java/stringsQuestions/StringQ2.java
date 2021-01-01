package stringsQuestions;

public class StringQ2 {
    public boolean isPalindrome(String parameter) {
        int start, end = parameter.length()-1;
        for (start = 0; start < end; start++) {
            if (parameter.charAt(start) != parameter.charAt(end)) {
                return false;
            }
            end--;
        }
        return true;
    }

    public static void main(String args[]) {
        StringQ2 sObject = new StringQ2();
        String parameter = new String("asqdsa");
        System.out.println("" + sObject.isPalindrome(parameter));
    }
}

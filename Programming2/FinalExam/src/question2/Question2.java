package question2;

public class Question2 {

    public static void main(String[] args) {

        // input array
        String[] inputWords1 = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        String[] inputWords2 = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        String[] inputWords3 = {"a", "aa", "aaa", "aaaa"};


        printArray(inputWords1);
        compareString(inputWords1);

        printArray(inputWords2);
        compareString(inputWords2);

        printArray(inputWords3);
        compareString(inputWords3);
    }

    /* print array method */
    public static void printArray(String[] arr) {

        System.out.print("Input: words = [");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i != arr.length-1) //check last array for skipping ","
                System.out.print(",");
        }

        System.out.println("]");

    }

    /* compare String method */
    public static int compareString(String[] arr) {

        int lengthOfFirstWord = 0;
        int lengthOfSecondWord = 0;

        String firstWord = null;
        String secondWord = null;

        int multiplyLength = 0;

        boolean flag = true; //flag of sharing common letters

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 1; j < arr.length; j++) {
                for (int k = 0; k < arr[i].length() ; k++) {

                    //check share common letters
                    //if return -1, no common letters
                    if ( arr[j].indexOf(arr[i].charAt(k)) != -1){
                        flag = false;
                        break;
                    }
                    //If all char of words is not sharing any letter, flag keep true.
                    flag = true;
                }
                // check flag is true and multiply of two length is bigger
                if (flag && multiplyLength < arr[i].length() * arr[j].length()) {

                    lengthOfFirstWord = arr[i].length();
                    lengthOfSecondWord = arr[j].length();

                    firstWord = arr[i];
                    secondWord = arr[j];

                    multiplyLength = lengthOfFirstWord * lengthOfSecondWord;
                }
            }
        }
        // print result
        System.out.println("Output: " + multiplyLength);
        if (firstWord != null)
            System.out.println("Explanation: The Two words can be \"" + firstWord + "\", \"" + secondWord + "\".");
        else
            System.out.println("Explanation: No such pair of words.");
        System.out.println();

        return multiplyLength;
    }
}

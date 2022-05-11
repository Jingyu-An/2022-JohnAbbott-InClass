package session8;

public class EqualArray {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        LessonArray2.makeArray(arr1);
        arr2 = arr1;

        LessonArray2.printArray(arr1);
        LessonArray2.printArray(arr2);
    }
}

package question3;

/*
* We need to use FileWriter class with two parameters which are file name and boolean value of append.
* FileWriter("File Name", true);
* If boolean value of append is true, we can append data to the end of a file.
* For saving, we have to use close() method.
* Example is below.
* */


import java.io.FileWriter;
import java.io.IOException;

public class Question3 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("test.txt", true);
        System.out.println("Add some data");
        fw.close();
    }
}

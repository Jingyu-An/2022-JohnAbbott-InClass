package session8e1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileOutputStream("test.txt", true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println("Give me your name?");
        String name = input.next();

        System.out.println("Give me your address?");
        String address = input.next();

        printWriter.println(name);
        printWriter.println(address);

        printWriter.close();
    }
}

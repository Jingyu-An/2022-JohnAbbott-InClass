package example;

import java.util.Scanner;

public class Identifier {
    public static void main(String[] args) {

        //identifiers
        //Rule for identifiers -> you cannot have reserved words
        int sum = 1 + 2;

        String a_name1 = "jinfyu";
        String $aname2 = "jingyu";
        String _aname3 = "jingyu";

        //String @name = "X"; it is illegal
        //String 2name = "CC"; it is illegal

        //we can start an identifier by letters, underscore or dollar sign

        //types can be numbers, letters, boolean
        // identifiers can have different type and size

        //data types primitives
        byte num1 = 127; // -127 to 128
        byte num1Min = Byte.MIN_VALUE; // -127 to 128
        byte num1Max = Byte.MAX_VALUE; // -127 to 128
        System.out.println("the min value of byte = " + num1Min);
        System.out.println("the max value of byte = " + num1Max);

        short shortNum = -32768; //-32768 to 32767
        short shortNumMin = Short.MIN_VALUE; //-32768 to 32767
        short shortNumMax = Short.MAX_VALUE; //-32768 to 32767
        System.out.println("the min value of short = " + shortNumMin);
        System.out.println("the max value of short = " + shortNumMax);

        int num2Min = Integer.MIN_VALUE;
        int num2Max = Integer.MAX_VALUE;
        System.out.println("the min value of integer = " + num2Min);
        System.out.println("the max value of integer = " + num2Max);
        long num3Min = Long.MIN_VALUE;
        long num3Max = Long.MAX_VALUE;
        System.out.println("the min value of long = " + num3Min);
        System.out.println("the max value of long = " + num3Max);

        float floatNumMin = Float.MIN_VALUE;
        float floatNumMax = Float.MAX_VALUE;
        System.out.println("the min value of float = " + floatNumMin);
        System.out.println("the max value of float = " + floatNumMax);


        // 1. Get the length of the rectangle.
        // 2. Get the width of the rectangle.
        // 3. Find the perimeter using the following equation :
        // perimeter = 2 X (length + width)
        // 4. FInd the area using the following equation :
        // area = length X width

        double length;
        double width;
        double perimeter;
        double area;



        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the length");
        length = scan.nextDouble();
        System.out.println("please enter the width");
        width = scan.nextDouble();

        perimeter = 2 * (length + width);
        area = length * width;

        System.out.println("the perimeter is = " + perimeter);
        System.out.println("the area is = " + area);
    }
}

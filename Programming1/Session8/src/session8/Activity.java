package session8;

import java.util.Scanner;

public class Activity {
    public static int invalidValueCount = 0;        // count invalid values for all the required inputs

    public static void main(String[] args) {

        int numberOfItems = itemNumber();       // Call method of the number of items

        int[] arrayOfItemPrice = new int[numberOfItems];    // Create array with the number of items length for each item price.
        priceOfItems(arrayOfItemPrice);     // Call method of the price of each item.

        double taxGST = taxRateGST();       // Call method of the GRate in percentage.
        double taxQST = taxRateQST();       // Call method of the QRate in percentage.

        if (invalidValueCount != 0){        // Check the invalid values for all the required inputs
            System.out.printf("You have entered %d invalid inputs.\n", invalidValueCount);
        }

        calculatorTotalPrice(arrayOfItemPrice, taxGST, taxQST);      //Call method of calculator price
    }

    /* The number of items method */
    public static int itemNumber(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the number of items bought [1...10] : ");
        int numberOfItems = input.nextInt();        // First input
        while (numberOfItems < 0 || numberOfItems > 10){        //Check the input number of items 1~10
            System.out.printf("Please enter the number of items bought [1...10] : ");
            numberOfItems = input.nextInt();        // Re-input
            invalidValueCount++;        //count invalid values for all the required inputs
        }
        return numberOfItems;       // Return the number of items
    }

    /*The price of each item method*/
    public static void priceOfItems(int[] arr){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){       //Enter the price of each item with for loop
            System.out.printf("Please enter the price of item %d [1...1000]: ", i+1);       //item "index+1" print for user.
            arr[i] = input.nextInt();       // First input
            while (arr[i] < 0 || arr[i] > 1000){        //Check the input item price 1~1000
                System.out.printf("Please enter the price of item %d [1...1000]: ", i+1);
                arr[i] = input.nextInt();        // Re-input
                invalidValueCount++;        //count invalid values for all the required inputs
            }
        }
    }

    /*The GST*/
    public static double taxRateGST(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the tax rate of GST in %% [0...14]: ");
        double taxGST = input.nextDouble();     // First input GST
        while (taxGST < 0 || taxGST > 14){      //Check the input GST 1~14
            System.out.printf("Please enter the tax rate of GST in %% [0...14]: ");
            taxGST = input.nextDouble();
            invalidValueCount++;        //count invalid values for all the required inputs
        }
        return taxGST;
    }

    /*The QST*/
    public static double taxRateQST(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the tax rate of QST in %% [0...17]: ");
        double taxQST = input.nextDouble();     // First input QST
        while (taxQST < 0 || taxQST > 17){      //Check the input QST 1~17
            System.out.printf("Please enter the tax rate of QST in %% [0...17]: ");
            taxQST = input.nextDouble();
            invalidValueCount++;        //count invalid values for all the required inputs
        }
        return taxQST;
    }

    /*Calculator of Price*/
    public static void calculatorTotalPrice(int[] arr, double gst, double qst){
        double subTotalPrice = 0;
        double gstPrice = 0;
        double qstPrice = 0;
        double totalPrice = 0;
        for (int i : arr){      //Calculate subtotal with for loop
            subTotalPrice += i;
        }
        System.out.printf("Sub Total : $ %.2f\n", subTotalPrice);
        gstPrice = subTotalPrice * gst / 100;       //Calculate GST
        System.out.printf("GST : $ %.2f\n", gstPrice);
        qstPrice = subTotalPrice * qst / 100;       //Calculate QST
        System.out.printf("QST : $ %.2f\n", qstPrice);
        totalPrice = subTotalPrice + gstPrice + qstPrice;       //Calculate Total Price
        System.out.printf("Total : $ %.2f\n", totalPrice);
    }
}

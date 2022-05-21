package assignment;

import java.util.Scanner;

public class ComputerStore {

    final private static String password = "password"; //password. use final

    /* option 1 method */
    public static void optionOne(Computer[] inventory){

        Scanner input = new Scanner(System.in);

        if (ComputerStore.passwordChecker()) //Call passwordChecker method
            return;                          //if return false, close optionOne method

        int leftInventory = inventory.length - Computer.findNumberOfCreatedComputers(); //check left empty inventory

        System.out.print("How many computers are you adding? ");
        int numOfComputer = input.nextInt();

        if (numOfComputer > leftInventory) { //check inventory
            System.out.printf("You can only add %d computers.\n", leftInventory);
            numOfComputer = leftInventory; //change value to possible inventory number
        }

        int startIndex; //Defining index starting values for first or additional computer creation
        int endIndex;   //Defining index ending values for first of additional computer creation
        if (leftInventory == inventory.length){ //Make sure you are adding the first computer
            startIndex = 0;
            endIndex = numOfComputer; //end index of array you want to add
        } else {
            startIndex = inventory.length-leftInventory; //start index of empty array
            endIndex = startIndex + numOfComputer; //end index of array you can add
        }

        /* input the computer information */
        for (int i = startIndex; i < endIndex ; i++) {

            int option;

            do {
                ComputerStore.printInputComputerInformation(); //Call printInputComputerInformation method
                option = input.nextInt();
            }while (option < 1 || option >4); //Check option value

            if (option == 1) {//make default Computer
                inventory[i] = new Computer();
            } else if (option == 2) { //make Parametrized Computer
                inventory[i] = new Computer("HP", "HP Spectre", 1500);
            } else if (option == 3) { //make user entered Computer
                System.out.println("Enter the brand, the model, price");
                String brand = input.next();
                String model = input.next();
                int price = input.nextInt();
                inventory[i] = new Computer(brand, model, price);
            }
            else { //make copied computer
                System.out.println("Computer list of inventory");
                if (inventory[0] == null) {
                    System.out.println("Inventory Empty!!");
                    break;
                } else {
                    /* print list of computers */
                    for (int j = 0; j < inventory.length; j++) {
                        if (inventory[j] == null)
                            break;
                        System.out.printf("Computer #%d. %s", j, inventory[j]);
                    }
                    System.out.print("Enter the number of computer you want to copy : ");
                    int numOfList = input.nextInt();
                    inventory[i] = new Computer(inventory[numOfList]);
                }
            }
        }

    }

    /* option 2 method */
    public static void optionTwo(Computer[] inventory) {

        Scanner input = new Scanner(System.in);

        if (ComputerStore.passwordChecker()) //Call passwordChecker method and check password
            return;                          //if return false, close optionTwo method

        int numOfComputer; //input index variable
        do {
            System.out.printf("Which computer number would you like to update?(Between 0 and %d) ", inventory.length-1);
            numOfComputer = input.nextInt();
        } while (numOfComputer < 0 || numOfComputer > inventory.length); //check index is valid

        if (inventory[numOfComputer] == null){ //check value of array is null
            System.out.println("The array of index values is empty. Go back to main menu.");
            return; //if array of index values is empty, close optionTwo method
        } else { //print computer info
            System.out.printf("\nComputer # %d.\n", numOfComputer);
            inventory[numOfComputer].showInfo();
        }

        /* Option 2 */
        while (true) {
            ComputerStore.printUpdateMenu();
            int subOption = input.nextInt();
            if (subOption == 0) { //Go beck to main menu
                return;
            }

            switch (subOption) {
                case 1: //Changing brand
                    System.out.print("Please enter a new brand name : ");
                    String brand = input.next();
                    inventory[numOfComputer].setBrand(brand); //call setBrand
                    System.out.printf("\nComputer # %d.\n", numOfComputer);
                    inventory[numOfComputer].showInfo();
                    break;

                case 2: //Changing model
                    System.out.print("Please enter a new model name : ");
                    String model = input.next();
                    inventory[numOfComputer].setModel(model); //call setModel
                    System.out.printf("\nComputer # %d.\n", numOfComputer);
                    inventory[numOfComputer].showInfo();
                    break;

                case 3: //Changing SN
                    System.out.println("The serial number has been changed.");
                    inventory[numOfComputer].setSerialNumber(); //call setSerialNumber
                    System.out.printf("Computer # %d.\n", numOfComputer);
                    inventory[numOfComputer].showInfo();
                    break;

                case 4: //Changing price
                    System.out.print("Please enter a new price : ");
                    double price = input.nextDouble();
                    inventory[numOfComputer].setPrice(price); //call setPrice
                    System.out.printf("Computer # %d.\n", numOfComputer);
                    inventory[numOfComputer].showInfo();
                    break;

                case 5: //closing program
                    ComputerStore.printClosing(); //Call printClosing method
                    System.exit(0); //end the driver
                default:
                    break;
            }
        }
    }

    /* option 3 method */
    public static void optionThree(Computer[] inventory){

        Scanner input = new Scanner(System.in);

        int count = 0; //Check how many computers are found

        System.out.print("Enter the brand name you are looking for : ");
        String brand = input.next();
        for (int i = 0; i < Computer.findNumberOfCreatedComputers(); i++) { //using for loop until createdComputerCounter
            if (inventory[i].getBrand().contentEquals(brand)) { //brand name check
                System.out.printf("\nComputer # %d.\n%s", i, inventory[i]);
                count++;
            }
        }

        if (count == 0)
            System.out.println("I couldn't find it.");
    }

    /* option 4 method */
    public static void optionFour(Computer[] inventory){

        Scanner input = new Scanner(System.in);

        int count = 0; //Check how many computers are found

        System.out.print("Enter the highest price you are looking for : ");
        double price = input.nextDouble();
        for (int i = 0; i < Computer.findNumberOfCreatedComputers(); i++) { //using for loop until createdComputerCounter
            if (price >= inventory[i].getPrice()) { //price check
                System.out.printf("\nComputer # %d.\n%s", i, inventory[i]);
                count++;
            }
        }
        if (count == 0)
            System.out.println("I couldn't find it.");
    }

    /* password checking method */
    public static boolean passwordChecker() {

        Scanner input = new Scanner(System.in);

        int passwordCount = 2; //password counter

        System.out.print("Enter the password : ");
        String pw = input.next();
        while (!pw.contentEquals(password)){ //check password

            if (passwordCount == 0) { //3rd illegal entry check
                System.out.println("Invalid password");
                return true;
            }

            System.out.printf("Please Re-Enter the password(Chance : %d) : ", passwordCount);
            pw = input.next();
            passwordCount--;
        }
        return false;
    }

    /* print methods */
    public static void printMainMenu() {

        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("\t1.\tEnter new computers (password required)");
        System.out.println("\t2.\tChange information of a computer (password required)");
        System.out.println("\t3.\tDisplay all computers by a specific brand");
        System.out.println("\t4.\tDisplay all computers under a certain a price.");
        System.out.println("\t5.\tQuit");
        System.out.print("Please enter your choice > ");
    }

    public static void printUpdateMenu() {

        System.out.println();
        System.out.println("What information would you like to change?");
        System.out.println("\t1.\tBrand");
        System.out.println("\t2.\tModel");
        System.out.println("\t3.\tSN");
        System.out.println("\t4.\tPrice");
        System.out.println("\t5.\tQuit");
        System.out.println("\t0.\tGo to Main Menu");
        System.out.print("Please enter your choice > ");
    }

    public static void printWelcome() {

        System.out.println();
        System.out.println("=============================================");
        System.out.println("============  Welcome to Store  =============");
        System.out.println("=============================================");
        System.out.println();
    }

    public static void printClosing() {

        System.out.println();
        System.out.println("=============================================");
        System.out.println("=========  Thank you for visiting.  =========");
        System.out.println("=============================================");
    }

    public static void printInputComputerInformation() {
        System.out.println("=====================================================================================");
        System.out.println("\t 1. Apple Model - The brand : Apple, the model : MacBook Air, price : 2000$.");
        System.out.println("\t 2. HP Model - The brand : HP, the model : HP Spectre, price : 1500$");
        System.out.println("\t 3. Custom Model - You need to enter the brand, the model, price");
        System.out.println("\t 4. Copy Model from inventory");
        System.out.println("=====================================================================================");
        System.out.print("Please enter your choice ---> ");
    }
}

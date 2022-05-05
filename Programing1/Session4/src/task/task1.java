package task;

    /*Write a program that randomly generates an integer between 1 and 12
    and based on the number, use switch case syntax to print which month has been chosen
    1 for "January" , 2 for "Februaray" .....*/

public class task1 {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 12) + 1;
        String month = "";

        switch (number){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month";
                break;
        }
        System.out.printf("%d for %s", number, month);
    }
}

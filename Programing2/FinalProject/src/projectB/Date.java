package projectB;

public class Date {

    private int year;
    private int day;
    private int month;

    public Date(int year, int day, int month) {

        if (dateOK(month, day, year)) {
            this.year = year;
            this.day = day;
            this.month = month;
        } else {
            this.year = 1900;
            this.day = 1;
            this.month = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public boolean dateOK(int month, int day, int year) {
        return month >= 1 && month <= 12 && day >= 1 && day <= 31 && year >= 1000 && year <= 9999;
    }
}

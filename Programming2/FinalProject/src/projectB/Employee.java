package projectB;

public class Employee {

    private String name;
    private int id;
    private Date hiredDate;
    private String position;

    private static int serialNumOfId = 10000;

    public Employee(String name, Date hiredDate, String position) {

        this.name = name;
        this.id = serialNumOfId++;
        this.hiredDate = hiredDate;
        this.position = position;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\t\t\tID : " + id +
                "\t\t\tHire Date : " + hiredDate.getMonth() + "/" + hiredDate.getDay() + "/" + hiredDate.getYear() +
                "\t\tPosition : " + position;
    }
}

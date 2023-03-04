
public class Employee extends Staff implements ICalculator {
    /** số giờ làm thêm */
    int overtime;

    /** lương nhân viên */
    int staffSalary = coSalary*3000000 + overtime*;

    // Overloaded constructor
    public Employee(String id, String name, int age, int coSalary, int firstDate, String department, int daysOff,
            int overtime, int staffSalary) {
        super();
        this.overtime = overtime;
        this.staffSalary = staffSalary;
    }

    // default constructor
    public Employee() {
        super();
        overtime = 0;
        staffSalary = 0;
    }

    // methods
    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setStaffSalary(int staffSalary) {
        this.staffSalary = staffSalary;
    }

    public int getStaffSalary() {
        return staffSalary;
    }

    public int calculateSalary() {
        staffSalary = coSalary * 3000000 + overtime * 200000;
        return staffSalary;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%", id, name, age, coSalary, firstDate,
                department, daysOff, staffSalary);
    }
}

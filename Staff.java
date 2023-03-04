
public abstract class Staff {
    // instance variables
    /** mã nhân viên */
    public String id;

    /** tên nhân viên */
    public String name;

    /** tuổi nhân viên */
    public int age;

    /** hệ số lương */
    public int coSalary;

    /** ngày vào làm */
    public int firstDate;

    /** bộ phận làm việc */
    public String department;

    /** số ngày nghỉ phép */
    public int daysOff;

    // Overloaded constructors
    public Staff(String id, String name, int age, int coSalary, int firstDate, String department, int daysOff) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.coSalary = coSalary;
        this.firstDate = firstDate;
        this.department = department;
        this.daysOff = daysOff;
    }

    // default constructor
    public Staff() {
        this("", "", 0, 0, 0, "", 0);
    }

    // non-static methods
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCoSalary(int coSalary) {
        this.coSalary = coSalary;
    }

    public int getCoSalary() {
        return coSalary;
    }

    public void setFirstDate(int firstDate) {
        this.firstDate = firstDate;
    }

    public int getFirstDate() {
        return firstDate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public abstract String toString();
}

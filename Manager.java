
public class Manager extends Staff implements ICalculator {
    /** chức danh */
    private String title;

    /** lương trách nhiệm */
    int responsibleSalary;

    /** lương quản lý */
    int managerSalary;

    // overloaded constructors
    public Manager(String id, String name, int age, int coSalary, int firstDate, String department, int daysOff,
            String title, int responsibleSalary, int managerSalary) {
        super();
        this.title = title;
        this.responsibleSalary = responsibleSalary;
        this.managerSalary = managerSalary;
    }

    // default constructors
    public Manager() {
        super();
        title = "";
        responsibleSalary = 0;
        managerSalary = 0;
    }

    // methods
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setResponsibleSalary(int responsibleSalary) {
        this.responsibleSalary = responsibleSalary;
    }

    public int getResponsibleSalary() {
        return responsibleSalary;
    }

    public void setManagerSalary(int managerSalary) {
        this.managerSalary = managerSalary;
    }

    public int getManagerSalary() {
        return managerSalary;
    }

    @Override
    public int calculateSalary() {
        managerSalary = coSalary * 5000000 + responsibleSalary;
        return managerSalary;
    }

    public String toString() {
        return String.format("%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%", id, name, age, coSalary, firstDate,
                department, daysOff, title, managerSalary);
    }
}

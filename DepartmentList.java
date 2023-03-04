import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Department List
 * 
 * @author Si
 * @since 09/01/2021
 *
 */
public class DepartmentList {
    /** Department list */
    private List<Department> departments;
    /** Scanner to input from keyboard */
    private Scanner scanner;

    /**
     * Constructor
     * 
     * @param scanner Keyboard input
     */
    public DepartmentList(Scanner scanner) {
        this.scanner = scanner;
        departments = new ArrayList<>();
    }

    /**
     * Add them department
     */
    public void addDepartment() {
        Department department = new Department();
        System.out.println("Moi nhap thong tin bo phan: ");
        System.out.print("ID: ");
        department.setDepartmentId(scanner.nextLine().toUpperCase());
        // Check if the ID is already exist. If it is, ask the user do it again
        String id;
        do {
            id = scanner.nextLine();
            if (isDepartmentExist(id)) {
                System.out.println("ID da ton tai. Vui long nhap lai ID khac: ");
            }
        } while (isDepartmentExist(id));

        System.out.print("Ten bo phan: ");
        department.setDepartmentName(scanner.nextLine());

        department.setNumberOfStaff(0);

        departments.add(department);
    }

    /**
     * Check if the department is already exist in the list
     * 
     * @param departmentId Department ID
     * @return True/false
     */
    public boolean isDepartmentExist(String departmentId) {
        for (Department department : departments) {
            if (departmentId.equals(department.getDepartmentId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Get the department by ID
     * 
     * @param id ID
     * @return Department if exist
     */
    public Department getDepartment(String id) {
        for (Department department : departments) {
            if (id.equals(department.getDepartmentId())) {
                return department;
            }
        }
        return null;
    }
}

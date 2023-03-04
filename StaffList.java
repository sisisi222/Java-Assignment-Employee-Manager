import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Staff List
 * 
 * @author Si
 *
 */
public class StaffList {
    /** Staff list */
    List<Staff> staffs = new ArrayList<>();
    List<Department> departments = new ArrayList<>();

    public void add() {
        Staff staff = null;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Mã nhân viên: ");
        // Check if the staff ID is already exist
        // If it is, ask the user to type the ID again
        String id;
        do {
            id = keyboard.nextLine();
            if (isStaffExist(id)) {
                System.out.println("ID da ton tai. Vui long nhap mot ID khac: ");
            }
        } while (isStaffExist(id));

        System.out.println("Tên nhân viên: ");
        String name = keyboard.nextLine();

        System.out.println("Tuổi nhân viên: ");
        int age = keyboard.nextInt();

        System.out.println("Hệ số lương: ");
        int coSalary = keyboard.nextInt();

        System.out.println("Ngày vào làm: ");
        int firstDate = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Mã bộ phận làm việc: ");
        String departmentId = keyboard.nextLine();

        System.out.println("Tên bộ phận làm việc: ");
        String departmentName = keyboard.nextLine();

        System.out.println("Số lượng nhân viên hiện tại trong bộ phận làm việc: ");
        int numberOfStaff = keyboard.nextInt();

        addToListDepartment(departmentId, departmentName, numberOfStaff);

        System.out.println("Số ngày nghỉ phép: ");
        int daysOff = keyboard.nextInt();

        System.out.println("Loại nhân viên: " + "Vui lòng nhập số 1 nếu là nhân viên thông thường,"
                + " nhập số 2 nếu là nhân viên quản lý");
        int typeOfStaff = keyboard.nextInt();
        keyboard.nextLine();

        if (typeOfStaff == 1) {
            System.out.println("Số giờ làm thêm: ");
            int overtime = keyboard.nextInt();

            staff = new Employee(id.toUpperCase(), name, age, coSalary, firstDate, departmentName, daysOff, overtime,
                    staffSalary);
            staffs.add(staff);

        } else {

            System.out.println("Chuc vu quan ly (1. Business Leader/2. Project Leader/3. Technical Leader?)");
            int position = keyboard.nextInt();
            // enum
            ManagerPosition managerPosition = ManagerPosition.asCode(position);
            managerPosition.getDisplayName();
            // lay luong ne
            managerPosition.getResponsibleSalary();

            staff = new Manager(id.toUpperCase(), name, age, coSalary, firstDate, departmentName, daysOff, d,
                    managerPosition.getResponsibleSalary(), managerSalary);
            staffs.add(staff);
        }
    }

    /**
     * Check if staff is exist
     * 
     * @param staffId Staff ID
     * @return True/false
     */
    public boolean isStaffExist(String staffId) {
        for (Staff staff : staffs) {
            if (staffId.equals(staff.getId())) {
                return true;
            }
        }
        return false;
    }

    public void addToListDepartment(String departmentId, String departmentName, int numberOfStaff) {
        Department department = new Department(departmentId.toUpperCase(), departmentName, numberOfStaff);
        departments.add(department);
    }

    public void displayStaff() {
        for (Staff staff : staffs) {
            System.out.format("%-10s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%\n", "Mã nhân viên", "Tên nhân viên",
                    "Tuổi nhân viên", "Hệ số lương", "Ngày vào làm", "Bộ phận làm việc", "Số ngày nghỉ phép",
                    "Lương nhân viên");
            System.out.println(staff.toString());
        }
    }

    public void displayDepartment() {
        for (Department department : departments) {
            System.out.println(String.format("-10s%-20s%-20s%", "Mã bộ phận", "Tên bộ phận", "Số lượng nhân viên"));
            System.out.println(department.toString());
        }
    }

}

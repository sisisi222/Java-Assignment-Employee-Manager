import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanResources {
	
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		StaffList addStaff = new StaffList();
		
		int option;
		do {
			System.out.println("Chọn một trong những mục dưới đây:");
			System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty");
			System.out.println("2. Hiển thị các bộ phận trong công ty");
			System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
			System.out.println("4. Thêm nhân viên thông thường mới vào công ty");
			System.out.println("5. Thêm nhân viên là cấp quản lý (có thêm chức vụ) mới vào công ty");
			System.out.println("6. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
			System.out.println("7. Hiện thị bảng lương của nhân viên toàn công ty");
			System.out.println("8. Hiện thị bảng lương của nhân viên theo thứ tự tăng dần");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if (option == 1) {
				addStaff.displayStaff();
			}
			
			else if (option == 2) {
				addStaff.displayDepartment();
			}
			
			else if (option == 3) {
				
				
			}
			
			else if (option == 4) {
				addStaff.add();
			}
			
			else if (option == 5) {
				
			}
			
			else if (option == 6) {
				
			}
			
			else if (option == 7) {
				
			}
			
			else {
				
			}
		} while (option != 8);
	}
}

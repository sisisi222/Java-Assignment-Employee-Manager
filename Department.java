
public class Department {
	/** mã bộ phận */
	private String departmentId;
	
	/** tên bộ phận */
	private String departmentName;
	
	/** số lượng nhân viên hiện tại */
	private int numberOfStaff;
	
	//overloaded constructor
	public Department(String departmentId, String departmentName, int numberOfStaff) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.numberOfStaff = numberOfStaff;
	}
	
	//default constructor
	public Department() {
		this("","",0);
	}
	
	//methods
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	public String getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setNumberOfStaff (int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	
	public int getNumberOfStaff() {
		return numberOfStaff;
	}
	
	public String toString() {
		return String.format("%-10s%-20s%-20s%", departmentId, departmentName, numberOfStaff);		
	
	}
}

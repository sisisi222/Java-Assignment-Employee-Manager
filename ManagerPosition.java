/**
 * Manager Position
 * 
 * @author Si
 * @since 2020/12/09
 */
public enum ManagerPosition {

	/** Business Leader */
	BUSINESS_LEADER(1, "Business Leader", 8000000),
	/** Project Leader */
	PROJECT_LEADER(2, "Project Leader", 5000000),
	/** Technical Leader */
	TECHNICAL_LEADER(3, "Technical Leader", 6000000),
	;
	
	/** Code */
	private int code;
	/** Display Name */
	private String displayName;
	/** Responsible Salary */
	private long responsibleSalary;
	
	/**
	 * Get Code
	 * @return Code
	 */
	public int getCode() {
		return this.code;
	}
	
	/**
	 * Get Display Name
	 * @return Display Name
	 */
	public String getDisplayName() {
		return this.displayName;
	}
	
	/**
	 * Get Responsible Salary
	 * @return Responsible Salary
	 */
	public long getResponsibleSalary() {
		return this.responsibleSalary;
	}
	
	/**
	 * All arguments constructor
	 * @param code Code
	 * @param displayName Display Name
	 * @param responsileSalary Responsible Salary
	 */
	private ManagerPosition(int code, String displayName, long responsileSalary) {
		this.code = code;
		this.displayName = displayName;
		this.responsibleSalary = responsileSalary;
	}
	
	/**
	 * Get Manager Position by code
	 * @param code Code
	 * @return Manager Position
	 */
	public static ManagerPosition asCode(int code) {
		for (ManagerPosition position : ManagerPosition.values()) {
			if (position.getCode() == code) {
				return position;
			}
		}
		return null;
	}
	
}

package gameBackend.Entity;

public class User extends BaseEntity{
	private String firstName;
	private String userEmail;
	private String userPassword;
	private String lastName;
	private String NationalityId;
	private int birthYear;
	public User(long id, String firstName, String userEmail, String userPassword, String lastName, String nationalityId,
			int birthYear) {
		super(id);
		this.firstName = firstName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.lastName = lastName;
		NationalityId = nationalityId;
		this.birthYear = birthYear;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
	
	
	
}

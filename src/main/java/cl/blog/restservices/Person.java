package cl.blog.restservices;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Integer state;
	
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String email, Integer state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", state=" + state
				+ "]";
	}

	
	

}

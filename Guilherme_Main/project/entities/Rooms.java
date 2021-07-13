package entities;

public class Rooms {
	
	private String namestudent;
	private String email;
	
	public Rooms(String namestudent, String email) {
		this.namestudent = namestudent;
		this.email = email;
	}

	public String getNamestudent() {
		return namestudent;
	}

	public void setNamestudent(String namestudent) {
		this.namestudent = namestudent;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return namestudent + ", " + email;
	}
}

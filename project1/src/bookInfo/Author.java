package bookInfo;

public class Author {
	private String name;
	private String email;
	private String gender;

	public Author(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void showInfo() {
		System.out.println("Author Information");
		System.out.println("Author Name : "+name);
		System.out.println("Author email : "+email);
		System.out.println("Author gender :"+gender);
	}
	
}

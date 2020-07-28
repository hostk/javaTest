package shop.copy;

public class Customer{
	private String name;
	private Boolean member =false;
	private String memberType;
	
	public final String p ="Premium";
	public final String g ="Gold";
	public final String s ="Sliver";
	public final double productDiscount =0.0;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public Customer() {
		
	}
	
	public Customer(String name, String m) {
		this.name=name;
		this.memberType=m;
	}
	public boolean isMember() {
		switch(memberType) {
		case "Premium":
			member =true;
			break;
		case "Gold":
			member = true;
			break;
		case "Sliver":
			member = true;
			break;
		default:
			System.out.print("You are not a member.");
			break;
		}
		return member;
	}
	public String toString() {
		String str;
		str = "Customer name: "+name+"\n Customer Member Type : "+memberType;
		return str;
	}
}

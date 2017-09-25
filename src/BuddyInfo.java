import java.util.*;

public class BuddyInfo {
	private String name;
	private String address;
	private String number;
	
	 public BuddyInfo(String newName,String newAddress,String newNumber){
		 super();
		 this.name = newName;
		 this.address = newAddress;
		 this.number=newNumber;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Homer","Newadress","123456");
		buddy.setName("Homer");
		// TODO Auto-generated method stub
		System.out.println("Hello "+ buddy.getName());
	}

}

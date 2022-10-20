package module3;

public class Contact {
	
	private final int ID_MAX = 10;
	private final int NAME_MAX = 10;
	private final int PHONE_SIZE = 10;
	private final int ADDRESS_MAX = 30;
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address) {
		if (contactID == null || contactID.length() > ID_MAX)
			throw new IllegalArgumentException("Invalid ID");
		
		this.contactID = contactID;
		
		setFirstName(firstName);
		setLastName(lastName);
		setPhone(phone);
		setAddress(address);
	}

	/**
	 * @return the ID
	 */
	public String getContactID() {
		return this.contactID;
	}

	/**
	 * @param ID the ID to set
	 */
	public void setContactID(String ID) {
		throw new UnsupportedOperationException("Contact ID Not Updateable");
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > NAME_MAX)
			throw new IllegalArgumentException("Invalid First Name");
		
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > NAME_MAX)
			throw new IllegalArgumentException("Invalid Last Name");
		
		this.lastName = lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		if (phone == null || phone.length() != PHONE_SIZE)
			throw new IllegalArgumentException("Invalid Phone");
		
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		if (address == null || address.length() > ADDRESS_MAX)
			throw new IllegalArgumentException("Invalid Address");
		
		this.address = address;
	}
}

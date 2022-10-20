package module3;

import java.util.*;

public class ContactService {
	
	public Hashtable<String, Contact> contacts = new Hashtable<String, Contact>();

	public ContactService() {
		contacts = new Hashtable<String, Contact>();
	}

	/**
	 * Adds a new Contact if contactID is new
	 * 
	 * @param contact the contact to set
	 */
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactID()))
			throw new IllegalArgumentException("ID Already Exists");
		
		contacts.put(contact.getContactID(), contact);
	}

	/**
	 * Removes Contact
	 * 
	 * @param contactID the contactID to remove
	 */
	public void deleteContact(String contactID) {
		if (!contacts.containsKey(contactID))
			throw new IllegalArgumentException("Contact ID Does Not Exist");
		
		contacts.remove(contactID);
	}
	
	/**
	 * Updates Contact First Name
	 * 
	 * @param contactID the contactID to update
	 * @param firstName the firstName to set
	 */
	public void updateContactFirstName(String contactID, String firstName) {
		if (!contacts.containsKey(contactID))
			throw new IllegalArgumentException("Contact ID Does Not Exist");
		
		contacts.get(contactID).setFirstName(firstName);
	}
	
	/**
	 * Updates Contact Last Name
	 * 
	 * @param contactID the contactID to update
	 * @param lastName the lastName to set
	 */
	public void updateContactLastName(String contactID, String lastName) {
		if (!contacts.containsKey(contactID))
			throw new IllegalArgumentException("Contact ID Does Not Exist");
		
		contacts.get(contactID).setLastName(lastName);
	}
	
	/**
	 * Updates Contact Phone
	 * 
	 * @param contactID the contactID to update
	 * @param phone the phone to set
	 */
	public void updateContactPhone(String contactID, String phone) {
		if (!contacts.containsKey(contactID))
			throw new IllegalArgumentException("Contact ID Does Not Exist");
		
		contacts.get(contactID).setPhone(phone);
	}
	
	/**
	 * Updates Contact Address
	 * 
	 * @param contactID the contactID to update
	 * @param address the address to set
	 */
	public void updateContactAddress(String contactID, String address) {
		if (!contacts.containsKey(contactID))
			throw new IllegalArgumentException("Contact ID Does Not Exist");
		
		contacts.get(contactID).setAddress(address);
	}
}

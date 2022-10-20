package module3test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module3.Contact;
import module3.ContactService;

class ContactServiceTest {

	/** Add Contact Tests
	 * ID must be unique
	 */
	@Test
	void testAddContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
	}
	
	@Test
	void testAddContactDuplicateID() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact2 = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
			service.addContact(contact2);
		});
	}

	/** Delete Contact Tests
	 * 
	 */
	@Test
	void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));

		Assertions.assertDoesNotThrow(() -> {
			service.deleteContact(contact.getContactID());
		});
	}
	
	@Test
	void testDeleteContactNonExistantID() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.deleteContact(contact.getContactID());
		});
	}

	/** Update First Name Tests
	 * 
	 */
	@Test
	void testContactUpdateFirstName() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getFirstName().equals("Brian"));

		Assertions.assertDoesNotThrow(() -> {
			service.updateContactFirstName(contact.getContactID(), "Steve");
		});

		assertTrue(service.contacts.get(contact.getContactID()).getFirstName().equals("Steve"));
	}
	
	@Test
	void testContactUpdateFirstNameTooLong() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getFirstName().equals("Brian"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactFirstName(contact.getContactID(), "Steve67890A");
		});
	}
	
	@Test
	void testContactUpdateFirstNameNull() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getFirstName().equals("Brian"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactFirstName(contact.getContactID(), null);
		});
	}
	
	@Test
	void testContactUpdateFirstNameInvalidID() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getFirstName().equals("Brian"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactFirstName("A123", "Steve");
		});
	}

	/** Update Last Name Tests
	 * 
	 */
	@Test
	void testContactUpdateLastName() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getLastName().equals("Hartong"));

		Assertions.assertDoesNotThrow(() -> {
			service.updateContactLastName(contact.getContactID(), "Smith");
		});

		assertTrue(service.contacts.get(contact.getContactID()).getLastName().equals("Smith"));
	}
	
	@Test
	void testContactUpdateLastNameTooLong() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getLastName().equals("Hartong"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactLastName(contact.getContactID(), "Smith67890A");
		});
	}
	
	@Test
	void testContactUpdateLastNameNull() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getLastName().equals("Hartong"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactLastName(contact.getContactID(), null);
		});
	}
	
	@Test
	void testContactUpdateLastNameInvalidID() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getLastName().equals("Hartong"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactLastName("A123", "Smith");
		});
	}

	/** Update Phone Tests
	 * 
	 */
	@Test
	void testContactUpdatePhone() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getPhone().equals("1234567890"));

		Assertions.assertDoesNotThrow(() -> {
			service.updateContactPhone(contact.getContactID(), "9876543210");
		});

		assertTrue(service.contacts.get(contact.getContactID()).getPhone().equals("9876543210"));
	}
	
	@Test
	void testContactUpdatePhoneTooLong() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getPhone().equals("1234567890"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactPhone(contact.getContactID(), "98765432101");
		});
	}
	
	@Test
	void testContactUpdatePhoneTooShort() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getPhone().equals("1234567890"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactPhone(contact.getContactID(), "987654321");
		});
	}
	
	@Test
	void testContactUpdatePhoneNull() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getPhone().equals("1234567890"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactPhone(contact.getContactID(), null);
		});
	}
	
	@Test
	void testContactUpdatePhoneInvalidID() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getPhone().equals("1234567890"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactPhone("A123", "9876543210");
		});
	}

	/** Update Address Tests
	 * 
	 */
	@Test
	void testContactUpdateAddress() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getAddress().equals("1 Main St, City, NJ 08807"));

		Assertions.assertDoesNotThrow(() -> {
			service.updateContactAddress(contact.getContactID(), "42 Smith St, City, NJ 08807");
		});

		assertTrue(service.contacts.get(contact.getContactID()).getAddress().equals("42 Smith St, City, NJ 08807"));
	}
	
	@Test
	void testContactUpdateAddressTooLong() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getAddress().equals("1 Main St, City, NJ 08807"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactAddress(contact.getContactID(), "1 East Longvalley View Bulevard, City, NJ 08807");
		});
	}
	
	@Test
	void testContactUpdateAddressNull() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getAddress().equals("1 Main St, City, NJ 08807"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactAddress(contact.getContactID(), null);
		});
	}
	
	@Test
	void testContactUpdateAddressInvalidID() {
		ContactService service = new ContactService();
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		service.addContact(contact);
		
		assertTrue(service.contacts.containsKey(contact.getContactID()));
		assertTrue(service.contacts.get(contact.getContactID()).getAddress().equals("1 Main St, City, NJ 08807"));

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactAddress("A123", "42 Smith St, City, NJ 08807");
		});
	}

}


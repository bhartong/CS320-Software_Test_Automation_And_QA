package module3test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import module3.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		assertTrue(contact.getContactID().equals("A35JC"));
		assertTrue(contact.getFirstName().equals("Brian"));
		assertTrue(contact.getLastName().equals("Hartong"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("1 Main St, City, NJ 08807"));
	}
	
	/** Contact ID Tests
	 * Maximum 10 Characters
	 * Cannot be null
	 * Cannot be updateable
	 */
	@Test
	void testContactID() {
		Assertions.assertDoesNotThrow(() -> {
			new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789A", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	
	@Test
	void testContactIDUpdate() {
		Assertions.assertThrows(UnsupportedOperationException.class, () -> {
			Contact contact = new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
			contact.setContactID("12345");
		});
	}
	
	/** First Name Tests
	 * Maximum 10 Characters
	 * Cannot be null
	 */
	@Test
	void testContactFirstName() {
		Assertions.assertDoesNotThrow(() -> {
			new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian67890A", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", null, "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	
	/** Last Name Tests
	 * Maximum 10 Characters
	 * Cannot be null
	 */
	@Test
	void testContactLastName() {
		Assertions.assertDoesNotThrow(() -> {
			new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian", "Hartong890A", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian", null, "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	
	/** Phone Tests
	 * Must be 10 Characters
	 * Cannot be null
	 */
	@Test
	void testContactPhone() {
		Assertions.assertDoesNotThrow(() -> {
			new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	@Test
	void testPhoneTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian", "Hartong", "12345", "1 Main St, City, NJ 08807" );
		});
	}
	@Test
	void testPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian", "Hartong", "12345678901", "1 Main St, City, NJ 08807" );
		});
	}
	
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian", "Hartong", null, "1 Main St, City, NJ 08807" );
		});
	}
	
	/** Address Tests
	 * Maximum 30 Characters
	 * Cannot be null
	 */
	@Test
	void testContactAddress() {
		Assertions.assertDoesNotThrow(() -> {
			new Contact("A35JC", "Brian", "Hartong", "1234567890", "1 Main St, City, NJ 08807" );
		});
	}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian", "Hartong", "1234567890", "1 East Longvalley View Bulevard, City, NJ 08807" );
		});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0123456789", "Brian", "Hartong", "1234567890", null );
		});
	}
}

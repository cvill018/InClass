import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

	private static final int INITIAL_RATING = 5;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testStudent() { 
		try {
		Student	s = new Student();
		
		Integer rating = s.getRating();
		Integer expected = INITIAL_RATING;
		
		assertEquals(expected, rating);
		} catch (NameException e) {
			fail();
		}
	}
	@Test
	public void testCompareTo() throws NameException{
		Student firstStudent = new Student("x", "Y", 2);
		Student secondStudent = new Student("x", "Y", 3);		
		
		boolean result = false;
		int actual = secondStudent.compareTo(firstStudent);
		// should be bigger than zero
		if (actual > 0) {
			result = true;
		}
		assertTrue(result);

		result = false;
		Student student = new Student("x", "Y", 5);	
		
		actual = secondStudent.compareTo(student);
		if(actual < 0) {
			result = true;
		}
		assertTrue(result);
		
		result = false;
		
		Student studentSame =  new Student("x", "Y", 3);
		actual = secondStudent.compareTo(studentSame);
		int expected = 0;
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testGet() throws NameException {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
		
	}

}

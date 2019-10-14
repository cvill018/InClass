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
		Student s;
		try {
			s = new Student();
		
		Integer rating = s.getRating();
		Integer expected = INITIAL_RATING;
		
		assertEquals(expected, rating);
		} catch (NameException e) {
			fail("");
		}
	}
	
	public void testCompareTo() {
		fail("Not yet implemented");
	}

}

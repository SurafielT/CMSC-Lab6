import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {

	GradeBook FirstSet;
	GradeBook SecondSet;
	@Before
	public void setUp() throws Exception {
		FirstSet = new GradeBook(5);
		SecondSet = new GradeBook(5);
		FirstSet.addScore(32);
		FirstSet.addScore(42);
		SecondSet.addScore(15);
		SecondSet.addScore(8);
		SecondSet.addScore(53);
	}

	@After
	public void tearDown() throws Exception {
		FirstSet = null;
		SecondSet = null;
	}


	@Test
	public void testAddScore() {
		assertTrue(FirstSet.toString().equals("32.0 42.0 "));
		assertTrue(SecondSet.toString().equals("15.0 8.0 53.0 "));
	}

	@Test
	public void testSum() {
		assertEquals(74, FirstSet.sum(), .0001);
		assertEquals(76, SecondSet.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(32, FirstSet.minimum(), .001);
		assertEquals(8, SecondSet.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(42, FirstSet.finalScore(), .001);
		assertEquals(68, SecondSet.finalScore(), .001);
	}

	@Test
	public void testGetScore() {
		assertEquals(2, FirstSet.getScoreSize(), .001);
		assertEquals(3, SecondSet.getScoreSize(), .001);
	}

	@Test
	public void testToString() {
		assertTrue(FirstSet.toString().equals("32.0 42.0 "));
		assertTrue(SecondSet.toString().equals("15.0 8.0 53.0 "));
	}

}

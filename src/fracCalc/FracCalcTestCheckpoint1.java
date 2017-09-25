package fracCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1 {
	@Test
	public void testCheckpoint1_1() {
		assertForCheckpoint1("2", FracCalc.produceAnswer("2 + 2"));
	}

	@Test
	public void testCheckpoint1_2() {
		assertForCheckpoint1("20", FracCalc.produceAnswer("-3/7 - 20"));
	}

	@Test
	public void testCheckpoint1_3() {
		assertForCheckpoint1("-20", FracCalc.produceAnswer("-3/7 - -20"));
	}

	@Test
	public void testCheckpoint1_4() {
		assertForCheckpoint1("6_5/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));
	}

	@Test
	public void testCheckpoint1_5() {
		assertForCheckpoint1("16_5/8", FracCalc.produceAnswer("5_3/4 + 16_5/8"));
	}

	@Test
	public void testCheckpoint1_6() {
		assertForCheckpoint1("-6_5/8", FracCalc.produceAnswer("5_3/4 + -6_5/8"));
	}

	@Test
	public void testCheckpoint1_7() {
		assertForCheckpoint1("7/21", FracCalc.produceAnswer("-32 - 7/21"));
	}

	@Test
	public void testCheckpoint1_8() {
		assertForCheckpoint1("27/21", FracCalc.produceAnswer("-32 - 27/21"));
	}

	@Test
	public void testCheckpoint1_9() {
		assertForCheckpoint1("-27/21", FracCalc.produceAnswer("-32 - -27/21"));
	}

	public static void assertForCheckpoint1(String answer1, String candidate) {
		if (candidate == null) {
			System.err.println("FAILURE: Your calculator returned a null string");
			assertEquals("See console window for failure info", true, false);
			return;
		}

		// Candidate must match answer1
		if (answer1 != null && candidate.equals(answer1)) {
			// Passed
			return;
		}
		
		System.err.println(
				"FAILURE: Your calculator's answer: '" + candidate + "' did not match the expected answer(s) below");
		if (answer1 != null) {
			System.err.println("Checkpoint 1: Expected: '" + answer1 + "'");
		}
		
		assertEquals("See console window for failure info", true, false);
	}

}

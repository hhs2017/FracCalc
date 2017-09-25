package fracCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Checkpoint 2-only tests
public class FracCalcTestCheckpoint2 {
	@Test
	public void testCheckpoint2_1() {
		assertForCheckpoint2(null, "numerator:2 denominator:1", FracCalc.produceAnswer("2 + 2"));
	}

	@Test
	public void testCheckpoint2_2() {
		assertForCheckpoint2(null, "numerator:20 denominator:1", FracCalc.produceAnswer("-3/7 - 20"));
	}

	@Test
	public void testCheckpoint2_3() {
		assertForCheckpoint2(null, "numerator:-20 denominator:1", FracCalc.produceAnswer("-3/7 - -20"));
	}

	@Test
	public void testCheckpoint2_4() {
		assertForCheckpoint2(null, "numerator:53 denominator:8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));
	}

	@Test
	public void testCheckpoint2_5() {
		assertForCheckpoint2(null, "numerator:133 denominator:8", FracCalc.produceAnswer("5_3/4 + 16_5/8"));
	}

	@Test
	public void testCheckpoint2_6() {
		assertForCheckpoint2(null, "numerator:-53 denominator:8", FracCalc.produceAnswer("5_3/4 + -6_5/8"));
	}

	@Test
	public void testCheckpoint2_7() {
		assertForCheckpoint2(null, "numerator:7 denominator:21", FracCalc.produceAnswer("-32 - 7/21"));
	}

	@Test
	public void testCheckpoint2_8() {
		assertForCheckpoint2(null, "numerator:27 denominator:21", FracCalc.produceAnswer("-32 - 27/21"));
	}

	@Test
	public void testCheckpoint2_9() {
		assertForCheckpoint2(null, "numerator:-27 denominator:21", FracCalc.produceAnswer("-32 - -27/21"));
	}

	@Test
	public void testCheckpoint2_10() {
		assertForCheckpoint2(null, "numerator:27 denominator:21", FracCalc.produceAnswer("32 - 27/21"));
	}

	public static void assertForCheckpoint2(String answer1, String answer2, String candidate) {
		if (candidate == null) {
			System.err.println("FAILURE: Your calculator returned a null string");
			assertEquals("See console window for failure info", true, false);
			return;
		}

		// Candidate must match answer1, answer2, or must reduce to answer3
		if (answer1 != null && candidate.equals(answer1)) {
			// Passed
			return;
		}
		if (answer2 != null && candidate.equals(answer2)) {
			// Passed
			return;
		}

		System.err.println(
				"FAILURE: Your calculator's answer: '" + candidate + "' did not match the expected answer(s) below");
		if (answer1 != null) {
			System.err.println("Checkpoint 1: Expected: '" + answer1 + "'");
		}
		if (answer2 != null) {
			System.err.println("Checkpoint 2: Expected: '" + answer2 + "'");
		}
		assertEquals("See console window for failure info", true, false);
	}
}

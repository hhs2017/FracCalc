package fracCalc;
/**
 * Object to represent a fraction with a numerator and a denominator.
 * Intended for proper and improper fractions, but not mixed fractions.
 * 
 * Usage:
 * 		Fraction frac = new Fraction(3, 5);
 * 		int numerator = frac.getNumerator();
 * 		int denominator = frac.getDenominator();
 * 
 * This leads to numerator being 3, and denominator being 5.
 */
public class Fraction {
	private int numerator;
	private int denominator;	
	
	/**
	 * Constructor to create a Fraction object.
	 * @param num	the numerator of the fraction
	 * @param denom	the denominator of the fraction
	 */
	public Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
	}

	/**
	 * Returns the numerator of the fraction.
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the denominator of the fraction.
	 */
	public int getDenominator() {
		return denominator;
	}

}
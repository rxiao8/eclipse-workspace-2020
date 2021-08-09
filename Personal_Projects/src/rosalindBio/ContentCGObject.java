package rosalindBio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class ContentCGObject {

	private String iD;
	ArrayList<String> dna = new ArrayList<String>();
	private int cGCount;
	private double percentage;

	public ContentCGObject(String iD, String dnaString) {
		iD.trim();
		dnaString.trim();
		this.iD = iD.substring(1);
		for (int i = 0; i < dnaString.length(); i++) {
			String j = Character.toString(dnaString.charAt(i));
			dna.add(j);
		}

	}

	public String getiD() {
		return this.iD;
	}

	public void countCG() {
		for (String base : dna) {
			if (base.equals("C") || base.equals("G")) {
				cGCount++;
			} else {
				continue;
			}
		}
	}

	public void calcPercent() {
		double dividing = ((double) cGCount / (double) dna.size()) * 100;
		BigDecimal bd = new BigDecimal(dividing).setScale(2, RoundingMode.HALF_UP);
		percentage = bd.doubleValue();
		;
	}

	public double getPercent() {
		return percentage;
	}

	public static void main(String[] args) {
//		ContentCGObject one = new ContentCGObject(">fladjfld", "ACGTTTTTCGA");
//		one.countCG();
//		one.calcPercent();
//		System.out.print(one.getPercent() + one.getiD());

	}
}


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
	/**
	 * Jane Austen is a women, so say “Hello Ms. Austen”. George Orwell is a man, so
	 * say “Hello Mr. Orwell”. Isaac Newton was knighted, so say "Hello Sir Isaac
	 * Newton".
	 **/

	@Test
	public void test() {
		TeaParty teaParty = new TeaParty();
		//String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
}

class Tea {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;

public Tea(String name, boolean isWoman, boolean isKnighted) {
	this.name = name;
	this.isWoman = isWoman;
	this.isKnighted = isKnighted;
	}
public void setName(String name) {
	this.name = name;
}
public String getName() {
	return name;
}
public void setGender(boolean isWoman) {
	this.isWoman = isWoman;
}
public boolean getGender() {
	return isWoman;
}
public void settitle(boolean isKnighted) {
	this.isKnighted = isKnighted;
}
public boolean getTitle() {
	return isKnighted;
}

}

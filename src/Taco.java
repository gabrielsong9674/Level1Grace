
public class Taco {
	private String meat = "turkey";
	private String sauce = "mild";
	public Taco(String meat, String sauce) {
		this.meat = meat;
		this.sauce = sauce;
		System.out.println("The constructor was called");
	}
	public Taco() {
		meat = "beef";
		sauce = "hot";
	}
	public String getMeat() {
		return meat;
	}
	public String getSauce() {
		return sauce;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public String toString() {
		return "this taco has this meat: " +meat+ " and this sauce: " +sauce+".";
	}
}
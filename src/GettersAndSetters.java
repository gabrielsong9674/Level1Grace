
public class GettersAndSetters {
	public static void main(String[] args) {
		Taco taco = new Taco();
		Taco taco2 = new Taco();
		Taco taco3 = new Taco("turkey", "spicy");
		taco.setMeat("turkey");
		taco.setSauce("mild");
		System.out.println(taco.getMeat());
		System.out.println(taco.getSauce());	
		taco2.setMeat("chicken");
		taco.setSauce("medium");
		System.out.println(taco2);
	}
}

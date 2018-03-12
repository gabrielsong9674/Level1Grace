
public class TeaParty {

	// If the guest has been knighted by the Queen and is male, use the title "Sir"
	// before their name to greet them,
	//
	// otherwise if the guest is a male, use the title "Mr." before their name.
	//
	// If the guest has been knighted by the Queen and is female, use the title
	// "Lady" before their name to greet them,
	//
	// otherwise if the guest is a female, use the title "Ms." before their name.

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isWoman == false && isKnighted == true) {
			return "Hello Sir " + name;
		} else if (isWoman == false && isKnighted == false) {
			return "Hello Mr. " + name;
		}else if(isWoman == true && isKnighted == false){
			return "Hello Ms. " + name;
		}
		return null;
	}
}

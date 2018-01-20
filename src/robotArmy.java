public class robotArmy {
	public static void main(String[] asd) {
		// 1. create a new human
		Human grace = new Human("Grace");
		// 2. create a new Robot army of good and evil robots.
		Robot one = new Robot("one", true);
		Robot two = new Robot("two", false);
		Robot three = new Robot("three", true);
		// 3. command your robot army to destroy a human
		one.destroy(grace);
		two.destroy(grace);
		three.destroy(grace);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;

	public Human(String name) {
		this.name = name;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}

	public void die() {
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;

	public Robot(String name, boolean isEvil) {
		this.name = name;
		this.isEvil = isEvil;
	}

	public void destroy(Human man) {
		if (isEvil) {
			System.out
					.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		} else {
			System.out.println("No!! The robot " + name + " loves " + man.getName());
		}
	}
}

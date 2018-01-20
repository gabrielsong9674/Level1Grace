import java.util.Random;

public class RobotHouses {
	public static void main(String[] args) {
		HouseMaker house = new HouseMaker();
		house.leftCorner();
		for (int i = 0; i < 3; i++) {
			house.makeHouseColor("red");
			house.makeHouseColor("yellow");
			house.makeHouseColor("blue");
		}
	}
}

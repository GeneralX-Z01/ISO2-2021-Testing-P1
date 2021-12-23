import java.util.Scanner;

public class appCaseMessages {
	String appcase1 = "you can stay at home";
	String appcase2 = "you can go for skiing";
	String appcase3 = "you cango for hiking";
	String appcase4 = "you can go for sightseeing";
	String appcase5 = "you can go for a beer";
	String appcase6 = "you can go to beach or swimming pool";
	boolean LegalController;
	Scanner sc = new Scanner(System.in);

	public void Tema() {
		System.out.println("is there any legal restriction for activity?");
		LegalController = sc.nextBoolean();

		if (LegalController == true) {
			System.out.println("The individual is not allowed to go to the activity due to legal restrictions");
		}

		else {
			System.out.println("The individual is allowed to go to the activity. Have fun!");
		}

	}

}

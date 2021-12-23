public class Person {
	boolean health;
	boolean symptoms;
	boolean contact;
	boolean CovidPassed;
	boolean vaccination;

	public void checkaord() {
		if (health == true && symptoms == false && contact == false && CovidPassed == true && vaccination == true) {
			System.out.println("The person is allowed for activities");

		} else {
			System.out.println("The person is not allowed for activities");
			System.exit(1);
		}
	}
}

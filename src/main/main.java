import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		while (true) {
			System.out.println("Enter the details of individual:");

			System.out.println("is the individual healthy? (true for 'yes', false for 'no'): ");

			p1.health = sc.nextBoolean();

			System.out.println("do the individual has covid symptoms? (true for 'yes', false for 'no'): ");

			p1.symptoms = sc.nextBoolean();

			System.out.println(
					"do the individual has been in contact with someone is infected within last 14 days? (true for 'yes', false for 'no'): ");

			p1.symptoms = sc.nextBoolean();

			System.out.println("has the individual passed covid? (true for 'yes', false for 'no'): ");

			p1.CovidPassed = sc.nextBoolean();

			System.out.println("has the individual got vaccinated against COVID? (true for 'yes', false for 'no'): ");

			p1.vaccination = sc.nextBoolean();

			p1.checkaord();

			Weather w1 = new Weather();
			appCaseMessages acm1 = new appCaseMessages();
			appCaseMessages acm2 = new appCaseMessages();

			System.out.println("weather temperature:");
			w1.temperature = sc.nextInt();

			System.out.println("weather humidity level:");
			w1.humidityLevel = sc.nextInt();

			System.out.println("weather rain precipitation: (true/false)");
			w1.rainPrecipitation = sc.nextBoolean();

			System.out.println("weather snow precipitation: (true/false)");
			w1.snowPrecipitation = sc.nextBoolean();

			System.out.println("cloud: (true/false)");
			w1.cloud = sc.nextBoolean();

			if (w1.temperature < 0 && w1.humidityLevel <= 15 && w1.rainPrecipitation == true
					&& w1.snowPrecipitation == true) {
				System.out.println(acm1.appcase1);
			} else if (w1.temperature < 0 && w1.humidityLevel <= 15 && w1.rainPrecipitation == false
					&& w1.snowPrecipitation == false) {
				System.out.println(acm1.appcase2);
				acm2.Tema();
			} else if (w1.temperature > 0 && w1.temperature <= 15 && w1.rainPrecipitation == false) {
				System.out.println(acm1.appcase3);
				acm2.Tema();
			} else if (w1.temperature > 15 && w1.temperature <= 25 && w1.rainPrecipitation == false
					&& w1.cloud == false) {
				System.out.println(acm1.appcase4);
				acm2.Tema();
			} else if (w1.temperature > 25 && w1.temperature <= 30 && w1.rainPrecipitation == false) {
				System.out.println(acm1.appcase5);
				acm2.Tema();
			} else if (w1.temperature > 30 && w1.rainPrecipitation == false) {
				System.out.println(acm1.appcase6);
				acm2.Tema();
			} else {
				System.out.println("condition not found. Do whatever you want");
			}
			boolean devam;
			System.out.println("Would you like to continue?");
			devam = sc.nextBoolean();
			if (devam == false)
				break;
		}

	}
}

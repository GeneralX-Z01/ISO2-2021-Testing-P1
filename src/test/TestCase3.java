import org.junit.Test;

public class TestCase3 {
	@Test
	public void testcase3() {
		Person p1 = new Person();
		p1.health = true;
		p1.symptoms = false;
		p1.contact = false;
		p1.CovidPassed = true;
		p1.vaccination = false;
		p1.checkaord();
	}
}

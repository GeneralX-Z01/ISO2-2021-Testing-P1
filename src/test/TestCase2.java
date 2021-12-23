import org.junit.Test;

public class TestCase2 {
	@Test
	public void testcase2() {
		Person p1 = new Person();
		p1.health = true;
		p1.symptoms = true;
		p1.contact = false;
		p1.CovidPassed = false;
		p1.vaccination = true;
		p1.checkaord();

	}
}

package topic13;

import static org.junit.Assert.*;
import myapp.MyController;

import org.junit.Test;


public class MyApplicationTest {
	@Test
	public void returnValidJSON(){
		assertEquals("{\"id\":123}", new MyController().test("World"));
	}
}

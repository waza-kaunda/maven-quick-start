package clinic.programming.training;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest{

	private Application app;
	
	@Before
	public void start(){
		app = new Application();
	}
	
	@Test
	public void testWordCountString(){
		int count = app.countWords("this is a test");
		assertTrue(count == 4);
	}
	
	@Test
	public void testWordCountEmpty(){
		int count = app.countWords("");
		assertTrue(count == 0);
	}
	
	@Test
	public void testWordCountNull(){
		int count = app.countWords(null);
		assertTrue(count == 0);
	}
	
	@Test
	@Ignore
	public void testWordCountMore(){
		int count = app.countWords("This will be skipped");
		assertTrue(count == 1);
	}
	
	public void testWordCountSingle(){
		int count = app.countWords("test");
		assertTrue(count == 1);
	}
}
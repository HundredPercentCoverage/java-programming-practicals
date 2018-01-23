package booker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KindleBookTest {

	// Test data
	String validAuthor, validBookName;
	int pagesLowerBound, pagesUpperBound;
	int validNumberOfPagesEP;
	
	@Before
	public void setUp() throws Exception {
		validAuthor = "Valid Author";
		validBookName = "Valid Book Name";
		pagesLowerBound = 1;
		pagesUpperBound = 360;
		validNumberOfPagesEP = 180;
	}

	@Test
	public void testKindleBook() {
		KindleBook kb = new KindleBook();
		assertNotNull(kb);
	}

	@Test
	public void testKindleBookConstructorWithArgs() {
		KindleBook kb = new KindleBook(validBookName, validAuthor, validNumberOfPagesEP);
		
		assertEquals(validBookName, kb.getBookName());
		assertEquals(validAuthor, kb.getAuthorName());;
		assertEquals(validNumberOfPagesEP, kb.getNumberOfPages());
	}

	@Test
	public void testGetSetBookNameValid() {
		KindleBook kb = new KindleBook();
		kb.setBookName(validBookName);
		
		assertEquals(validBookName, kb.getBookName());
	}

	@Test
	public void testGetSetAuthorNameValid() {
		KindleBook kb = new KindleBook();
		kb.setAuthorName(validAuthor);
		
		assertEquals(validAuthor, kb.getAuthorName());;
	}

	@Test
	public void testGetSetNumberOfPagesValid() {
		KindleBook kb = new KindleBook();
		
		kb.setNumberOfPages(180);
		assertEquals(180, kb.getNumberOfPages());
		
		kb.setNumberOfPages(1);
		assertEquals(1, kb.getNumberOfPages());
		
		kb.setNumberOfPages(2);
		assertEquals(2, kb.getNumberOfPages());
		
		kb.setNumberOfPages(359);
		assertEquals(359, kb.getNumberOfPages());
		
		kb.setNumberOfPages(360);
		assertEquals(360, kb.getNumberOfPages());
	}
	
	@Test
	public void testGetSetNumberOfPagesInvalid() {
		KindleBook kb = new KindleBook();
		
		kb.setNumberOfPages(0);
		assertEquals(0, kb.getNumberOfPages());
		
		kb.setNumberOfPages(361);
		assertEquals(0, kb.getNumberOfPages());
	}

	@Test
	public void testCalculateEPages() {
		KindleBook kb = new KindleBook();
		kb.setNumberOfPages(validNumberOfPagesEP);
		assertEquals(validNumberOfPagesEP * 2.5, kb.calculateEPages(), 0.1);
	}

}

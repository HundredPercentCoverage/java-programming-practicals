package booker;


public class KindleBook {

	private String bookName, authorName;
	private int numberOfPages;
	
	/**
	 * Minimum no. of pages a book can have
	 */
	private static final int MIN_PAGES = 1;
	
	/**
	 * Maximum valid number of pages for a book
	 */
	private static final int MAX_PAGES = 360;
	
	/**
	 * Default value for numberOfPages if argument is not valid
	 */
	private static final int DEFAULT_PAGES = 0;
	
	/**
	 * Default name for author or book if input is invalid
	 */
	private static final String DEFAULT_STRING = "Default";

	/**
	 * Factor for calculating the number of epages per physical page
	 */
	private static final double PAGE_FACTOR = 2.5;
	
	/**
	 * Default constructor
	 */
	public KindleBook() {
		
	}
	
	/**
	 * Constructor with args
	 * @param bookName
	 * @param authorName
	 * @param numberOfPages
	 */
	public KindleBook(String bookName, String authorName, int numberOfPages) {
		this.setBookName(bookName);
		this.setAuthorName(authorName);
		this.setNumberOfPages(numberOfPages);
	}

	/**
	 * Returns the book name
	 * @return bookName
	 */
	public String getBookName() {
		return this.bookName;
	}

	/**
	 * Sets book name. Null or empty arguments (with leading or trailing whitespace removed) are invalid and will set the 
	 * value to 'Default'. If the input is valid any leading or trailing whitespace will be removed when setting the bookName.
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		if (bookName == null) {
			System.out.println("Error - empty author field. Setting to 'Default'");
			this.bookName = DEFAULT_STRING;
		} else if (bookName.trim().length() == 0) {
			System.out.println("Error - empty author field. Setting to 'Default'");
			this.bookName = DEFAULT_STRING;
		} else {
			this.bookName = bookName.trim();
		}
	}
	
	/**
	 * Returns the name of the book author
	 * @return the authorName
	 */
	public String getAuthorName() {
		return this.authorName;
	}

	/**
	 * Sets author name. Null or empty arguments (with leading or trailing whitespace removed) are invalid and will set the 
	 * value to 'Default'. If the input is valid any leading or trailing whitespace will be removed when setting the authorName.
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		if (authorName == null) {
			System.out.println("Error - empty author field. Setting to 'Default'");
			this.authorName = DEFAULT_STRING;
		} else if (authorName.trim().length() == 0) {
			System.out.println("Error - empty author field. Setting to 'Default'");
			this.authorName = DEFAULT_STRING;
		} else {
			this.authorName = authorName.trim();
		}
	}

	/**
	 * Returns the number of pages
	 * @return numberOfPages
	 */
	public int getNumberOfPages() {
		return this.numberOfPages;
	}

	/**
	 * Sets the number of pages. Valid arguments must be within range of MIN_PAGES and MAX_PAGES, otherwise will be set to 0.
	 * @param pages The number of pages to set
	 */
	public void setNumberOfPages(int pages) {
		if (pages >= MIN_PAGES && pages <= MAX_PAGES) {
			this.numberOfPages = pages;
		} else {
			System.out.println("Error - invalid number of pages. Setting to default (0)");
			this.numberOfPages = DEFAULT_PAGES;
		}
	}	

	/**
	 * Calculates the number of epages based on the size of the screen used in the
	 * Kindle reader i.e. the number of pages * 2.5
	 * 
	 * @return the number of epages
	 */
	public double calculateEPages() {
		return this.numberOfPages * PAGE_FACTOR;
	}

}

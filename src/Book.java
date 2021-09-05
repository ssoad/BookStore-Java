
public class Book 
{

	String bookTitle;
	String bookAuthor;
	int numOfCopies;
	
	
	public Book(String bookTitle, String bookAuthor,int numOfCopies) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.numOfCopies = numOfCopies;
	}
	
	public void display()
	{
		System.out.printf("Title:%s", bookTitle);
		System.out.printf("\tAuthor:%s", bookAuthor);
		System.out.printf("\tQuantity:%d\n", numOfCopies);
	}
	
}



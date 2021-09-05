import java.util.Scanner;
import java.util.ArrayList;
public class BookStore {
	ArrayList<Book> books = new ArrayList<Book>();
	boolean ch=false;
	Scanner input = new Scanner(System.in);
	
	
	public void sell(String Title, String Author,int Quantity) {
		Book book = findBook(Title, Author);
		if (book!=null){
			book.numOfCopies-=Quantity;
		}else{
			System.out.println("Book Not Found");
		}
	}

	public void order(String Title,String Author, int Quantity)
	{
		Book book = findBook(Title, Author);
		if (book!=null){
			book.numOfCopies+=Quantity;
		}else{
			Book newbook=new Book(Title, Author,Quantity);
			books.add(newbook);
		}
	}
	
	public void display()
	{
		int i;
		for(i=0;i<books.size();i++)
		{
			if(books.get(i)== null)
			{
				break;
			}
			books.get(i).display();
		}
	}


	private Book findBook(String bookTitle, String author){
		int i;
		Book book = null;
		for(i=0;i<books.size();i++)
		{
			if(books.get(i)== null)
			{
				break;
			}
			if((books.get(i).bookTitle.equals(bookTitle))&&(books.get(i).bookAuthor.equals(author)))
			{
				return books.get(i);
			}
			
		}
		return book;
	}
}
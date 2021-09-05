import java.util.Scanner;
public class BookStoreApp {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
			BookStore a= new BookStore();
			int op=1;
			while(op!=0)
			{
				System.out.printf("1. Display");
				System.out.printf("\n2. Order");
				System.out.printf("\n3. Sell");
				System.out.printf("\n4. Exit\n");
				op=inp.nextInt();
				System.out.println(op);
				if(op==1)
				{
					a.display();
				}
				else if(op==2)
				{
					String title,author;
					int q;
					System.out.printf("Enter Title:" );
					title=inp.next();
					System.out.printf("Enter Author:" );
					author=inp.next();
					System.out.printf("Enter Quantity:" );
					q=inp.nextInt();
					a.order(title,author,q);
				}
				
				else if(op==3)
				{
					String title,author;
					int q;
					System.out.printf("Enter Title:" );
					title=inp.next();
					System.out.printf("Enter Author:" );
					author=inp.next();
					System.out.printf("Enter Quantity:" );
					q=inp.nextInt();
					a.sell(title,author,q);
				}
				
				else
				{
					System.exit(0);
				}
			}
			
	}

}

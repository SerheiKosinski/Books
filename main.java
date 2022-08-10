package book;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) {
		int i = 4;
		book[] Book = new book[i];
		
		Book[0] = new book (1111 , "Война и мир" , "Л.Н.Тостой" , "Лексика" , 1996 , 879 , 55, "твердый");
		Book[1] = new book (2222 , "Записки охотника" , "И.С.Тургеньев" , "Москва" , 1999 , 231 ,84 , "мягкий");
		Book[2] = new book (3333 , "Герой нашего времени" , "М.Ю.Лермонтов" , "Лексика" , 1990 , 154 , 88 , "твердый");
		Book[3] = new book (4444 , "А.С.Пушкин. Стихи", "А.С.Пушкин","Печатник" , 1998 , 300 , 54, "твердый");
		
		   logic logica = new logic();
		
		List<book> byAuthor = logica.bookAuthor(Book, "М.Ю.Лермонтов");
		List<book> byPublisher = logica.bookPublisher(Book, "Лексика");
		List<book> byYear = logica.bookYear(Book, 1999);
		
	       bookView print = new bookView();

        System.out.println("Книги заданного автора");
        print.printBooks(byAuthor);
       
        System.out.println("Книги, выпущенные заданным издательством");
        print.printBooks(byPublisher);
       
        System.out.println("Книги, выпущенные после заданного года");
        print.printBooks(byYear);
      
		
	
	}
		
	}

package book;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) {
		int i = 4;
		book[] Book = new book[i];
		
		Book[0] = new book (1111 , "����� � ���" , "�.�.������" , "�������" , 1996 , 879 , 55, "�������");
		Book[1] = new book (2222 , "������� ��������" , "�.�.���������" , "������" , 1999 , 231 ,84 , "������");
		Book[2] = new book (3333 , "����� ������ �������" , "�.�.���������" , "�������" , 1990 , 154 , 88 , "�������");
		Book[3] = new book (4444 , "�.�.������. �����", "�.�.������","��������" , 1998 , 300 , 54, "�������");
		
		   logic logica = new logic();
		
		List<book> byAuthor = logica.bookAuthor(Book, "�.�.���������");
		List<book> byPublisher = logica.bookPublisher(Book, "�������");
		List<book> byYear = logica.bookYear(Book, 1999);
		
	       bookView print = new bookView();

        System.out.println("����� ��������� ������");
        print.printBooks(byAuthor);
       
        System.out.println("�����, ���������� �������� �������������");
        print.printBooks(byPublisher);
       
        System.out.println("�����, ���������� ����� ��������� ����");
        print.printBooks(byYear);
      
		
	
	}
		
	}

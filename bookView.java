package book;

import java.util.List;

public class bookView {
	public void printBooks(List<book> k) {
		for (book b : k) {
			System.out.println("ID: " + b.getId() + "; ��������: " + b.getTitle() +  "; �����: " + b.getAuthor() + ";  ��� �������: " + b.getPublishingHouse() + ";  ���������� �������: " + b.getPages() + ";  ����: " + b.getPrice() + ";  ��������: " + b.getBinding());
		}
		System.out.println();
    }

}

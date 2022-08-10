package book;

import java.util.List;

public class bookView {
	public void printBooks(List<book> k) {
		for (book b : k) {
			System.out.println("ID: " + b.getId() + "; Название: " + b.getTitle() +  "; Автор: " + b.getAuthor() + ";  Год издания: " + b.getPublishingHouse() + ";  Колочество страниц: " + b.getPages() + ";  Цена: " + b.getPrice() + ";  Переплет: " + b.getBinding());
		}
		System.out.println();
    }

}

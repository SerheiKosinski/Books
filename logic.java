package book;
import java.util.ArrayList;
import java.util.List;
public class logic {
	
	public List<book> bookAuthor(book[] k, String author) {
		List<book> result = new ArrayList<book>();

		for (book b : k) {
			if (author.equals(b.getAuthor())) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<book> bookPublisher(book[] k, String publishingHouse) {
		List<book> result = new ArrayList<book>();

		for (book b : k) {
			if (publishingHouse.equals(b.getPublishingHouse())) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<book> bookYear(book[] k, int publicationYear) {
		List<book> result = new ArrayList<book>();

		for (book b : k) {
			if (publicationYear <= b.getPublicationYear()) {
				result.add(b);
			}
		}
		return result;
	}

}

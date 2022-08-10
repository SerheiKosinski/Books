package book;

import java.util.Objects;

public class book {

	private int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int publicationYear;
	private int pages;
	private double price;
	private String binding;
	
	public book() {
		this.id = 0;
		this.title = "";
		this.author = "";
		this.publishingHouse = "";
		this.publicationYear = 0;
		this.pages = 0;
		this.price = 0;
		this.binding = "";
	}

	public book(int id, String title, String author, String publishingHouse, int publicationYear, int pages, double price, String binding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.publicationYear = publicationYear;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, binding, id, pages, price, publicationYear, publishingHouse, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		book other = (book) obj;
		return Objects.equals(author, other.author) && Objects.equals(binding, other.binding) && id == other.id
				&& pages == other.pages && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& publicationYear == other.publicationYear && Objects.equals(publishingHouse, other.publishingHouse)
				&& Objects.equals(title, other.title);
	}
	
	
	
	
		
	}



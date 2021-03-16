package author_book;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	
	public Book(String name, Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getAuthorNames()
	{
		String authorNames ="";
		for(int i=0;i<authors.length-1;i++)
		{
			authorNames += authors[i].getName() + ", ";
		}
		authorNames += authors[authors.length-1].getName();
		return authorNames;
	}
	
}

package book.test;

public class Book {
private int booksId;
private String name;
private double price;
private String purpose;
private int count;
public Book(int booksId, String name, double price, int count, String purpose ) {
	super();
	this.booksId = booksId;
	this.name = name;
	this.price = price;
	this.count = count;
	this.purpose= purpose;
}

public String getPurpose() {
	return purpose;
}

public void setPurpose(String purpose) {
	this.purpose = purpose;
}

public int getBooksId() {
	return booksId;
}
public void setBooksId(int booksId) {
	this.booksId = booksId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
@Override
public String toString() {
	return "Book [booksId=" + booksId + ", name=" + name + ", price=" + price + ", count=" + count + "]";
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}



}

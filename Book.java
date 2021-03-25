package test;

public class Book {
String authorName;
int bookNumber;
public Book(String authorName,int bookNumber) {
	this.authorName=authorName;
	this.bookNumber=bookNumber;
}

public void printMyInfo() {
	System.out.println("authorname"+authorName);
	System.out.println("bookNumber"+bookNumber);
}
}

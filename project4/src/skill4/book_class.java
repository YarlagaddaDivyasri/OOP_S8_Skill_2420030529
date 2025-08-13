package skill4;
class Book {

 private String title;
 private String author;
 private double price;
 public void setTitle(String title) {
     this.title = title;
 }
 public String getTitle() {
     return title;
 }
 public void setAuthor(String author) {
     this.author = author;
 }
 public String getAuthor() {
     return author;
 }
 public void setPrice(double price) {
     this.price = price;
 }
 public double getPrice() {
     return price;
 }
 public String toString() {
     return "Book Details: " +
            "\nTitle: " + title +
            "\nAuthor: " + author +
            "\nPrice: ₹" + price;
 }
}
public class book_class {
 public static void main(String[] args) {
     Book myBook = new Book();
     myBook.setTitle("Java Programming");
     myBook.setAuthor("John Doe");
     myBook.setPrice(499.99);
     System.out.println(myBook);
 }
}
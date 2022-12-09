import java.util.*;
public class Book1 extends BookInformation {

   Scanner scnr = new Scanner(System.in);
   private String title;
   private String author;
   private String publisher;
   private String publicationDate;

   public Book1() {
   }

   //This is used to create new variables of Book1 whih can be used in the parent class.
   public Book1(String title, String author, String publisher, String publicationDate) {
       this.title = title;
       this.author = author;
       this.publisher = publisher;
       this.publicationDate = publicationDate;
   }


   //These are used in order to refer back to the parent class.
   public void setTitle(String userTitle) {
       title = userTitle;
   }

   //This is used to obtain the title.
   public String getTitle() {
      return title;
   }

   public void setAuthor(String userAuthor) {
      author = userAuthor;
   }

   public String getAuthor() {
      return author;
   }

   public void setPublisher(String userPublisher) {
      publisher = userPublisher;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublicationDate(String userPublicationDate) {
      publicationDate = userPublicationDate;
   }

   public String getPublicationDate() {
      return publicationDate;
   }

   //This is used in order to print the entirety of the book's data in the parent class. This was overrided to toString
   public void toString() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
      
   }
   
   
    
}

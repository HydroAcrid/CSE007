import java.util.*;
public class Book {

   Scanner scnr = new Scanner(System.in);
   private String title;
   private String author;
   private String publisher;
   private String publicationDate;

   public void setTitle(String userTitle) {
      userTitle = scnr.nextLine;
      title = userTitle;
   }

   public String getTitle() {
      return title;
   }

   public void setAuthor(String userAuthor) {
      userAuthor = scnr.nextLine;
      author = userAuthor;
   }

   public String getAuthor() {
      return author;
   }

   public void setPublisher(String userPublisher) {
      userPublisher = scnr.nextLine;
      publisher = userPublisher;
   }

   public String getPublisher() {
      return publisher;
   }

   public void setPublicationDate(String userPublicationDate) {
      userPublicationDate = scnr.nextLine;
      publicationDate = userPublicationDate;
   }

   public String getPublicationDate() {
      return publicationDate;
   }

   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
   }
}
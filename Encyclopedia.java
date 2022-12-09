/*
Kevin Dotel
11/20/21
CSE 7: Activity
This is the Encylopedia program
*/
public class Encyclopedia extends Book1 {
    private String title;
    private String author;
    private String publisher;
    private String publicationDate;
    private int edition = 0;
    private int volumes = 0;

    public Encyclopedia() {
    }

    public Encyclopedia(String edition, String volumes) {
        this.edition = edition;
        this.volumes = volumes;
    }

    //This is the 6 arg constructor used in the parent class
    public Encyclopedia(String edition, String volumes, String title, String publisher, String author, String publicationDate) {
        super(title, author, publisher, publicationDate);
        this.edition = edition;
        this.volumes = volumes;
    }

    public Encyclopedia(String title, String author, String publisher, String publicationDate) {
       super(title, author, publisher, publicationDate);
    }

    public void setTitle(String userTitle) {
        title = userTitle;
     }
  
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

     public void setEdition(int userEdition) {
        this.edition = userEdition;
    }

    public int getEdition() {
        return edition;
    }

    public void setVolumes(int userVolumes) {
        this.volumes = userVolumes;
    }
    
    public int getVolumes() {
        return volumes;
    }

    //This overridden in order to replace the printinfo
    public void toString() {
      super.toString();
      System.out.println("   Edition: " + edition);
      System.out.println("   Volumes: " + volumes);

    }
    
}
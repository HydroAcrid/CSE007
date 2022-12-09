public class Main {
    public static void main(String[]args){
        TVShow tvShow1 = new TVShow("Westworld","HBO",60);
        TVShow tvShow2 = new TVShow();
        tvShow2.name="Spongebob Squarepants";
        tvShow2.network="Nickelodeon";
        tvShow2.length=22;
    }
 
}

public class TVShow {
    // data fields
    String name;
    String network;
    int length;
 
    // methods/behaviors
    /** Construct a new default TV show. */
    public TVShow() {
        name = "n/a";
        network = "n/a";
        length = 0;
    }
    /** Construct a new TV show with given name, channel, 
 and length. */
    public TVShow(String aName, String aNetwork, int aLength) {
        name = aName;
        network = aNetwork;
        length = aLength;
    }
    /** Return the length of the show in hours. */
    public double getHours() {
        return length / 60.0;
    }
 }
 

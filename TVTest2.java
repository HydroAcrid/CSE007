/*
Kevin Dotel
10/13/21
CSE 7: Activity 2
This is the TVTest2 program
*/
public class TVTest2 {
    public static void main(String[]args) {
        TVShow[] schedule = new TVShow[5];
        setSchedule(schedule);
        airTime(schedule);
        airTime(schedule[0]);
        displayLineup(schedule);
    }

    public static void setSchedule(TVShow[]list) {
        list[0] = new TVShow("Schitt's Creek", 22.5);
        list[1] = new TVShow("Breaking Bad", 57.6);
        list[2] = new TVShow("Rick and Morty", 23.0);
        list[3] = new TVShow("Seinfield", 24.2);
        list[4] = new TVShow("Brooklyn 99", 23.5);
    }

    public static void airTime(TVShow[]list) {
        for(int i = 0; i < list.length; i++) {
            list[i].airEpisodes((int)(Math.random()*100));
        }
    }

    public static void airTime(TVShow show) {
        show.airEpisodes((int)(Math.random()*100));
    }

    public static void displayLineup(TVShow[]list) {
        System.out.println("There are " + TVShow.getShows() + " shows in this lineup"); 
        for(int i=0; i < list.length; i++) {
            list[i].display();
            System.out.println("There have been " + list[i].getEpisodes() + " episodes of " + list[i].getName() + " for a total airtime of "
             + list[i].getTotalAirtime() + " minutes.");
        }
    }
}

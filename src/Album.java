public class Album extends MediaItem {
    protected String artist;
    protected int year;
    protected int trackCount;

    /**
    constructor for Album
     */
    Album(){
        super();
        artist = "";
        year = 0;
        trackCount = 0;
    }

    //getters and setters for artist year and trackCount
/**
getter for artist
 */
    public String getArtist(){
        return artist;
    }

    /**
    setter for artist
     */
    public void setArtist(String s){
        if(!s.equals(artist)){
            artist = s;
        }
    }

    /**
    getter for year
     */
    public int getYear(){
        return year;
    }

    /**
    setter for year
     */
    public void setYear(int s){
        if(s != year){
            year = s;
        }
    }
/**
getter for TrackCount
 */
    public int getTrackCount(){
        return trackCount;
    }

    /**
    setter for TrackCount
     */
    public void setTrackCount(int s){
        if(s != trackCount){
            trackCount = s;
        }
    }

    /**
    toString
     */
    @Override
    public String summary(){
        String s = "";

        s = "Book" + "," + id + "," + title + "," + artist + "," + year + "," + trackCount;

        return s;
    }
}

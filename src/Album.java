public class Album extends MediaItem {
    protected String artist;
    protected int year;
    protected int trackCount;

    Album(){
        super();
        artist = "";
        year = 0;
        trackCount = 0;
    }

    //getters and setters for artist year and trackCount

    public String getArtist(){
        return artist;
    }

    public void setArtist(String s){
        if(!s.equals(artist)){
            artist = s;
        }
    }

    public int getYear(){
        return year;
    }

    public void setYear(int s){
        if(s != year){
            year = s;
        }
    }

    public int getTrackCount(){
        return trackCount;
    }

    public void setTrackCount(int s){
        if(s != trackCount){
            trackCount = s;
        }
    }

    @Override
    public String summary(){
        String s = "";

        s = "Book" + "," + id + "," + title + "," + artist + "," + year + "," + trackCount;

        return s;
    }
}

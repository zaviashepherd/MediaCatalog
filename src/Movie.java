public class Movie extends MediaItem {
    protected String director;
    protected int year;
    protected double runtimeMinutes;

    Movie(){
        super();
        director = "";
        year = 0;
        runtimeMinutes = 0.0;
    }

    //getters and setters for director year and runtime minutes
    public String getDirector(){
        return director;
    }

    public void setDirector(String s){
        if(!s.equals(director)){
            director = s;
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

    public double getRuntimeMinutes(){
        return runtimeMinutes;
    }

    public void setRuntimeMinutes(double s){
        if(s != runtimeMinutes){
            runtimeMinutes = s;
        }
    }

    @Override
    public String summary(){
        String s = "";

        s = "Movie" + "," + id + "," + title + "," + director + "," + year + "," + runtimeMinutes;

        return s;
    }
}

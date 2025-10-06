public class Movie extends MediaItem {
    protected String director;
    protected int year;
    protected double runtimeMinutes;

    /*
    Movie constructor
     */
    Movie(){
        super();
        director = "";
        year = 0;
        runtimeMinutes = 0.0;
    }


    //getters and setters for director year and runtime minutes

    /*
    getter for director
     */
    public String getDirector(){
        return director;
    }

    /*
    setter for director
     */
    public void setDirector(String s){
        if(!s.equals(director)){
            director = s;
        }
    }

    /*
    getter for year
     */
    public int getYear(){
        return year;
    }

    /*
    setter for year
     */
    public void setYear(int s){
        if(s != year){
            year = s;
        }
    }

    /*
    getter for RuntimeMinutes
     */
    public double getRuntimeMinutes(){
        return runtimeMinutes;
    }

    /*
   setter for RuntimeMinutes
    */
    public void setRuntimeMinutes(double s){
        if(s != runtimeMinutes){
            runtimeMinutes = s;
        }
    }

    /*
    toString method
     */
    @Override
    public String summary(){
        String s = "";

        s = "Movie" + "," + id + "," + title + "," + director + "," + year + "," + runtimeMinutes;

        return s;
    }
}

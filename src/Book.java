public class Book extends MediaItem {
    protected String author;
    protected int year;
    protected int pageCount;

    /**
    Constructor for book
     */
    Book(){
        super();
        author = "";
        year = 0;
        pageCount = 0;
    }

    //getter and setters for author, year, page count

    /**
     getter for author
     */
    public String getAuthor(){
        return author;
    }

    /**
     setter for author
     */
    public void setAuthor(String s){
        if(s != author){
            author = s;
        }
    }

    /**
     * getter for year
     */
    public int getYear(){
        return year;
    }

    /**
     *  setter for year
     * @param s
     */
    public void setYear(int s){
        if(s != year){
            year = s;
        }
    }

    /**
     * getter for pageCount
     * @return
     */
    public int getPageCount(){
        return pageCount;
    }

    /**
     * setter for pageCount
     * @param s
     */
    public void setPageCount(int s){
        if(s != pageCount && s >= 0){
            pageCount = s;
        }
    }

    /**
     * toString method
     * @return
     */
    @Override
    public String summary(){
        String s = "";

        s = "Book" + "," + id + "," + title + "," + author + "," + year + "," + pageCount;

        return s;
    }
}

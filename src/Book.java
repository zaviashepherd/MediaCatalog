public class Book extends MediaItem {
    protected String author;
    protected int year;
    protected int pageCount;

    Book(){
        super();
        author = "";
        year = 0;
        pageCount = 0;
    }

    //getter and setters for author, year, page count

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String s){
        if(s != author){
            author = s;
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

    public int getPageCount(){
        return pageCount;
    }

    public void setPageCount(int s){
        if(s != pageCount && s >= 0){
            pageCount = s;
        }
    }

    @Override
    public String summary(){
        String s = "";

        s = "Book" + "," + id + "," + title + "," + author + "," + year + "," + pageCount;

        return s;
    }
}

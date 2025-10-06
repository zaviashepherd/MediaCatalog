public class MediaItem {
    protected String id;
    protected String title;

    /*
    constructor for MediaItem
     */
    MediaItem(){
        String id = "";
        String title = "";
    }

    //getters and setters for Id and Title
/*
getter for id
 */
    public String getId(){
        return id;
    }

    /*
    setter for id
     */
    public void setId(String n){
        if (n != id){
            id = n;
        }
    }

    /*
    getter for title
     */
    public String getTitle(){
        return title;
    }

    /*
    setter for title
     */
    public void setTitle(String s){
        if(s != title){
            title = s;
        }
    }

    /*
    toString method
     */
    public String summary(){
        String s = "";

        return s;
    }

}

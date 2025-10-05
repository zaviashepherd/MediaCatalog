public class MediaItem {
    protected String id;
    protected String title;

    MediaItem(){
        String id = "";
        String title = "";
    }

    //getters and setters for Id and Title

    public String getId(){
        return id;
    }

    public void setId(String n){
        if (n != id){
            id = n;
        }
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String s){
        if(s != title){
            title = s;
        }
    }

    public String summary(){
        String s = "";

        return s;
    }

}

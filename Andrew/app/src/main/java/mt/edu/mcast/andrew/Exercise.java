package mt.edu.mcast.andrew;

public class Exercise {

    public String title;
    public String description;
    public int imageResId;

    public Exercise(String title, String description, int imageResId){
        this.title = title;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return  description;
    }

    public int getImageResId(){
        return imageResId;
    }
}

package encapsulation;

public class Movie {

    public String title ;
    public String rating;


    public String getTitle() {
    	
    	return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getRating() {
    	
    	return rating;
    }
    public void setRating(String rt) {
    	
    		rating = rt.toUpperCase().trim();
    }


}
	

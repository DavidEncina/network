import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed

{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;
    private ArrayList<JoinGroupPost> groupPosts;    

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        messages = new ArrayList<>();
        photos = new ArrayList<>();
        groupPosts = new ArrayList<>();
    }

    /**
     * Add a post with a message
     * 
     * @message the message to introduce
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    /**
     * Add a post with a image
     * 
     * @message the image to introduce
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }
    
    /**
     * Añade un group post
     */
    public void addPhotoPost(JoinGroupPost groupPost)
    {
        groupPosts.add(groupPost);
    }
    
    /**
     * Show the post
     */
    public void show(){
        for(MessagePost message : messages){
            message.display();
        }
        for(PhotoPost photo : photos){
            photo.display();
        }
        for(JoinGroupPost groupPost : groupPosts){
            groupPost.display();
        }
    }
}
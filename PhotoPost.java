
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends PostCommented
{
    private String filename;
    private String caption;

    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost(String author, String comentario,String filename, String caption)
    {
       super(author, comentario);
       this.filename = filename;
       this.caption = caption;
    }

    /**
     * Meotdo que devuelve el nombre del archivo
     */
    public String getImageFile(){
        return filename;
    }
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getCaption(){
        return caption;
    }
}
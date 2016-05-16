import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost extends PostCommented
{
    private String message;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String author, String comentario, String text)
    {
       super(author, comentario);
       this.message = text;
    }

    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getText(){
        return message;
    }
    
    /**
     * Imprime el autor del mensage
     */
    public void printShortSummary()
    {
        System.out.println("Esto es un post de texto creado por " + getAuthor());
    }
}
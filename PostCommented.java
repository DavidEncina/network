import java.util.ArrayList;

/**
 * Write a description of class PostCommented here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PostCommented extends Post
{
    // Almacena el comentario del post
    private String comentario;
    // Almacena una coleccion de comentarios
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class CommentedPost
     */
    public PostCommented(String author, String comentario)
    {
        super(author);
        this.comentario = comentario;
        comments = new ArrayList<>();
    }

    /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        comments.add(text);
    }
}

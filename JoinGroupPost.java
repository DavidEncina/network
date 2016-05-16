
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    // Almacena el grupo al que se une el usuario
    private String nombreGrupo;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String username, String nombreGrupo)
    {
        super(username);
        this.nombreGrupo = nombreGrupo;
    }

    /**
     * Devuelve el nombre del grupo del usuario
     */
    public String getNombreGrupo()
    {
        return nombreGrupo;
    }
}

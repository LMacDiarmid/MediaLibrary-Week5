package mediaLibrary;
import java.lang.invoke.VarHandle;
import java.util.Vector;

/**
 * <h1> Media abstract class</h1>
 * <p> The classes ImageMedia and AudioMedia inherit from this class </p>
 * <br>
 *
 */
public abstract class Media
{
    private String mName;
    private String mDescription;
    Vector<String> mCategories = new Vector<String>();



    /**
     * <h1> MediaLibrary.Media constructor</h1>
     * takes in two parameters and sets the two member variables with its parameters
     *
     * @param name - name
     * @param description -description
     */
    public Media(String name, String description)
    {
        set_mName(name);
        set_mDescription(description);


    }


    /**
     * <h1> mName Setter</h1>
     * @param name - sets mName with parameter name
     */
    public void set_mName(String name)
    {

        this.mName = name;
    }

    /**
     * <h1>mDescription Setter</h1>
     * @param description - sets mDescription with parameter
     */
    public void set_mDescription(String description)
    {
        this.mDescription = description;
    }


    /**
     * <h1>mName Getter</h1>
     * @return mName is returned
     */
    public String get_mName()
    {
        return mName;
    }

    /**
     * <h1> mDescription Getter</h1>
     * @return mDescription is returned
     */
    public String get_mDescription()
    {
        return mDescription;
    }

    /**
     * <h1> addCategory abstract method</h1>
     * <p> this method needs to be defined by each inherited class</p>
     * @param category - the category to be added
     * @return a boolean
     */
    public abstract boolean addCategory(String category);


    /**
     * <h1>getCategories</h1>
     * <p> adds each of the categories stored in mCategories into the
     * <br>passed parameter vectorParam</p>
     * @param vectorParam - passed vector
     * @return the vector
     */
    public Vector getCategories(Vector vectorParam)
    {
        for (int i = 0; i < mCategories.size(); i++)
        {
            vectorParam.add(mCategories.indexOf(i));
        }
        return vectorParam;
    }

}



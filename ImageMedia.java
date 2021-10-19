package mediaLibrary;

/**
 * <h1> ImageMedia </h1>
 * <p> description </p>
 *
 * @author Leanne
 * @since 15/10/2021
 */
public class ImageMedia extends Media
{
    private String mFilePath;
    final String[] imageCategories = {"Portrait","Landscape","Abstract"};

    /**
     * <h1>ImageMedia constructor</h1>
     * <p> the constructor for ImageMedia</p>
     * <br>
     * <p> Takes in three parameters: name, description and filepath
     * <br>The super class is then called and the inherited parameters needed are passed in
     * <br>filepath is sent to the filepath setter</p>
     * @param name - name of media
     * @param description - description of media
     * @param filepath - filepath for media
     */
    public ImageMedia(String name, String description, String filepath)
    {
        super(name, description);
        set_mFilePath(filepath);
    }

    /**
     * <h1>mFilePath setter</h1>
     * @param mFilePath - the media filepath
     */
    public void set_mFilePath(String mFilePath) {
        this.mFilePath = mFilePath;
    }

    /**
     * <h1>mFilePath getter</h1>
     * @return mFilePath
     */
    public String get_mFilePath() {
        return mFilePath;
    }

    public boolean addCategory(String category)
    {
        for (int i = 0; i < imageCategories.length; i++ )
        {
            if(category == imageCategories[i])
            {
                mCategories.add(category);
                return true;
            }
        }
        return false;

    }
}

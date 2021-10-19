package mediaLibrary;

/**
 * <h1> AudioMedia </h1>
 * <p> description </p>
 *
 * @author Leanne
 * @since 15/10/2021
 */
public class AudioMedia extends Media
{
    private String mFilePath;
    final String[] AudioCategories ={"Music","Book","FX"};

    /**
     * <h1>AudioMedia constructor</h1>
     * <p> the constructor for AudioMedia</p>
     * <br>
     * <p> Takes in three parameters: name, description and filepath
     * <br>The super class is then called and the inherited parameters needed are passed in
     * <br>filepath is sent to the filepath setter</p>
     * @param name - name of media
     * @param description - description of media
     * @param filepath - filepath for media
     */
    public AudioMedia(String name, String description, String filepath)
    {
        super(name,description);
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
        for(int i = 0; i < AudioCategories.length;i++)
        {
            if(category == AudioCategories[i])
            {
                mCategories.add(category);
                return true;
            }
        }
        return false;

    }

}

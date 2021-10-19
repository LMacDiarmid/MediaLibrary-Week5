package mediaLibrary;

import java.util.Comparator;

public class NameSorter implements Comparator<Media>
{
    @Override
    public int compare(Media mName1, Media mName2)
    {
        return mName1.get_mName().compareToIgnoreCase(mName2.get_mName());
    }


}

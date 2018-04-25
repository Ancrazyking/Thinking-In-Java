package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * @author Ancrazyking
 * @date 2018/4/25 17:20
 **/
public class DirList
{
    public static void main(String[] args){
    File Path=new File("D:\\");
    String[] list=Path.list();
    for(String l:list)
    {
        System.out.println(l);
    }

    }
}
class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex){
        pattern=Pattern.compile(regex);
    }


    @Override
    public boolean accept(File dir, String name)
    {
        return false;
    }
}
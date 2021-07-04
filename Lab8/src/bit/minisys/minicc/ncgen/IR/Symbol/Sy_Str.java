package bit.minisys.minicc.ncgen.IR.Symbol;

public class Sy_Str implements Sy_Item, Sy_PolyItem
{
    String name;
    public String content;
    int char_count;

    public Sy_Str(int nameless_count, String str_content)
    {
        char_count = str_content.length();
        name = ".str." + nameless_count;
        content = str_content;
    }

    @Override
    public String GetName()
    {
        return name;
    }

    @Override
    public String GetLType()
    {
        return "i8*";
    }

    @Override
    public String GetElementPrt(String index, String base)
    {
        String type = "[" + char_count + " x " + "i8" + "]";
        return "getelementptr" + " " + type + ", " + type + "* " + "@" + name + ", " + "i32 0, i32 0";
    }
}

package bit.minisys.minicc.ncgen.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JudgeConstant
{

    public static boolean isNumeric(String str) //todo 以后再写一个浮点的
    {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches())
        {
            return false;
        }
        return true;
    }
}

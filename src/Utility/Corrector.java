package Utility;

/**
 *
 * @author Pedro
 */
public class Corrector {
    
    public static String ConvertToSQL(String date)
    {
        return date.substring(6,10) + "-" + date.substring(3,5) + "-" + date.substring(0,2);
    }
    public static String ConvertToJava(String date)
    {
        return date.substring(8,10) + "/" + date.substring(5,7) + "/" + date.substring(0,4);
    }
    
    public static void main (String args[])
    {
        System.out.println(Corrector.ConvertToJava("2018-03-27"));
    }
    
}

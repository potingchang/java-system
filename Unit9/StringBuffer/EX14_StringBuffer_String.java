
public class EX14_StringBuffer_String
{ 
    public static void main(String[] args) 
    {
        StringBuilder str1 = new StringBuilder("Java�{���y���оǽd��");
        
        String str2 = new String("Java�{���y���оǽd��");
        
        String str3 = new String(str1);
        System.out.println("StringBuffer�r�� str1   :  " + str1);
        System.out.println("String�r�� str2   :  " + str2);
        System.out.println("String�r�� str3   :  " + str3);
        System.out.println();
        
        System.out.println( "str1.equals(str2) :" + str1.equals(str2));

        System.out.println( "str1.toString().equals(str2) :" + str1.toString().equals(str2));

        System.out.println( "str3.equals(str2) :" + str3.equals(str2));
        System.out.println();
    }
}
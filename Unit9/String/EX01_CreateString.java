
public class EX01_CreateString
{ 
    public static void main(String[] args) 
    {
        //�إ߰}�C
        char[] charArray = { 'J', 'a', 'v', 'a', ' ', '2' };
        byte[] byteArray = { 74, 65, 86, 65, 32, 50 };   // J A V A   2
        StringBuffer strbuf=new StringBuffer("JSP�ʺA�����]�p");
        
        String str1 = "Java�{���]�p";
        //�ϥΫغc�إߦr�ꪫ��
        String str2 = new String("Java�{���]�p");
        String str3 = new String(charArray);         //�ϥΦr���}�C
        String str4 = new String(byteArray);         //�ϥ�byte�}�C
        String str5 = new String(strbuf);   
       
        System.out.println("String str1: " + str1);
        System.out.println();
        System.out.println("String(str2): " + str2);
        System.out.println();
        System.out.println("String(charArray): " + str3);
        System.out.println();
        System.out.println("String(charArray,1,3): " + new String(charArray,1,3));
        System.out.println();
        System.out.println("String(byteArray): " + str4);
        System.out.println();
        System.out.println("String(byteArray,2,4): " + new String(byteArray,2,4));
        System.out.println();
        System.out.println("String(StringBuffer): " + str5);
        
        /*
        String str6=strbuf.toString();  //�NStringBuffer�૬String
        
        System.out.println("String: " + str6);
        */
    }
}
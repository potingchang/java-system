
public class EX10_StringBufferCreate
{ 
    public static void main(String[] args) 
    {
        String str = "Java�{���]�p�оǽd��";
        StringBuffer str1 = new StringBuffer();   //�Ŧr��
        StringBuffer str2 = new StringBuffer(20); //�]�w�r��e�q
        StringBuffer str3 = new StringBuffer(str);
        StringBuffer str4 = new StringBuffer("Java�{���y��"); 
        
        // ��ܦr�ꤺ�e
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
        System.out.println("str4:" + str4);
        System.out.println();
        
        System.out.println("str1����/�e�q: " + str1.length() + "/" + str1.capacity());
        System.out.println("str2����/�e�q: " + str2.length() + "/" + str2.capacity());
        System.out.println("str3����/�e�q: " + str3.length() + "/" + str3.capacity());
        System.out.println("str4����/�e�q: " + str4.length() + "/" + str4.capacity());
    }
}
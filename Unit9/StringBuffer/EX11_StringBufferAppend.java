
public class EX11_StringBufferAppend
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java�{���y���оǽd��"); 
        boolean boo = true;
        char[] chary = { 'V', 'W', 'X', 'Y', 'Z' };
        byte[] byary = { 65, 66, 67, 68, 69, 70 };
        System.out.println("��l�r�� : " + str);
        System.out.println();
 System.out.println(str.length() + "/" + str.capacity());       
        //�s�W�r�ꤺ�e
        str.append(boo);  //���L��
        System.out.println("�s�W���L��   : " + str);
        str.append(chary);  //�r���}�C
        System.out.println("�s�W�r���}�C : " + str);
        str.append(chary, 2, 3);  //�r���}�C
        System.out.println("�s�W�r���}�C : " + str);
System.out.println(str.length() + "/" + str.capacity());
/*        
        System.out.println();
        str.append(byary);
        System.out.println("�s�Wbyte�}�C : " + str);
        System.out.println();
*/        
        str.append(247);     //���
        System.out.println("�s�W���     : " + str);
        str.append(234.56);  //�B�I��
        System.out.println("�s�W�B�I��   : " + str);
System.out.println(str.length() + "/" + str.capacity());        
        str.append("�о����q");
        System.out.println("�s�W�r��     : " + str);
        str.reverse();  //����
        System.out.println("����r��     : " + str);
        System.out.println(str.length() + "/" + str.capacity());
    }
}

public class EX13_StringBufferDelete
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java�{���y���оǽd��");
        System.out.println("��l�r��   :  " + str);
        System.out.println();
        //�R���r�ꤺ�e
        str.deleteCharAt(4);
        System.out.println("�R�����ޭ�4���r��      : " + str);
        System.out.println();
        str.delete(4,7);
        System.out.println("�R�����ޭ�4��6���r��   : " + str);
        System.out.println();
        //���N�r�ꤺ�e
        str.setCharAt(5,'T');
        System.out.println("���N���ޭ�5���r��      : " + str);
        System.out.println();
        str.replace(4,8,"�y���оǹ��");  
        System.out.println("���N���ޭ�4��7���r��   : " + str);
        System.out.println();
        str.setLength(0);
        System.out.println("�M���r�ꤺ�e   : " + str);
    }
}
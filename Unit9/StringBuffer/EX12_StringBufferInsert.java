
public class EX12_StringBufferInsert
{ 
    public static void main(String[] args) 
    {
        StringBuilder str = new StringBuilder("Java�{���y���оǽd��");
        boolean boo = true;
        char[] chary = { 'W', 'X', 'Y', 'Z' };
        System.out.println("��l�r�� : " + str);
        System.out.println();
        //���J�r�ꤺ�e
        str.insert(2, boo);                      //���L 
        System.out.println("���L�ȴ��J���ޭ�2   : " + str);
        str.insert(0, 'C');                       //�r�� 
        System.out.println("�r�����J���ޭ�0     : " + str);
        str.insert(2, chary);
        System.out.println("�r���}�C���J���ޭ�2 : " + str);
        str.insert(6, chary, 1, 3);           //�r���}�C 
        System.out.println("�r���}�C�����������J���ޭ�6 : " + str);
        str.insert(11, 247);                       //���
        System.out.println("��ƴ��J���ޭ�11    : " + str);
        str.insert(15, 234.56);                    //�B�I��
        System.out.println("�B�I�ƴ��J���ޭ�15  : " + str);
        str.insert(5, "�о����q");
        System.out.println("�r�괡�J���ޭ�5     : " + str);
    }
}
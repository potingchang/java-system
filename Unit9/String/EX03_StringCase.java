
public class EX03_StringCase
{ 
    public static void main(String[] args) 
    {
         String str1="Java programming language";
         String str2= new String("�{���]�p�оǽd��");
         // ��ܦr����שM�j�p�g�ഫ
         System.out.println("���ժ��^��r��: \"" + str1 + "\"");
         System.out.println("���ժ�����r��: \"" + str2 + "\"");
         System.out.println();
         System.out.println("�^��r�����: " + str1.length());
         System.out.println("����r�����: " + str2.length());
         System.out.println();
         System.out.println("�����p�g: " + str1.toLowerCase());
         System.out.println("�����j�g: " + str1.toUpperCase());
    }
}
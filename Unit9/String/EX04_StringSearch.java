
public class EX04_StringSearch
{ 
    public static void main(String[] args) 
    {
         String str1="Java 2";
         String str2= new String("�{���]�p�оǽd��");
         System.out.println("���ժ��^��r��: \"" + str1 + "\"");
         System.out.println("���ժ�����r��: \"" + str2 + "\"");
         System.out.println();
         // �j�M�r���M�l�r��
         System.out.println("�^��r��indexOf(\'a\'): " + str1.indexOf('a'));
         System.out.println("�^��r��indexOf(97): " + str1.indexOf(97));
         System.out.println("�^��r��lastIndexOf(97): " + str1.lastIndexOf(97));
         System.out.println("�^��r��indexOf(\'a\', 2): " + str1.indexOf('a', 2));
         System.out.println("�^��r��lastIndexOf(\'H\'): " + str1.lastIndexOf('H'));
         System.out.println("����r��indexOf(\"�d��\"): "+ str2.indexOf("�d��"));
         System.out.println("����r��lastIndexOf(\"�d��\"): "+ str2.lastIndexOf("�d��"));
         System.out.println("�^��r��indexOf(\"2\", 1): "+ str1.indexOf("2", 1));
         System.out.println("�^��r��lastIndexOf(\"a\", 2): "+ str1.lastIndexOf("a", 2));
         
         System.out.println("����r��startsWith(\"�d��\"): "+ str2.startsWith("�d��"));
         System.out.println("����r��startsWith(\"�d��\",6): "+ str2.startsWith("�d��",6));         
         System.out.println("����r��endsWith(\"�d��\"): "+ str2.endsWith("�d��"));
    }
}
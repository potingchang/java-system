
public class EX06_StringSplit
{ 
    public static void main(String[] args) 
    {
         String str="Java language";
         String[] str1;
         String[] str2;
         char[] ch;
         byte[] by;
         System.out.println("���ժ��^��r��: \"" + str + "\"");
         System.out.println();
         
         //���Φ��l�r��
         str1 = str.split("a");
         System.out.println();
         System.out.println("�����^��r�ꪺa:");
         for(int x=0; x<str1.length; x++)
         {
            System.out.println(str1[x]);
         } 
         System.out.println();
         
         //���Φ���r��
         str2 = str.split(" ");
         System.out.println();
         System.out.println("�����^��r�ꪺ�ť�:");
         for(int x=0; x<str2.length; x++)
         {
            System.out.println(str2[x]);
         } 
         
         //���Φ��r��
         ch = str.toCharArray();
         System.out.println();
         System.out.println("�N�^��r����Φ��r��:");
         for(int x=0; x<ch.length; x++)
         {
            System.out.print(ch[x]+"   ");
         } 
         System.out.println();
         
         //���Φ�byte
         by = str.getBytes();
         System.out.println();
         System.out.println("�N�^��r����Φ�byte:");
         for(int x=0; x<by.length; x++)
         {
            System.out.print(by[x]+"  ");
         } 
         System.out.println("\n");
         
         System.out.println("�R���r��e�᪺�ť�:");
         String s1="    abcde fghij    ";
         String s2="  abcde";
         System.out.println(s1 + s2);
         System.out.println(s1.trim() + s2.trim());
                 
    }
}
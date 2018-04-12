
public class EX05_StringSubstring
{ 
    public static void main(String[] args) 
    {
         String str1="Java language";
         String str2= new String("程式設計教學範例");
         
         System.out.println("測試的英文字串: \"" + str1 + "\"");
         System.out.println("測試的中文字串: \"" + str2 + "\"");
         System.out.println();
         //子字串和字元的處理
         System.out.println("英文字元charAt(3): " + str1.charAt(3));
         System.out.println("中文字元charAt(3): " + str2.charAt(3));
         System.out.println("英文字串substring(2): " + str1.substring(2));
         System.out.println("中文字串substring(2, 6): "+str2.substring(2, 6));
         System.out.println("取代英文字元replace('a', 'b'): " + str1.replace('a','b'));
         System.out.println("取代英文子字串replace(\"a\", \"b\"): " + str1.replace("a","b"));  
         System.out.println("取代英文子字串replace(\"a\", \"bc\"): " + str1.replace("a","bc"));  
                
         //結合兩字串
         String str3 = str1.concat(str2);
         System.out.println("結合英文字串與中文字串: " + str3);
         
         String str4 = str1+str2;
         System.out.println("結合英文字串與中文字串: " + str4);
         System.out.println();
    }
}
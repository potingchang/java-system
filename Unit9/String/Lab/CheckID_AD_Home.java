
import java.io.*;

public class CheckID_AD
{
   public static void main(String[] args) throws IOException
   {
      int c1,c2,total;
      String s;
      String chkid = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO"; 
      BufferedReader keyin = new BufferedReader(
                                 new InputStreamReader(System.in));
                                 
      c1=c2=total=0;         
      System.out.print("�п�J�����Ҧr��:");
      s = keyin.readLine();

      if(s.length()!=10)
      {
          System.err.println("���פ����T�I");
	      System.exit(0);
   	  }
   	  
      s = s.toUpperCase();
      c1 = chkid.indexOf(s.charAt(0));
      c2 = chkid.indexOf(s.charAt(1));
           
      if(c1<10)
      {
          System.err.println("���r�r�������T�I");
          System.exit(0);
      }
      
      if(c2<1 || c2>2)
      {
          System.err.println("�ʧO�椣���T�I");
          System.exit(0);
      }
      
      //�ˬd��3~��10�Ӧr�� 
         

      
      total = //���r�r�����[�v��
	  
      //total=total+��L�r�����[�v��
      
     
          
      
      if(total%10 != 0)
         System.out.println("���O�����Ҧr��");
      else
         System.out.println("�X�z�������Ҧr��");
   }       
}
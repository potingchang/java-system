
import java.io.*;
public class CheckID_Home
{
    public static void main(String[] args) throws IOException
    {
        char ch;
        int total=0,n=0;
        BufferedReader keyin;
        keyin = new BufferedReader(
                     new InputStreamReader(System.in));
        System.out.print("�п�J�����Ҧr��:");
        String s = keyin.readLine();
      
        /* �ˬd�����Ҧr������ */
        if(s.length() != 10)
        {
            System.err.println("���פ����T");
            System.exit(0);
        }      
       
        /* �ˬd�����Ҧr���ʧO�� */ 
        ch=s.charAt(1);
        if(ch<'1' || ch>'2')  //if(ch !='1' && ch !='2')
        {
            System.err.println("�ʧO�椣���T");
            System.exit(0);
        } 
        
        /* �ˬd��3~��10�Ӧr��    
         * Character���O��k isDigit() */
        for(int x=2; x<10; x++)
        {
            if(!Character.isDigit(s.charAt(x)))
            {
                System.err.println("�r�������T");
                System.exit(0);
            }
        }        
    
        s=s.toUpperCase();
        ch=s.charAt(0);      
        switch(ch)
        {
           case 'A':
             n=10;
             break;
           case 'B':
             n=11;
             break;
           case 'C':
             n=12;
             break;
           case 'D':
             n=13;
             break;
           case 'E':
             n=14;
             break;
           case 'F':
             n=15;
             break;
           case 'G':
             n=16;
             break;
           case 'H':
             n=17;
             break;
           case 'I':
             n=34;
             break;
           case 'J':
             n=18;
             break;
           case 'K':
             n=19;
             break;
           case 'L':
             n=20;
             break;
           case 'M':
             n=21;
             break;
           case 'N':
             n=22;
             break;
           case 'O':
             n=35;
             break;
           case 'P':
             n=23;
             break;
           case 'Q':
             n=24;
             break;
           case 'R':
             n=25;
             break;
           case 'S':
             n=26;
             break;
           case 'T':
             n=27;
             break;
           case 'U':
             n=28;
             break;
           case 'V':
             n=29;
             break;
           case 'W':
             n=30;
             break;
           case 'X':
             n=31;
             break;
           case 'Y':
             n=32;
             break;
           case 'Z':
             n=33;
           default:
             System.out.println("���r�r�������T");
             System.exit(0);
        }
      
        //total=���r�r�����v�� 
        total=n/10+(n%10)*9; 
        
        //total=total+��L�r�����[�v��
      
        
        if(total % 10 == 0)
            System.out.println("�O�����Ҧr��");
        else
            System.out.println("���O�����Ҧr��");
    }
}
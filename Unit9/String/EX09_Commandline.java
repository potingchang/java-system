
class Transfer
{
	float f;	
	float getC(float c)	
	{
		f = ((9 * c) / 5) + 32;	//����ন�ؤ�	
		return f;	
	}
}

public class EX09_Commandline
{
	public static void main(String[] args)
	{
		float c = Float.parseFloat(args[0]); //Ū�J�Ѽ�
		
		Transfer transfer = new Transfer();
		System.out.println(c + "�XC = " + transfer.getC(c) + "�XF");	
	}
}
public class commandsum 
{
	public static void main(String args[])
	{
		int s=0,inv=0;
		for(int i=0;i<args.length;i++)
		{
			try
			{
				s+=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)			{
				inv++;
			}
		}
		System.out.println("The sum is "+s);
		System.out.println("The number of invalid integers is "+inv);
	}
}
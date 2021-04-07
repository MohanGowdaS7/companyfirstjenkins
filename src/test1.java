public class test1
{
	public static void main(String args[])
	{
		int num=5;
		test1.printtable(num);
	}
	public static void printtable(int num)
	{
		int mul=0;
		for(int i=1;i<=10;i++)
		{
			mul=i*num;
			System.out.println(num+"*"+i+"="+mul);
		}
	}
}
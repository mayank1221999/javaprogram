package javaprogram;

public class minarray 
{

	public static void main(String[] args)
	{
		int x[]= {4,9,8,7,6,5,1};
		int min=x[0];
		int i;
		for(i=0;i<=6;i++)
		{
			if(min>x[i])
			{
				min=x[i];
			}
		}
System.out.println("minimum element is "+min);
	}

}

package javaprogram;

public class maxarray 
{

	public static void main(String[] args)
	{
		int x[]= {4,9,8,7,6,5};
		int max=x[0];
		int i;
		for(i=0;i<=5;i++)
		{
			if(max<x[i])
			{
				max=x[i];
			}
		}
System.out.println("maximum element is "+max);
	}

}

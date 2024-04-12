package javaprogram;

public class duplicatearray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,3,6};
		int i,j;
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate Element"+arr[i]);
				}
			}
		}

	}

}

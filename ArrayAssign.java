class ArrayAssign
{
	static int maxFun(int[] arr)
	{

		int max=0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	static int minFun(int[] arr)
	{

		int min=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	static int avgFun(int[] arr)
	{
		int n=arr.length;
		int avg=0;
		for (int i=0;i<n;i++)
		{
			avg+=arr[i];
		}
		return avg/n;
	}

	public static void main(String[] args)
	{
		int size=MyConsole.getNumber("Enter size of array");
		int[] values=new int[size];

			for(int i=0;i<size;i++)
			{
				values[i]=MyConsole.getNumber("Enter the Array Element");
			}

			System.out.print("The max value is "+maxFun(values));
			System.out.print("\nThe min value is "+minFun(values));
			System.out.print("\nThe avg value is "+avgFun(values));


	}
}
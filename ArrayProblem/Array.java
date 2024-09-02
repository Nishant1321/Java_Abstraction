package ArrayProblem;

public class Array {
	public static void aray(int a[])
	{
	
		int l=a.length;
		int arr[]=new int[l];
		int ct=0;
		for (int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if (a[i]!=a[j] && a[i]!=0)
				{
						ct++;
						arr[i]=a[i];
				}
				else
				{
					break;
				}
			}
		}
		if (l==arr.length)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	public static void main(String args[])
	{
		int arr[]= {1,2,3,0,0};
		aray(arr);
	}
}

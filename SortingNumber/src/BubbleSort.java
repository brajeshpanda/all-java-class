
public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] x= {5,12,3,1,78,95,23,32};
		int max;
		for(int i=0;i<x.length;i++)
		{
			int flag=0;
			for(int j=0;j<x.length-1-i;j++)
			{
				if(x[j]>x[j+1])
				{
					max=x[j];
					x[j]=x[j+1];
					x[j+1]=max;
					flag=1;
				}
				
			}
			if(flag==0)
			{
				break;
			}
			
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
	}

}

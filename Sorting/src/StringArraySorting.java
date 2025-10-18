
public class StringArraySorting
{
	public static void main(String[] args)
	{
	String[] x= {"brajesh","rajesh","mitali"};
		String max;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length-1-i;j++)
			{
				if(x[j].compareTo(x[j+1])>0)
				{
					max=x[j];
					x[j]=x[j+1];
					x[j+1]=max;
				}
				
			}
			
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
	}

}

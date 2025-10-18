
public class InsortionSort {
	public static void main(String[] args) {
		
		int[] x= {5,1,3,2,6,4,8};
		
		int temp,j;
		for(int i=1;i<x.length;i++)
		{
			temp=x[i];
			j=i;
			while(j>0 && x[j-1]>temp)
			{
				x[j]=x[j-1];
				j=j-1;
			}
			x[j]=temp;
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}

}

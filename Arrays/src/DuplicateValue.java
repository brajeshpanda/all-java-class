
public class DuplicateValue {
	public static void main(String[] args) {
		
		int [] a= {1,4,7,2,3,8,4,7,3,2,};

		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j] && i!=j)
			{
				System.out.print(a[j]+" ");
			}
			}
		}
		
	}

}

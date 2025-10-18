import java.util.HashSet;

public class DuplicateValue1 {
	public static void main(String[] args) {
		int [] a= {2,3,5,6,3,3,7,9,8,6,4,3,2};
		HashSet s= new HashSet();
		for(int no:a)
		{
			if(s.add(no)==false)
			{
				System.out.println(no);
			}
		}
		
	}

}
